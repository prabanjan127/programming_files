#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next,*prev,*child;
}*temp,*head,*tail,*prev,*temp1=NULL;

struct node *create(int arr[],int a)
{
    head=NULL;
    for(int i=0;i<a;i++)
    {
             struct node*new=(struct node*)malloc(sizeof(struct node));

            new->data=arr[i];
            if(head==NULL)
            {
                new->next=NULL;
                head=new;
                tail=head;
                prev=NULL;

            }
            else
            {
                new->prev=tail;
                tail->next=new;
                new->next=NULL;
                tail=new;

            }
    }
    return head;
}

void display(struct node * dum){
     temp=dum;
     while (temp!=NULL)
     {
        printf("%d",temp->data);
        temp=temp->next;
     }
}

int main(){
  int a1,a2,a3;
    int arr1[10];
    int arr2[10];
    int arr3[10];
    printf("Enter size of 1st array :");
    scanf("%d",&a1);
    for(int i=0;i<a1;i++)
    {
        scanf("%d",&arr1[i]);
    }
    printf("Enter size of 2nd array :");
    scanf("%d",&a2);
    for(int i=0;i<a2;i++)
    {
        scanf("%d",&arr2[i]);
    }
    printf("Enter size of 3rd array :");
    scanf("%d",&a3);
    for(int i=0;i<a3;i++)
    {
        scanf("%d",&arr3[i]);
    }

    struct node * head1=create(arr1,a1);
    struct node * head2=create(arr2,a2);
    struct node * head3=create(arr3,a3);
    display(head1);
    printf("\n");
    display(head2);
    printf("\n");
    display(head3);
}
