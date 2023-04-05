class Multi2 extends Thread
{
    public void run()
    {
        System.out.println("Thread is running");
    }
    public static void main(String ...args)
    {
        Multi2 m=new Multi2();
        m.start();
    }
}