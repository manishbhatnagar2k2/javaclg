import java.util.*;
class Prime
{
    public static void main(String ... args)
    {
        Scanner sc = new Scanner(System.in);
        int i,m=0,flag=0;
        int n=sc.nextInt();
        m=n/2;
        for(i=2;i<n;i++)
        {   
            if(n%i ==0)
            {
                System.out.println("not prime");
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Prime");
        }
    }
}