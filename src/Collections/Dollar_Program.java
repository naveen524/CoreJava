package Collections;

import java.text.DecimalFormat;

public class Dollar_Program {
public static void main(String[] args) {
	double amount=80000.00;
	String currentformatter= new DecimalFormat("#").format(amount);
	System.out.println("After removing zero:-"+currentformatter);
	
}
}
