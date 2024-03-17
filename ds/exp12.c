#include <stdio.h>
#include <stdlib.h>
struct Node{
    int data;
    struct Node* link;
};
struct Node *front = NULL;
struct Graph{
    int nvertices;
    struct Node** adjList;
};
struct Graph* graph;
struct Node* newNode(int value,struct Node* link){
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    temp->data = value;
    temp->link = link;
    return temp;
}
void enqueue(int value){
    if(front == NULL){
        front = newNode(value,NULL);
        return;
    }
    struct Node* temp = front;
    while(temp->link != NULL){
        temp = temp->link;
    }
    temp->link = newNode(value,NULL);
}
int dequeue(){
    int value = front->data;
    struct Node* temp = front;
    front = front->link;
    free(temp);
    return value;
}
void createGraph(int n){
    graph = (struct Graph*)malloc(sizeof(struct Graph));
    graph->nvertices = n;
    graph->adjList = (struct Node**)malloc(n*sizeof(struct Node*));
    for(int i = 0;i < n;i++) {
        graph->adjList[i] = NULL;
    }
}
void addEdge(int src,int dest){
    graph->adjList[src] = newNode(dest,graph->adjList[src]);
    graph->adjList[dest] = newNode(src,graph->adjList[dest]);
}
void BFS(int begin){
    int* visited = (int*)malloc(graph->nvertices*sizeof(int));
    for(int i = 0;i < graph->nvertices;i++) visited[i] = 0;
    enqueue(begin);
    while(front != NULL){
        int vertex = dequeue();
        if(!visited[vertex]){
            visited[vertex] = 1;
            printf("%d ",vertex);
            struct Node* temp = graph->adjList[vertex];
            while(temp != NULL){
                if(!visited[temp->data]) enqueue(temp->data);
                temp = temp->link;
            }
        }
    }
    printf("\n");
}
void main(){
    int nv, option, e, v;
    printf("Enter no of vertices: ");
    scanf("%d",&nv);
    createGraph(nv);
    while(1){
        printf("1: Add edge\n2: BFS traversal\n3: Exit\nEnter an option: ");
        scanf("%d",&option);
        if(option == 1){
            printf("Enter vertices to map: ");
            scanf("%d%d",&e,&v);
            addEdge(e,v);
        }else if(option == 2){
            printf("Enter starting vertex: ");
            scanf("%d",&v);
            BFS(v);
        }else if(option == 3){
            break;
        }else{
            printf("invalid option\n");
        }
    }
}