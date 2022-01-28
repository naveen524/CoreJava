package Switch_Statements;

public class Test_Switch1 {
	public static void main(String[] args) {
		String name = "naveen";

		switch(name) {
		case "Naveen" :
			System.out.println("Innocent"); 
			break;
		case "Baby" :
		//case "C" :
			System.out.println("Well done");
			break;
		case "Naresh" :
			System.out.println("You passed");
			break;
		case "Prince" :
			System.out.println("Better try again");
			break;
		default :
			System.out.println("Invalid grade");
		}
		System.out.println("Your name is " + name);
	}
}
