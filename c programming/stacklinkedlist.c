#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node*next;
}*top=NULL,*temp;
void main()
{
    push();
     pop();
    peek();
    display();
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
void display()
{
    temp=top;
    if(top!=NULL)
    {
        while(temp!=NULL)
        {
        printf("%d\n",temp->data);
        temp=temp->next;
        }
    }
    else{
        printf("overflow");
    }
}
void pop()
{
top=top->next;
}
void peek()
{
    temp=top;
    if(temp->next=NULL)
    {
        printf("%d",temp->data);
    }
}
