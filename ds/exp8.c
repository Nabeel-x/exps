#include<stdio.h>
#include<stdlib.h>

struct node{
	int data;
	struct node *link;
	
};
struct node *front;


struct node* newnode(int data,struct node *link)
{
	struct node *temp;
	temp=(struct node*)malloc(sizeof(struct node));
	temp->data=data;
	temp->link=link;
	return temp;
}
void freelist()
{
	struct node *current,*next;
	current=front;
	while(current!=NULL)
	{
		next=current->link;
		free(current);
		current=next;
	}
}

void enqueue()
{
	int num;
	printf("enter a number: ");
	scanf("%d",&num);
	
	if(front!=NULL)
	{
		struct node *temp=front;
		while(temp->link!=NULL)
		{
			temp=temp->link;
		}
		temp->link=newnode(num,NULL);
	}
	else
		front=newnode(num,NULL);
		
}
void dequeue()
{
	if(front!=NULL)
	{
		printf("dequeueed %d \n",front->data);
		struct node *temp=front;
		front=front->link;
		free(temp);
	}
	else
		printf("queue underflow!! \n");
}
void peep()
{
	if(front!=NULL)
		printf("peeped %d \n",front->data);
	else
		printf("queue underflow!! \n");
}

void display()
{
	if(front!=NULL)
	{
		printf("displaying..\n");
		struct node *temp;
		temp=front;
		while(temp!=NULL)
		{
			printf("%d\n",temp->data);
			temp=temp->link;
		}
		
	}
	else
		printf("queue underflow!! \n");
}

void main()
{
	int option;
	
	do
	{
		printf(" 1.enqueue \n 2.dequeue \n 3.peep \n 4.display \n 5.exit \n enter a option: ");
		scanf("%d",&option);
		switch(option)
		{
			case 1:
				enqueue();
				break;
			case 2:
				dequeue();
				break;
			case 3:
				peep();
				break;
			case 4:
				display();
				break;
			case 5:
				break;
			default:
				printf("invalid option \n");		
		}
		
	}while(option!=5);
	freelist();
}