package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SerializationDemo {
public static void main(String[] args) throws IOException {
	Bike bike = new Bike();
	String filename="bike.txt";
	bike.name="FZ-S";
	bike.price=150000;
	bike.Company="Yamaha";
	FileOutputStream fos= new FileOutputStream("bike.txt");
	ObjectOutputStream obj1 = new ObjectOutputStream(fos);
	obj1.writeObject(bike);
	System.out.println(" check the speed of the bike:");
}
}