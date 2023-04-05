import java.util.Queue;
import java.util.Comparator;
import java.util.PriorityQueue;

class LearnPriorityQueue
{
    public static void main(String ... args)
    {
        Queue<Integer> Pqueue = new PriorityQueue<>();
       // Queue<Integer> Pqueue = new PriorityQueue<>(Comparator.reverseOrder());   //This is used to print max ele first using comparator

        Pqueue.offer(40);
        Pqueue.offer(12);
        Pqueue.offer(16);
        Pqueue.offer(24);

        System.out.println(Pqueue);
        Pqueue.poll();
        System.out.println(Pqueue);
        System.out.println(Pqueue.peek());
    }
}