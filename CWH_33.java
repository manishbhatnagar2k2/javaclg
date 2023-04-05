import java.util.Scanner;
class CWH_33
{
    static int fact(int n)
    {
          if(n==0 || n==1)
          {
            return 1;
          }
          else
          {
            return n*fact(n-1);
          }
    }
    public static void main(String ...args)
    {
        int n;
        //int n=6;
        Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
        System.out.println(fact(n));
    } 
}