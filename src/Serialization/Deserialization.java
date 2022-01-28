package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	FileInputStream fis = new FileInputStream("bike.txt");
	ObjectInputStream obj2= new ObjectInputStream(fis);
	Bike bike=(Bike)obj2.readObject();
	System.out.println(bike.name);
	System.out.println(bike.price);
	System.out.println(bike.Company);
	
}
}
