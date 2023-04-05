class Multithreading2 extends Thread
{
    synchronized public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Thread 2");
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println("Thread 2 interrupted");
            }
        }
    }
}
// public void run()
// {

//     Multithreading2 t1=new Multithreading2();
//     Multithreading2 t2=new Multithreading2();
//     t1.start();
//     t2.start();
// }
