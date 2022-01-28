package Generics;

import java.util.ArrayList;
import java.util.List;

public class Student<name,age,phonenum> {
	public static void main(String[] args) {
		String name;
		int age;
		int phonenum;
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Naveen");
		System.out.println(al1);
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(23);
		System.out.println(al2);
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.add(524);
		System.out.println(al3);

	}
}
