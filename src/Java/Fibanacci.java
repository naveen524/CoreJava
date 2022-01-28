package Java;

public class Fibanacci {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c;
		System.out.println(a+"  "+b);
		for(int i=0;i<=5;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}

	}
}
