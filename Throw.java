class Throw
{
	static void fun() throws IllegalAccessException
	{
		try
		{
			throw new NullPointerException("demo");
		}
		catch(IllegalAccessException e)
		{
			System.out.println("Caught inside fun().");
            System.out.println("Inside fun(). ");
            throw new IllegalAccessException("demo");
			throw e; // rethrowing the exception
		}
	}
	public static void main(String args[])
	{
		try
		{
			fun();
		}
		catch(IllegalAccessExceptioneption e)
		{
			System.out.println("Caught in main.");
		}
	}
}
// Java program to demonstrate working of throws
