public class ExceptionM
// {
//     /**
//      * @param args
//      */
//     public static void main(String ...args)
//     {
//         try
//         {
//             int a=10/0;
//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println(e);
//         }
//          System.out.println("Program executed successfully");
//     }
// }

// {
//     public static void main(String ...args)
//     {
//         int i=30;
//         int j=0;
//         int data;
//         try
//         {
//             data=i/j;
//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println(e);
//         }
//         System.out.println(i/(j+2));
//     }
// }

{
    public static void main(String ...args)
    {
        try{
            int a[]=new int[5];
            a[5]=10/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Out Of Bounds Exception");
        }
        catch(Exception e)
        {
            System.out.println("Exception Occured");
        }
            System.out.println("Finally");
        }
    }