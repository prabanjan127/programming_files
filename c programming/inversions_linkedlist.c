#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node*next;
}*head,*temp,*temp1;
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
}
void display()
{
    int count=0;
    temp=head;

        while(temp!=NULL)
    {
        temp1=temp;
        while(temp1!=NULL)
        {
            if((temp->data)>(temp1->data))
            {
                count++;
            }
            temp1=temp1->next;
        }
        temp=temp->next;
    }
    printf("%d",count);
}


