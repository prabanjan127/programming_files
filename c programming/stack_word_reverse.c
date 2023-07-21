#include<stdio.h>
#include<stdlib.h>
struct node
{
    char* data;
    struct node*next;
}*top=NULL,*temp;
void main()
{
    char a[100];
    scanf("%[^\n]%*c",&a);
    char* s = strtok(a," ");
    while(s!=NULL)
    {
        push(s);
        s=strtok(NULL," ");
    }
    display();

}
void push(char word[])
{

    struct node*newnode = (struct node*)malloc(sizeof(struct node));
    newnode->data=word;
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

void display()
{
    temp=top;

    if(top!=NULL)
    {
        while(temp!=NULL)
        {
        printf("%s\n",temp->data);
        temp=temp->next;
        }
    }
    else{
        printf("overflow");
    }
}
void reverse()
{
    temp=top;
    char* a=strtok(temp->data," ");
    while(a!=NULL)
    {
        printf("%s ",a);
        a=strtok(NULL," ");
    }
}
