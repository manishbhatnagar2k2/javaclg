class Thread
{
    public void run()
    {
        System.out.println("Hello");
    }
    /**
     * @param args
     */
    public static void main(String ... args)
    {
        Thread t=new Thread();
          t.start();
    }
}