#include<stdlib.h>
#include<stdio.h>
struct node{
int data;
struct node*next;
}*front,*rear,*temp;
void main()
{

    int option;
    while(1)
    {
        printf("\n 1.enqueue\n");
        printf("\n 2.dequeue\n");
        printf("\n 3.display\n");
        scanf("%d",&option);
        switch(option)
        {
            case 1 : enqueue();
            break;
            case 2 : dequeue();
            break;
            case 3 : display();
            break;
            default:break;
        }
    }
}


void enqueue()
{
    int n;
    printf("enter the size: ");
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        struct node*newnode = (struct node*)malloc(sizeof(struct node));
        printf("enter the data: ");
        scanf("%d",&newnode->data);
        if(front==NULL)
        {
            front = newnode;
            rear= newnode;
            temp=newnode;
        }
        else
        {
            rear->next=newnode;
            rear=newnode;
            rear->next=NULL;
            //temp->next=newnode;
           // temp=temp->next;
        }
    }
}
