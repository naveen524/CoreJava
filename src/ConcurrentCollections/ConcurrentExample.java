package ConcurrentCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentExample {
	public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<String>();
        list.add("Naveen");
        list.add("Naresh");
        list.add("Prince");
        list.add("Spyder");
        list.add("James");
        
        // get the iterator
        Iterator<String> itr = list.iterator();
        
        //manipulate list while iterating
        while(itr.hasNext()){
            System.out.println("list is:"+list);
            String str = itr.next();
            System.out.println(str);
            if(str.equals("Naresh"))list.remove("James");
            if(str.equals("Prince"))list.add("Prince found");
            //below code don't throw ConcurrentModificationException
            //because it doesn't change modCount variable of list
            if(str.equals("Spyder")) list.set(1, "Spyder");
        }
    }
}

