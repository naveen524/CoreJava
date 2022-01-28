//1.	Write a Java program to get the character at the given index within the String.
//Original String = Java Exercises!                                                                             
//The character at position 0 is J                                                                              
//The character at position 10 is i


package Java;
public class Assignment1 {
public static void main(String[] args) {
	 String str = "Java Excercises!";
	 System.out.println("original string"+"  "+str);
		int index1=str.charAt(0);
		int index2=str.charAt(10);
		System.out.println("the char position of 0 is:"+(char)index1);
		System.out.println("the char position of 10 is:"+(char)index2);
	 }
}

