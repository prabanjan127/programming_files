#include<stdio.h>
#include<stdlib.h>
void create();
void display();
void swapeven();
struct node
{
    int data;
    struct node*next;
}*head,*temp;
void main()
{
int option;
while(1)
{
printf("\n 1.create\n");
printf("\n 2.display\n");
printf("\n 3.swapeven\n");
scanf("%d",&option);
printf("************************\n");

switch(option)
{
    case 1 : create();
    break;
    case 2 : display();
    break;
    case 3 : swapeven();
    break;
    default : break;
}
}

}
void create()
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
        if(head==NULL)
        {
            head=newnode;
            temp=newnode;
        }
        else
        {
            temp->next=newnode;
            temp=temp->next;
        }
    }
}
void swapeven(int n)
{
int k=0;
int j=0,q=0;
while(n--)
{
    temp=head;
    while(temp->next!=NULL)
    {
        q=temp->data;
        j=temp->next->data;
        if((q%2==0)&&(j%2==0)&&(q<j))
        {

            k=temp->data;
            temp->data=temp->next->data;
            temp->next->data=k;
            n=1;
        }
        temp=temp->next;
    }
}
}
void display()
{
    temp=head;
    while(temp!=NULL)
    {
        printf("%d\n",temp->data);
        temp=temp->next;
    }
}
