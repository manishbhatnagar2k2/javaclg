abstract class Person{
    abstract void eat();
}
public class TwentyFiveAnonymous{
    public static void main(String ...args){
        Person p=new Person(){
             void eat(){
                System.out.println("eat");
            }
        };
        p.eat();
    }
}