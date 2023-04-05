import java.util.TreeSet;
import java.util.Set;

class LearnTreeSet
{
    public static void main(String ... args)
    {
        Set<Integer> Lset =new TreeSet<>();
        Lset.add(12);
        Lset.add(25);
        Lset.add(14);
        Lset.add(5);
        Lset.add(16);

        System.out.println(Lset);
        Lset.remove(54);
        System.out.println(Lset);

       // set.contains(54);
        System.out.println(Lset.contains(54));
        System.out.println(Lset.isEmpty());

        System.out.println(Lset.size());

        Lset.clear();
        System.out.println(Lset);
    }
    }