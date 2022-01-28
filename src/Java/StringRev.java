package Java;

public class StringRev {
public static void main(String[] args) {
	String name="naveen";
	int length=name.length()-1;
	String rev="";
	for(int i=name.length()-1;i>=0;i--)
	{
		rev=rev+name.charAt(i);
	}
	System.out.println("rev"+"  "+"of"+"    "+name+"  "+"is"+"   "+"  "+rev);
}
}
