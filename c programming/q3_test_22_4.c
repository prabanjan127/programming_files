#include <stdio.h>

int primeno(int, int);

int main()
{
    int n, a;
    scanf("%d", &n);
    a = primeno(n, n / 2);
    if (a == 1)
    {
        printf("%d is a prime number\n", n);
    }
    else
    {
        printf("%d is not a prime number\n", n);
    }
    return 0;
}

int primeno(int n, int i)
{
    if (i == 1)
    {
        return 1;
    }
    else
    {
       if (n % i == 0)
       {
         return 0;
       }
       else
       {
         return primeno(n, i - 1);
       }
    }
}
