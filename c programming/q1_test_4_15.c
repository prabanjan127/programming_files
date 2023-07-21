#include<stdio.h>
void main()
{
    char s[10],goal[10];
    char *temp;
    scanf("%s",&s);
    int a=strlen(s);
    scanf("%s",&goal);
    for(int i=0;i<a;i++)
    {
        if(s[i]!=s[i+1])
        {
               temp=s[i];
               s[i]=s[i+1];
               s[i+1]=temp;
        }
       }
        printf("%s",s);
    }

