#include<stdio.h>

struct employee
{
    int emp_no;
    char emp_name[10];
    int emp_salary;
};
void main()
{
    struct employee e[10];
    for(int i=0;i<3;i++)
    {
        scanf("%d %s %d",&e[i].emp_no,&e[i].emp_name,&e[i].emp_salary);
    }
    for(int i=0;i<3;i++)
    {
        if(e[i].emp_salary>2000)
        {
            printf("%d %s %d\n",e[i].emp_no,e[i].emp_name,e[i].emp_salary);
        }
    }
}
