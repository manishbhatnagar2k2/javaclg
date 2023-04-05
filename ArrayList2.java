import java.util.ArrayList;
import java.util.Iterator;
class ArrayList2 {
    public static void main(String... args) {
        ArrayList<Integer> List = new ArrayList();

        List.add(10);
        List.add(20);
        List.add(30);
        List.add(40);
        List.add(50);
        List.add(60);

        System.out.println(List);
        // List.remove(1);
        // System.out.println(List);
        // List.remove(Integer.valueOf(30));

        // System.out.println(List);

        // List.clear();
        // System.out.println(List);

        // List.set(1, 40);
        // System.out.println(List);
        // System.out.println(List.contains(50));

        for (int i = 0; i < List.size(); i++) {
            System.out.println("THE element is " + List.get(i));
        }

        for (Integer elements : List) {
            System.out.println("Foreach element is " + elements);
        }

        Iterator<Integer> it = List.iterator();
        while(it.hasNext()){
            System.out.println("Iterator "  + it.next());
        }
    }
}
