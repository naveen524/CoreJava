
//10.	Write a Java program to find the second most frequent character in a given string.
//Sample Output:
//The given string is: successes
//The second most frequent char in the string is: c

package Java;

import java.util.Scanner;

public class Assignment10 {
	public static void main(String[] args) {
		String str="success";
		int[] freq= new int[str.length()];
		int i,j;
		char String[] =str.toCharArray();
		for(i=0;i<str.length();i++)
		{
			freq[i]=1;
			for(j=i+1;j<str.length();j++)
			{
				if(String[i]==String[j]) {
					freq[j]='0';
				}
			}
		}
		System.out.println("second most frequency character is: ");
		for(i=2;i<freq.length;i++)
		{
			if(String[i]!=' '&& String[i]!='0')
				System.out.println(String[i]+" "+freq[i]);
		}
	}
}