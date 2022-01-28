package Serialization;

public class Student {
public String name;
public int age;
public int id;
public transient int address;
public void ageCheck()
{
	System.out.println("check age"+" "+name+" "+id);
}
}
