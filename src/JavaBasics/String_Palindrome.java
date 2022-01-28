package JavaBasics;

public class String_Palindrome {
public static void main(String[] args) {
	String name="madam";
	int length=name.length();
	String rev="";
	for(int i=name.length()-1;i>=0;i--)
	{
		rev=rev+name.charAt(i);
	}
	if(name.equals(rev))
	{
		System.out.println("given string is palindrome:");
	}
	else
	{
		System.out.println("given string is not palindrome:");
	}
}
}
