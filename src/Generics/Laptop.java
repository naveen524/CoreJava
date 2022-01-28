package Generics;

public class Laptop<RAM,Charger> {
	String name;
	RAM size;
	public void setRAM(int i)
	{
		this.size=size;
	}
	public RAM getsize()
	{
		return size;
	}
	public String getCharger()
	{
		return name;
	}
	public static void main(String[] args) {
		Laptop<String, Integer> laptop= new Laptop<String,Integer>();
		laptop.setRAM(16);
		laptop.name="Hp";
		System.out.println(laptop.getCharger());
		
	}
}
