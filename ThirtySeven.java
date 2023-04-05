public class ThirtySeven extends Thread
{
    public void run()
    {
        System.out.println("Running Thread name is :"+Thread.currentThread().getName());
        System.out.println("Running Thread Priority is :"+Thread.currentThread().getPriority());
    }
    public static void main(String ...args)
    {
        ThirtySeven t1=new ThirtySeven();
        ThirtySeven t2=new ThirtySeven();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(7);
        t1.start();
        t2.start();
    }
}