#include<stdio.h>
#include<stdlib.h>
void create();
void display();
void display1();
void reverse();
struct node
{
    int data;
    struct node*next;
}*head,*temp,*prev,*cur,*nex;
void main()
{
    int option;
    while(1)
    {
        printf("\n 1.create\n");
        printf("\n 2.display\n");
        printf("\n 3.display1\n");
        printf("\n 4. reverse\n");
        scanf("%d",&option);
        switch(option)
        {
            case 1 : create();
            break;
            case 2 : display();
            break;
            case 3 : display1();
            break;
            case 4 : reverse();
            break;
        }
    }
}
void create()
{
    int n;
    printf("enter the no of ele: ");
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
void display()
{
    temp=head;
    while(temp!=NULL)
    {
        printf("%d\n",temp->data);
        temp=temp->next;
    }
}

void display1()
{
    temp=head;
    int count=0;
    while(temp!=NULL)
    {
        temp=temp->next;
        count++;
    }
    printf("%d",count);
}
void reverse()
{
 prev = NULL;
 cur = head;
 while(cur!=NULL)
 {
     nex = cur->next;
     cur->next=prev;
     prev = cur;
     cur = nex;
 }
 head=prev;
}
