package Exceptions;

public class AgeValidator {
	void CheckAge(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Please enter valid age");
		}
		else
		{
			System.out.println("welcome to vote:");
		}
	}
	public static void main(String[] args) {
		AgeValidator av= new AgeValidator();
		try {
			av.CheckAge(20);
		} catch (InvalidAgeException e) {
			System.out.println(e);
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		try {
			av.CheckAge(16);
		} catch (InvalidAgeException e) {
			System.out.println(e);
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}
}
