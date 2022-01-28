package Java;

import java.util.Scanner;

public class OddEven {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter num:");
int num=sc.nextInt();
if(num%2==0)
{
	System.out.println("enterd num is evennum:");
}
else
{
	System.out.println("enterd num is oddnum:");
}

}
}

