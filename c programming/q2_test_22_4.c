#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    recursion(n);
}
int recursion(int n)
{
    int i=0,a[100];
    a[i]=n%2;
    n=n/2;
    return recursion(a-1);
}
