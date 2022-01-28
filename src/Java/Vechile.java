//Polymorphism:

//Defenation:Performing same operation in multiples ways known as polymorphism.

//they are two types of polymorphism

//a)Compile-time polymorphism(C.T.P)
//-->CTP is an examples of mothod overloading.

//b)Runtime-Polymorphism(R.T.P)
//-->RTP is an example of method overriding.

//Real-Time Example Of Compile-Time-Polymorphism:(Method overloading)

//Def:a class contains n-number of methods with the same name,but different in signature know as method overloading.//




package Java;

public class Vechile
{
	void Bike()
	{
		System.out.println("Here is the bike");

	}

	void Bike(String name)
	{
		System.out.println("the name of the bike is:"+"  "+name);
	}
	void Bike(String name,int Price)
	{
		System.out.println("the name of the bike is"+"  "+name+"the price of bike is"+"  "+"price");
	}
	void Bike(String name,int price,double speed)
	{
		System.out.println("the name of the bike is"+"  "+name+"the price of bike is"+"  "+price+"the speed of the bike is:"+"  "+speed);
	}
	public static void main(String[] args) {
		Vechile v= new Vechile();
		v.Bike();
		v.Bike("fz");
		v.Bike("KTM", 150000);
		v.Bike("R15", 200000, 135.00);

	}
}