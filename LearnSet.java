// import java.util.*;
import java.util.HashSet;
import java.util.Set;

class LearnSet
{
    public static void main(String ... args)
    {
        Set<Integer> set = new HashSet<>();

        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
        set.add(65);

        System.out.println(set);

        set.remove(54);
        System.out.println(set);

       // set.contains(54);
        System.out.println(set.contains(54));
        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();
        System.out.println(set);
    }
}