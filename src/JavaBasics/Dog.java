package JavaBasics;

public class Dog extends Animal {
void eat()
{
	System.out.println(super.name+"  "+"is"+"  "+"barking");
	super.eat();
}
public static void main(Test_Strings[] args) {
	Dog d = new Dog();
	d.eat();
}
}
