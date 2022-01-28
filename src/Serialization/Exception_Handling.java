package Serialization;

public class Exception_Handling {
	public static void main(String args[])
	 {
	try
	{
	System.out.print("A");
	throw new NullPointerException ("Hello");
	 }
	 catch(ArithmeticException e)
	 {
	 System.out.print("B");
	 }
	 }
}
