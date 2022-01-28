package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
	List<String> al= new CopyOnWriteArrayList<String>();
   al.add("one");
   al.add("two");
   al.add("three");
   al.add("four");
   al.add("five");
   System.out.println("list before modification:"+ al);
   //modify the list
   Iterator<String> itr=al.iterator();
   while (itr.hasNext()) {
	   String value=itr.next();
	   //add six to list
	   al.add("six");
	   //remove
	   al.remove("one");
}
   
   System.out.println("list after modification:"+ al);
}
}
