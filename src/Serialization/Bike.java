package Serialization;

public class Bike implements java.io.Serializable {
	public String name;
	public int price;
    public transient String Company;
    public void checkSpeed()
    {
    System.out.println("checking speed"+" "+name+"  "+price);

}
}