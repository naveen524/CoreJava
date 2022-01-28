//ArrayList
package Collections;
public class Employee {
private String name="naveen";
private int id=123;
private double salary=10.00;
public int getid()
{
	return id;
}
public void setname()
{
	this.name=name;
}
public String getname()
{
	return name;
}
public void setsalary()
{
	this.salary=salary;
}
public double getsalary()
{
	return salary;
}
public Employee(String name,double salary,int id)
{
	this.name=name;
	this.salary=salary;
	this.id=id;
}
}
