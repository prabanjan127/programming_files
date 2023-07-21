#include<stdio.h>
#include<stdlib.h>
struct node
{
  int data;
  struct node*next;
}*head,*temp,*tail;
void main()
{
  create();
  display();
  printf("%d",tail->data);
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
    tail=newnode;
  }
  else
  {
    temp->next=newnode;
    temp=temp->next;
    tail=newnode;

  }
  }

}

void display()
{
  temp=head;
  while(temp->next!=NULL)
  {
    if(temp->data==temp->next->data)
    {
        if(temp->next->data==temp->next->next->data)
        {

      temp=temp->next;
        }
    }
    else
    {
      printf("%d ",temp->data);
      temp=temp->next;
    }
  }


}





