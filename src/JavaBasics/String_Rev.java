package JavaBasics;

public class String_Rev {
public static void main(String[] args) {
	String name="naveen manneela";
	int length=name.length();
	String rev="";
	for(int i=name.length()-1;i>=0;i--)
	{
		rev=rev+name.charAt(i);
	}
	System.out.println("rev of"+" "+name+" "+"is"+" "+rev);
}
}
