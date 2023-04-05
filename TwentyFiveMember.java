public class TwentyFiveLocal
{
    private int a=20, b=34;
    public void method()
    {
        class inner
        {
            public void sum()
            {
                System.out.println(a+b);
            }
        }
        inner i=new inner();
        i.sum();
    }
    public static void main(String ...args)
    {
        TwentyFiveLocal t=new TwentyFiveLocal();
        t.method();
    }
}
