package Exceptions;

public class TestUnchecked1 {
public static void main(String[] args) {
	int array[] = new int[3];
	array[0]=1;
	array[1]=2;
	array[2]=3;
	array[3]=4;
	array[4]=5;
	array[5]=6;
	array[6]=7;
	for(int i=0;i<array.length;i++)
	{
		char[] c = null;
		System.out.println(c);
	}
}
}
