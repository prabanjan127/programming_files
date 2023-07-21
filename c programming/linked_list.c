#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node*next;
}*head,*temp;
void main()
{
    int n;
    printf("enter the size ");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        struct node*newnode = (struct node*)malloc(sizeof(struct node));
        printf("Enter the Data:");
        scanf("%d",&newnode->data);
        newnode->next=NULL;
        if(head==NULL){
            head=newnode;
            temp=newnode;
        }
        else{
            temp->next=newnode;
            temp=temp->next;
        }

    }

        display();
        insertatbeginning();
        display();
        insertatend();
        display();

}
void insertatbeginning()
{
    struct node*newnode1 = (struct node*)malloc(sizeof(struct node));
    printf("enter the value");
    scanf("%d",&newnode1->data);
    newnode1->next=head;
    head=newnode1;

}
void insertatend()
{
    struct node*newnode2 = (struct node*)malloc(sizeof(struct node));
    printf("enter the value");
    scanf("%d",&newnode2->data);
    newnode2->next=NULL;
    temp=head;
    while(temp->next!=NULL)
    {
        temp=temp->next;
    }
     temp->next=newnode2;
}
// //deletion at front
// void deleteAtFront()
// {
// temp=head;
// head=head->next;
// temp->next=NULL;

//   display();
// }


// //deletion at end
// void deleteAtEnd()
// {
//     temp=head;
//     while(temp->next!=tail)
//     {
//         temp=temp->next;
//     }
//     temp->next=NULL;
//     tail=temp;
//     display();
// }

// //deletion at middle
// void deleteAtMiddle()
// {
//     int i,pos;
//     scanf("%d",&pos);
//     temp=head;
//     for(i=0;i<pos-1;i++)
//     temp=temp->next;
//     temp->next=temp->next->next;
//     display();
// }

void display()
{
    temp=head;
    while(temp!=NULL)
    {
        printf("%d\n",temp->data);
        temp=temp->next;
    }
}


