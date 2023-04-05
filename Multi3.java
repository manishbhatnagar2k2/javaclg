class Multi3 implements Runnable
{
    public void run()
    {
        System.out.println("Hello");
    }
    public static void main(String ...args)
    {
        Multi3 m = new Multi3();
        Thread t = new Thread(m);
        t.start();
    }
}