package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializedemoStudent {
public static void main(String[] args) throws IOException {
	Student s = new Student();
	s.name="naveen";
	s.id=1234;
	s.age=23;
	s.address=6-54;
	FileOutputStream fos = new FileOutputStream("6-54");
	ObjectOutputStream oos= new ObjectOutputStream(fos);
	oos.writeObject(s);
	System.out.println("i wrote student address to file");
	
}
}
