#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node *right, *left;
};
struct node * newNode(int value){
    struct node *temp = (struct node *)malloc(sizeof(struct node));
    temp->data = value;
    temp->right = temp->left = NULL;
}
struct node * insert(struct node * root,int value){
    if(root == NULL) return newNode(value);
    if(value > root->data) root->right = insert(root->right,value);
    if(value < root->data) root->left = insert(root->left,value);
    return root;
}
struct node* inorder(struct node * root){
    if(root == NULL) return NULL;
    inorder(root->left);
    printf("%d\t",root->data);
    inorder(root->right);
}
struct node* preorder(struct node* root){
    if(root == NULL) return NULL;
    printf("%d\t",root->data);
    preorder(root->left);
    preorder(root->right);
}
struct node* postorder(struct node* root){
    if(root == NULL) return NULL;
    postorder(root->left);
    postorder(root->right);
    printf("%d\t",root->data);
}

// void main(){
//     struct node* root = NULL;
//     root = insert(root,3);
//     root = insert(root,2);
//     root = insert(root,4);
//     inorder(root);
//     printf("\n");
//     preorder(root);
//     printf("\n");
//     postorder(root);
//     printf("\n");
// }

void main(){
    int option,value;
    struct node* root = NULL;
    do{
        printf("1: Insert\n2: Inorder traversal\n3: Preorder traversal\n4: Postorder traversal\n5:Exit\nEnter a number: ");
        scanf("%d",&option);
        switch (option)
        {
        case 1:
            printf("Enter a value:: ");
            scanf("%d",&value);
            root = insert(root,value);
            break;
        case 2:
            printf("inorder: \n");
            inorder(root);
            printf("\n");
            break;
        case 3:
            printf("preorder: \n");
            preorder(root);
            printf("\n");
            break;
        case 4:
            printf("postorder: \n");
            postorder(root);
            printf("\n");
            break;
        case 5:
            break;
        default:
            printf("Invalid option\n");
            break;
        }
    }while(option != 5);
}