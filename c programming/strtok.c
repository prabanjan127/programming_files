#include<stdio.h>
void main()
{
    char str[50]="hello world hi";
    char* s= strtok(str," ");
    while(s!=NULL)
    {
        printf("%s ",s);
        s=strtok(NULL," ");
    }
    scanf("%[^\n]%*c",&newnode->data);
}
