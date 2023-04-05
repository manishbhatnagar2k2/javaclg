import java.util.HashSet;
import java.util.Set;
public class LeSet{

    public static void main(String ... args)
    {
        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Manish", 2));
        studentSet.add(new Student("Nikhil", 4));
        studentSet.add(new Student("Manya", 5));
        System.out.println(studentSet);
    }
}