#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node *left,*right;
};
struct node* newNode(int value){
    struct node *temp = (struct node*)malloc(sizeof(struct node));
    temp->data = value;
    temp->left = temp->right = NULL;
    return temp;
}
struct node* insert(struct node* root,int value){
    if(root == NULL) return newNode(value);
    if(value > root->data) root->right = insert(root->right,value);
    if(value < root->data) root->left = insert(root->left,value);
    return root;
}
int search(struct node* root,int value){
    if(root == NULL) return 0;
    if(value == root->data) return 1;
    if(value > root->data) return search(root->right,value);
    return search(root->left,value);
}
struct node* largest(struct node* root){
    if(root == NULL) return NULL;
    if(root->right == NULL) return root;
    return largest(root->right);
}
struct node* delete(struct node* root, int value) {
    if(root == NULL) return root;
    if(value > root->data) root->right = delete(root->right, value);
    else if(value < root->data) root->left = delete(root->left, value);
    else {
        if(root->right == NULL) {
            struct node* temp = root->left;
            free(root);
            return temp;
        }
        if(root->left == NULL) {
            struct node* temp = root->right;
            free(root);
            return temp;
        }
        struct node* temp = largest(root->left);
        root->data = temp->data;
        root->left = delete(root->left, temp->data);
    }
    return root;
}


void main(){
    struct node *root = NULL,*lar;
    int option, value;
    do{
        printf("1: insert\n2: search\n3: largest\n4: delete\n5: exit\nEnter option:");
        scanf("%d",&option);
        switch(option)
        {
        case 1:
            printf("Enter a value: ");
            scanf("%d",&value);
            root = insert(root,value);
            break;
        case 2:
            printf("Enter a value: ");
            scanf("%d",&value);
            if(search(root,value)) printf("value found\n");
            else printf("value not found\n");
            break;
        case 3:
            lar = largest(root);
            if(lar != NULL) printf("Largest = %d\n",lar->data);
            else printf("Empty Tree\n");
            break;
        case 4:
            printf("Enter a value: ");
            scanf("%d",&value);
            root = delete(root,value);
            break;
        case 5:
            printf("Exiting: ");
            break;
        default:
            printf("Invalid option\n");
            break;
        }
    }while(option != 5);
}