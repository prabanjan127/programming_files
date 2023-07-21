#include<stdio.h>
#include<stdlib.h>
void push();
void display();
void max_no();
void sort();
struct node
{
    int data;
    struct node*next;
}*top=NULL,*temp;
void main()
{
    while(1)
    {
        int option;
        printf("\n 1.push\n");
        printf("\n 2.display\n");
        printf("\n 3.max_no");
        printf("\n 4.sort\n");
        scanf("%d",&option);
        switch(option)
        {
            case 1: push();
            break;
            case 2: display();
            break;
            case 3 : max_no();
            break;
            case 4: sort();
            break;
            default:break;
        }
    }
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
        else
        {
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
    else
    {
        printf("overflow");
    }
}

void max_no()
{
    temp=top;

    if(top!=NULL)
    {
        while(temp!=NULL)
        {
            if(temp->data>temp->next->data)
            {
                temp->next->data=temp->data;
                printf("%d",temp->data);
            }
             temp=temp->next;
        }
    }
}
void sort()
{
    temp=top;
    int c;
    int a=temp->data;
    int b=temp->next->data;
    if(top!=NULL)
    {
        while(temp!=NULL)
        {
            if(a>b)
            {
                c=a;
                a=b;
                b=c;
                printf("%d",c);
                temp=temp->next;
            }

        }
    }
}
