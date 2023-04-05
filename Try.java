class Try
 {
  public static void main(String ...args) 
  {
    try
     {
      int divideByZero = 7 / 0;
    }
    catch (ArithmeticException e)
     {
      System.out.println("ArithmeticException => " + e.getMessage());
    }
    finally
     {
      System.out.println("This is the finally block");
    }
  }
}