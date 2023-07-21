#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node*next;
}*head,*temp,*prev,*cur;
void main()
{
    int option;
    while(1)
    {
        printf("\n 1.create\n");
        printf("\n 2.display\n");
        printf("\n 3.alternate\n");
        scanf("%d",&option);
        switch(option)
        {
            case 1 : create();
            break;
            case 2 : display();
            break;
            case 3 : alternate();
            break;
        }
    }
}
void create()
{
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        struct node*newnode=(struct node*)malloc(sizeof(struct node));
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
void display()
{
    temp=head;
    while(temp!=NULL)
    {
        printf("%d\n",temp->data);
        temp=temp->next;
    }
}
void alternate()
{
    prev=head;
    cur=head->next;
    while(prev!=NULL && cur!=NULL)
    {
        prev->next=cur->next;
        free(cur);
        prev=prev->next;
        if(prev!=NULL)
        {
            cur=prev->next;
        }
    }
}
