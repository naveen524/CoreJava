package JavaBasics;


public class Compare_Strings {
	public static void main(Test_Strings[] args) {
		String s1= new String("java");	
		String s2= new String("python");
		String s3= new String("c#");
		String s4= new String("java");
		System.out.println("comparing"+" "+s1+" "+"and"+" "+s2+":"+"strings"+":"+s1.equals(s2));
		System.out.println("comparing"+" "+s2+" "+"and"+" "+s3+":"+"strings"+":"+s2.equals(s3));
		System.out.println("comparing"+" "+s3+" "+"and"+" "+s4+":"+"strings"+":"+s3.equals(s4));
		System.out.println("comparing"+" "+s4+" "+"and"+" "+s1+":"+"strings"+":"+s4.equals(s1));

	}
}
