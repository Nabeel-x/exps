#include<stdio.h>
#include<stdlib.h>

struct node{
	int data;
	struct node *link;
	
};
struct node *top;


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
	current=top;
	while(current!=NULL)
	{
		next=current->link;
		free(current);
		current=next;
	}
}

void push()
{
	struct node *ptr;
	int num;
	printf("enter a number: ");
	scanf("%d",&num);
	ptr=newnode(num,top);
	top=ptr;
}
void pop()
{
	if(top!=NULL)
	{
		printf("poped %d \n",top->data);
		struct node *temp=top;
		top=top->link;
		free(temp);
	}
	else
		printf("stack underflow!! \n");
}
void peep()
{
	if(top!=NULL)
		printf("peeped %d \n",top->data);
	else
		printf("stack underflow!! \n");
}
void display()
{
	if(top!=NULL)
	{
		printf("displaying..");
		struct node *temp;
		temp=top;
		while(temp!=NULL)
		{
			printf("%d\n",temp->data);
			temp=temp->link;
		}
	}
	else
		printf("stack underflow!! \n");
}

void main()
{
	int option;
	
	do
	{
		printf(" 1.push \n 2.pop \n 3.peep \n 4.display \n 5.exit \n enter a option: ");
		scanf("%d",&option);
		switch(option)
		{
			case 1:
				push();
				break;
			case 2:
				pop();
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