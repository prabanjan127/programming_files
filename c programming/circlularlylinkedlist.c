#include<stdio.h>
#include<stdlib.h>
void create();
void display();
void insertfront();
void insertend();
void insertmid();
void deletefront();
void deleteend();
int pos;
struct node
{
    int data;
    struct node*next;
}*head,*temp,*tail;
void main()
{
int option;
while(1)
{
printf("\n *******circularly linkedlist********\n");
printf("\n 1.create\n");
printf("\n 2.display\n");
printf("\n 3.insertfront\n");
printf("\n 4.insertend\n");
printf("\n 5.insertmid\n");
printf("\n 6.deletefront\n");
printf("\n 7.deleteend\n");
scanf("%d",&option);
printf("************************\n");

switch(option)
{
    case 1 : create();
    break;
    case 2 : display();
    break;
    case 3 : insertfront();
    break;
    case 4 : insertend();
    break;
    case 5 : insertmid();
    break;
    case 6 : deletefront();
    break;
    case 7 : deleteend();
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
            tail=newnode;
        }
        else
        {
            temp->next=newnode;
            temp=temp->next;
            temp=newnode;
            tail=newnode;
            tail->next=head;
        }
    }
}
void display()
{
temp=head;
while(temp->next!=head)
{
    printf("%d",temp->data);
    temp=temp->next;
}
printf("%d",temp->data);
}
void insertfront()
{
    struct node*newnode1=(struct node*)malloc(sizeof(struct node));
    printf("enter the data: ");
    scanf("%d",&newnode1->data);
    newnode1->next=head;
    head=newnode1;
}
    void insertend()
    {
        struct node*newnode2 = (struct node*)malloc(sizeof(struct node));
        printf("enter the data: ");
        scanf("%d",&newnode2->data);
        newnode2->next=NULL;
        tail->next=newnode2;
        tail=newnode2;
        tail->next=head;
    }
    void insertmid()
    {
    struct node*newnode3 = (struct node*)malloc(sizeof(struct node));
    printf("enter the pos: ");
    scanf("%d",&pos);
    printf("enter the data: ");
    scanf("%d",&newnode3->data);
    temp=head;
    for(int i=0;i<pos-1;i++)
    {
        temp=temp->next;
    }
    newnode3->next=temp->next;
    temp->next=newnode3;
    temp=newnode3;
    tail->next=head;
    }
    void deletefront()
    {

    head=head->next;
    tail->next=head;
    }
    void deleteend()
    {
    temp=head;
    if(temp->next->next=head)
    {
    head;
    }
    }


