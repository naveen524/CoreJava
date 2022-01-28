package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDemoVij {
	public static void main(String [] args) throws Exception {
	      EmployeeViji emp = new EmployeeViji();
	      emp.name = "Arti";
	      emp.address = "Satara";
	      emp.number = 1;
	      emp.SSN = 112233;
	      
	      FileOutputStream fi = new FileOutputStream("/tmp/emp.ser");
	      ObjectOutputStream out = new ObjectOutputStream(fi);
	      out.writeObject(emp);
	      System.out.println("I wrote the emp object to the file");
	      
	   }
}
