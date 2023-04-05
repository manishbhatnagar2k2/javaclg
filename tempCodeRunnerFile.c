// #include<stdio.h>

// int main()
// {
//     int a[5]={-1,2,4,0,-3};
//     int i,sum=0,tmp;
//     for(i=0;i<5;i++)
//     {
//         if(a[i]>0)
//         {
//            sum=sum + a[i];
//             printf("%d ",sum);
//         }
//         else
//         {
//             printf(" ");
//         }
//     }
//     return 0;
// }

#include<stdio.h>

int main()
{
    int a[5]={-1,2,4,0,-3};
    int i,sum=0;
    for(i=0;i<5;i++)
    {
        if(a[i]>0)
        {

        sum=sum+a[i];
        
        }
        else
        {
            printf(" ");
        }
    }printf("%d ",sum);
    return 0;
}