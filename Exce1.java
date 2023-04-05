class MyException extends Exception {
	public MyException(String s)
	{
		// Call constructor of parent Exception
		super(s);
	}
}
public class Exce1 {
	public static void main(String args[])
	{
		try {
			// Throw an object of user defined exception
			throw new MyException("Manish");
		}
		catch (MyException ex) {
			System.out.println("Caught");

			// Print the message from MyException object
			System.out.println(ex.getMessage());
		}
	}
}
