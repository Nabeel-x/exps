#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node *link;
};

struct node *head = NULL;

void freeList() {
    struct node* current = head;
    struct node* next;

    while (current != NULL) {
        next = current->link;
        free(current);
        current = next;
    }
    return;
}

struct node* newNode(int value,struct node* connect){
    struct node *temp;
    temp = (struct node *)malloc(sizeof(struct node));
    temp->data = value;
    temp->link = connect;
    return temp;
}

void traverse(){
    struct node* ptr = head;
    while(ptr != NULL){
        printf("%d ",ptr->data);
        ptr = ptr->link;
    }
    printf("\n");
}


void insertFront(int value){
    struct node *temp = newNode(value,head);
    head = temp;
}

void insert(int prevalue,int value){
    struct node *ptr;
    ptr = head;
    while(ptr->data != prevalue){
        ptr = ptr->link;
    }
    ptr->link = newNode(value,ptr->link);
}

void insertEnd(int value){
    struct node *temp = newNode(value,NULL), *ptr;
    if(head == NULL){
        head = temp;
        return;
    }
    ptr = head;
    while(ptr->link != NULL){
        ptr = ptr->link;
    }
    ptr->link = temp;
}

void search(int value){
    if(head == NULL) {
        printf("Empty list\n");
        return;
    }
    struct node *ptr = head;
    while(ptr != NULL){
        if(ptr->data == value){
            printf("Memory locatiion = %p\n",ptr);
            return;
        }else{
             ptr = ptr->link;
        }
    }
    if (ptr == NULL) printf("value not found\n");
    return;
}

void deleteFront(){
    if(head == NULL){
        printf("Underflow\n");
        return;
    }
    struct node *ptr = head;
    head = ptr->link;
    free(ptr);
}

void delete(int prevalue){
    if(head == NULL){
        printf("Underflow\n");
        return;
    }
    struct node *ptr,*preptr,*temp;
    preptr = head;
    ptr = preptr->link;
    while(preptr->data != prevalue){
        preptr = ptr;
        ptr = ptr->link;
    }
    temp = ptr;
    preptr->link = ptr->link;
    free(temp);
}

void deleteEnd(){
    if(head == NULL){
        printf("Underflow\n");
        return;
    }
    struct node *ptr, *preptr;
    if(head->link == NULL){
        free(head);
        head = NULL;
        return;
    }
    preptr = head;
    ptr = preptr->link;
    while(ptr->link != NULL){
        preptr = ptr;
        ptr = ptr->link;
    }
    preptr->link = NULL;
    free(ptr);
}

void main(){
    int option, prenum, num;
    do{
        printf("Enter an option:\n1: Insert at Front\n2: Insert after a value: \n3: Insert at End \n4: Delete from Front \n5: Delete after a value \n6: Delete from end \n7: Search\n8: Traverse\n9: Exit\n");
        scanf("%d",&option);
        switch(option){
            case 1:
                printf("Enter a value: ");
                scanf("%d",&num);
                insertFront(num);
                break;
            case 2:
                printf("Enter the node value before the new node: ");
                scanf("%d",&prenum);
                printf("Enter a value: ");
                scanf("%d",&num);
                insert(prenum,num);
                break;
            case 3:
                printf("Enter a value: ");
                scanf("%d",&num);
                insertEnd(num);
                break;
            case 4:
                deleteFront();
                break;
            case 5:
                printf("Enter the value before the node to be deleted: ");
                scanf("%d",&prenum);
                delete(prenum);
                break;
            case 6:
                deleteEnd();
                break;
            case 7:
                printf("Enter a value to search: ");
                scanf("%d",&num);
                search(num);
                break;
            case 8:
                traverse();
                break;
            case 9:
                printf("Exiting...\n");
                break;
            default:
                printf("invalid option\n");
        }
    }while(option != 9);
    freeList();
}