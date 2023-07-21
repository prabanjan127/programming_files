#include<stdio.h>
#include<stdlib.h>
struct node{
int data;
struct node*next;
}*top=NULL,*temp;
void main()
{
    push();
    reverse();
}
void push()
{
    int n;
    printf("enter the size: ");
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        struct node*newnode = (struct node*)malloc(sizeof(struct node));
        printf("enter the data: ");
        scanf("%d",&newnode->data);
        newnode->next=NULL;
        if(top==NULL)
        {
            top=newnode;
        }
        else{
            newnode->next=top;
            top=newnode;
        }
    }
}
void reverse()
{
    temp=top;
    if(top==NULL)
    {

    }
}
