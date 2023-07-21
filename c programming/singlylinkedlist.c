#include<stdio.h>
#include<stdlib.h>
void create();
void display();
void insertfront();
void insertend();
void insertmid();
void deletefront();
void deleteend();
// void deletemid();
// void count();
// void search();
int pos;
struct node{
int data;
struct node *next,*prev;
}*head=NULL,*temp,*newnode,*nextnode,*tail;
int main()
{
int option;
while(1)
{
printf("\n ****************doubly inked list*****************\n");
printf("\n 1.create\n");
printf("\n 2.display\n");
printf("\n 3.insertfront\n");
printf("\n 4.insertend\n");
printf("\n 5.insertmid\n");
printf("\n 6.deletefront\n");
printf("\n 7.deleteend\n");
printf("\n 8.deletemid\n");
printf("\n 9.count\n");
printf("\n 10.search\n");
printf("\n ****************doubly inked list*****************\n");
printf("enter the case no: ");
scanf("%d",&option);
printf("***************************************************\n");
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
    // case 8 : deletemid();
    // break;
    // case 9 : count();
    // break;
    // case 10 : search();
    // break;
    default: break;
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
        struct node*newnode=(struct node*)malloc(sizeof(struct node));
        printf("enter the data: ");
        scanf("%d",&newnode->data);
         newnode->prev=NULL;
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
                newnode->prev=temp;
                temp=newnode;
                tail=newnode;
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
void insertfront()
{
struct node*newnode1=(struct node*)malloc(sizeof(struct node));
printf("enter the data1: ");
scanf("%d",&newnode1->data);
newnode1->next=head;
head->prev=newnode1;
head=newnode1;
}
void insertend()
{
    struct node*newnode2 =(struct node*)malloc(sizeof(struct node));
    printf("enter the data2: ");
    scanf("%d",&newnode2->data);
    newnode2->next=NULL;
    tail->next=newnode2;
    newnode2->prev=tail;
    tail=newnode2;
}
void insertmid()
{
    struct node*newnode3=(struct node*)malloc(sizeof(struct node));
    printf("enter the pos: ");
    scanf("%d",&pos);
    printf("enter the data3: ");
    scanf("%d",&newnode3->data);
    temp=head;
    for(int i=0;i<pos-1;i++)
    {
        temp=temp->next;
    }
    newnode3->next=temp->next;
    temp->next=newnode3;
    newnode3->prev=temp;

}
void deletefront()
{
    temp=head;
    head=head->next;
    temp->next=NULL;
    temp->prev=NULL;
}
void deleteend()
{
tail=tail->prev;
tail->next=NULL;
}
