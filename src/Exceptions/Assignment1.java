package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Assignment1 {
	public static void Assigmnet1(File file) throws IOException
	{
		RandomAccessFile input=null;
		String line=null;
		try {
			
			try {
				input=new RandomAccessFile(file, line);
			} 
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(e);
			}
			while((line=input.readLine())!=null)
			{
				System.out.println(line);
			}
			return;
		}
		finally {
			if(input!=null)
				try {
					input.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println(e);
				}
		}
}
}
