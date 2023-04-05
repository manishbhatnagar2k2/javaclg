class Multithreading2 extends Thread
{
    synchronized public void PrintTable(int n)
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(i*n);
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
public void run()
{
    PrintTable(2);
}
}
    public class ThirtySix extends Multithreading2
    {
        public static void main(String[] args)
        {
    Multithreading2 t1=new Multithreading2();
    Multithreading2 t2=new Multithreading2();
    t1.start();
    t2.start();
}
    }
