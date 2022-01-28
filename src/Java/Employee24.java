//Hierachy inheritance
package Java;
public class Employee24 extends Company{
		public static void main(String[] args) {
			Employee24 e = new Employee24();
			e.provideSalary();
			e.giveTraining();
			e.giveTraining();
			HrManager hm= new HrManager();
			hm.hireEmployee();
			hm.giveTraining();
			Company c= new Company();
			c.giveTraining();
			c.provideSalary();
			
		}
}
