import java.util.ArrayList;

public class LearnArrayList
{
    public static void main(String ... args)
    {
        // ArrayList<String> studentsName = new ArrayList<>();
        // studentsName.add("Manish");
        // System.out.println(studentsName);


        ArrayList<Integer> List = new ArrayList();

        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        System.out.println(List);        
        List.add(5);
        System.out.println(List);

        List.add(2,7);
        System.out.println(List);

        ArrayList<Integer> newList = new ArrayList();

        newList.add(123);
        newList.add(234);

        List.addAll(newList);
        System.out.println(List);

        System.out.println(List.get(2));
    }
}