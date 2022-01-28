package Switch_Statements;

public class Test_Switch2 {
	public static void main(String[] args) {
		int age=24;
		switch (age) {
		case 1: 
			System.out.println("not eligible for vote");
			break;
		case 2 : 
			System.out.println("not eligible for vote");
			break;
		case 24 : 
			System.out.println("eligible for vote");
			break;
		case 30 : 
			System.out.println("eligible for vote");
			break;
		default : 
			System.out.println("invalid age");
			break;
		}
		System.out.println("age is"+" "+age);
	}
}
