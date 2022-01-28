package Java;

public class SingleLevelInheritance {
void drive()
{
	System.out.println("father knows driving:");
}
void teachLessons()
{
	System.out.println("father knows teaching lessons");
}
public class Son extends Father
{
	public static void main(String[] args) {
		Son s = new Son();
		
	}
}
}
