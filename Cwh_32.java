 class Cwh_32
// {
//     static void change(int a)
//     {
//         a=98;
//     }
//     static void telljoke()
//     {
//       System.out.println("This is a joke");
//     }
//     public static void main(String ... args)
//     {
//        // int marks[]={1,2,3,4,5};
//       //  int x=34;
//        // change(x);
//       //  System.out.println(x);
//        telljoke();
//     }
// }

{
    void foo()           //or static void foo()
    {
        System.out.println("This is a foo");
    }

    void foo(int a)         //or ststic void foo(int a)
    {
        System.out.println("This is a foo with int" + a);
    }
    public static void main(String ...args)
    {     //method overloading
        Cwh_32 c=new Cwh_32();            //no need to write this line if yoy declare the method as static
        c.foo();                          //foo()  foo(int a)
        c.foo(10);
    }
}