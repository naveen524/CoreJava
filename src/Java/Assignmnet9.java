//9.Write a Java program to find longest Palindromic Substring within a string.
//Sample Output:
//The given string is: thequickbrownfoxxofnworbquickthe
//The longest palindrome substring in the given string is; brownfoxxofnworb
//The length of the palindromic substring is: 16
package Java;
public class Assignmnet9 {
public static void main(String[] args) {
	String givenstring = "thequickbrownfoxxofnworbquickthe";
	String substring = "brownfoxxofnworb";
	int length1=givenstring.length()-1;
	int length2=substring.length()-1;
	String rev1="";
	String rev2="";
	for(int i=givenstring.length()-1;i>=0;i--)
	{
		rev1=rev1+givenstring.charAt(i);
	}
	for(int i=substring.length()-1;i>=0;i--)
	{
		rev2=rev2+substring.charAt(i);
	}
	if(givenstring.equals(rev1))
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
	if(substring.equals(rev2))
	{
		System.out.println("given string is palindome");
	}
	else
	{
		System.out.println("not palindrome");
	}
}
}
