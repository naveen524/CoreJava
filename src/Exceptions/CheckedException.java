package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
public static void main(String[] args){
	try {
		FileInputStream fis= new FileInputStream("c:abc.txt");
	} catch (FileNotFoundException e) {
		System.out.println(e);
		// TODO Auto-generated catch block
		//e.printStackTrace();
	}
	
}
}
