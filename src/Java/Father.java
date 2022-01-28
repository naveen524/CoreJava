package Java;

public class Father {
void readBooks()
{
	System.out.println("father is reading the book:");
}
void writeDairy()
{
	System.out.println("father have habbing of writing dairy:");
}
public class Son extends Father
{

	@Override
	void readBooks() {
		System.out.println("son have habbit of reading books");
		super.readBooks();
	}

	@Override
	void writeDairy() {
    System.out.println("son have habbit of writing dairys:");
		super.writeDairy();
	}

	public  void main(String[] args) {
		Son s = new Son();
		s.readBooks();
		s.writeDairy();
		Father f = new Father();
		f.readBooks();
		f.writeDairy();
	}
}
}
