import java.util.HashMap;
import java.util.Map;

public class LearnMap
{
    public static void main(String ... args)
    {
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        numbers.put("five", 5);
        
        // numbers.put("two", 23);  // this override 

        if(!numbers.containsKey("two"))
        {
            numbers.put("two",23);
        }

        numbers.putIfAbsent("three", 34);
        System.out.println(numbers); 
    }
}