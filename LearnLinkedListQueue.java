import java.util.LinkedList;
import java.util.Queue;

class LearnLinkedListQueue
{
    public static void main(String ... args)
    {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(13);
        queue.offer(14);
        queue.offer(15);
        queue.offer(16);

        System.out.println(queue);
       
        System.out.println(queue.poll());
    }
}