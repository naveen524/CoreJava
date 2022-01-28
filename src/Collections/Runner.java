package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

public class Runner {
	public static void main(String[] args) {
		Employee emp1= new Employee("Naveen", 150000.00, 24);
		Employee emp2= new Employee("Naveen", 150000.00, 24);
		Employee emp3= new Employee("Naveen", 150000.00, 24);
		Employee emp4= new Employee("Naresh", 160000.00, 25);
		Employee emp5= new Employee("Mahesh", 170000.00, 26);
		Employee emp6= new Employee("Prince", 180000.00, 27);
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);
		for (Employee employee1 : al) {
			System.out.println(emp1.getname()+"  "+emp1.getsalary()+"  "+emp1.getid());
			LinkedList<Employee> ll= new LinkedList<Employee>();
			ll.add(emp1);
			ll.add(emp2);
			ll.add(emp3);
			ll.add(emp4);
			for (Employee employee2 : al) {
				System.out.println(emp2.getname()+"  "+emp2.getsalary()+"  "+emp2.getid());
				Vector<Employee> v= new Vector<Employee>();
				v.add(emp1);
				v.add(emp2);
				v.add(emp3);
				v.add(emp4);
				for (Employee employee3 : al) {
					System.out.println(emp3.getname()+"  "+emp3.getsalary()+"  "+emp3.getid());
					HashSet<Employee> hs = new HashSet<Employee>();
					hs.add(emp1);
					hs.add(emp2);
					hs.add(emp3);
					hs.add(emp4);
					for (Employee employee4 : al) {
						System.out.println(emp4.getname()+"  "+emp4.getsalary()+"  "+emp4.getid());

					}

				}
			}
		}
	}
}
