import java.util.Stack;

class LearnStack
{
    public static void main(String ...args)
    {
        // Stack <String> Animal = new Stack<>();
        // Animal.push("Lion");
        // Animal.push("Monkey");
        // Animal.push("Elep");
        // Animal.push("Horse");
        // Animal.push("Cat");

        // System.out.println("Stack: " + Animal);

        // System.out.println(Animal.peek());
        // Animal.pop();
        // System.out.println("Stack " + Animal.peek());

        Stack <Integer> Count = new Stack();
        Count.push(1);
        Count.push(2);
        Count.push(3);
        Count.push(4);
        Count.push(5);
        System.out.println(Count);
        System.out.println("Stack: " + Count.peek());
        Count.pop();
        System.out.println(Count);
        System.out.println(Count.peek());
    }
}