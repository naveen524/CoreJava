package JavaBasics;

public class String_Compare {
	public static void main(Test_Strings[] args) {
		Test_Strings s1= new Test_Strings("Java");
		Test_Strings s2= new Test_Strings("Selenium");
		Test_Strings s3= new Test_Strings("Python");
		Test_Strings s4= new Test_Strings("Java");
		Test_Strings s5= new Test_Strings("Selenium");

		//comparing string s1 and string s2
		System.out.println("comparing"+" "+s1+" "+"and"+" "+s2+":"+s1.equals(s2));

		//comparing string s2 and string s3
		System.out.println("comparing"+" "+s2+" "+"and"+" "+s3+":"+s2.equals(s3));

		//comparing string s3 and string s4
		System.out.println("comparing"+" "+s3+" "+"and"+" "+s4+":"+s3.equals(s4));

		//comparing string s4 and string s5
		System.out.println("comparing"+" "+s4+" "+"and"+" "+s5+":"+s4.equals(s5));
        
		//comparing string s2 and string s5
				System.out.println("comparing"+" "+s2+" "+"and"+" "+s5+":"+s2.equals(s5));

	}	

}