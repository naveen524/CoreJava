package ConcurrentCollections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
public class ArrayListDemo {
	public static void main(String[] args) {
	List<String> list= new CopyOnWriteArrayList<String>();
	//List<String> list= new CopyOnWriteArrayList<String>();
	  
	   System.out.println("list before modification:"+ list);
	   //modify the list
	   Iterator<String> itr=list.iterator();
	   while (itr.hasNext()) {
		   String value=itr.next();
		   //add six to list
		   list.add("six");
		   //remove
   list.remove("one");
	
	   
	   System.out.println("list after modification:"+ list);
	}
}
}
