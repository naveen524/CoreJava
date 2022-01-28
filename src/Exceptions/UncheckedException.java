package Exceptions;
import java.io.FileWriter;
import java.io.IOException;
public class UncheckedException {
public static void main(String[] args) {
	
	FileWriter fw = null;
	try {
	fw=new FileWriter("c:\\CheckedException\\CheckedException.txt");
	fw.write("Hello World");
	} catch (IOException e) {
		System.out.println("please enter valid path:");
	}
	finally {
		try {
			fw.close();
		} catch (IOException e2) {
			System.out.println("Failed to close the connection manually effort is needed:");
		}
	}
}
}
