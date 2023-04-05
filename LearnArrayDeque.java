import java.util.Queue;
import java.util.ArrayDeque;

class LearnArrayDeque
{
    public static void main(String ... args)
    {
        ArrayDeque<Integer> ADque = new ArrayDeque<>();
        ADque.offer(23);  //using this ele add in the last of the list
        ADque.offerFirst(12); // add ele in the first position means head of the list
        ADque.offerLast(45); // add ele in th last

        System.out.println(ADque);
        System.out.println("ADque " +ADque.peek());
        System.out.println("ADque " +ADque.peekLast());
        System.out.println("ADque " +ADque.peekFirst());

        System.out.println(ADque);
        // System.out.println("ADque " +ADque.poll());

        // System.out.println(ADque);

        // System.out.println("Adque " +ADque.pollFirst());

        // System.out.println(ADque);

        System.out.println("ADque " +ADque.pollLast());

        System.out.println(ADque);

        
        

    }
}