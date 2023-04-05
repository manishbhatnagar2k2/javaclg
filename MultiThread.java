class MultiTh extends Thread
{
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            try
            {
                System.out.println(i);
                Thread.sleep(500);
            }
             catch (Exception e)
              {
                    System.out.println(e);
            }
        }
    }
}
 public class MultiThread extends MultiTh {
    public static void main(String ...args)
    {
        MultiThread t1=new MultiThread();
        MultiThread t2=new MultiThread();
        t1.start();
        t2.start();
    }
}