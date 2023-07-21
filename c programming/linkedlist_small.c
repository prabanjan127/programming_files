#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node*next;
}*head,*temp,*temp1;
void main()
{
    int n;
    printf("enter the number: ");
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
        sort();
    display();

}
  void sort()
   {

       int a;
       temp=head;
       // temp=temp->next;
       while(temp!=NULL)
       {
        struct node *temp1;
         temp1=temp->next;
           while (temp1!=NULL)
           {
               if(temp->data > temp1->data)
               {

                   a=temp->data;
                   temp->data=temp1->data;
                   temp1->data=a;
               }
 temp1=temp1->next;
           }
 temp=temp->next;
   }


   }

 void display()
    {

        temp=head;
            printf("%d\n",temp->next->data);

    }
