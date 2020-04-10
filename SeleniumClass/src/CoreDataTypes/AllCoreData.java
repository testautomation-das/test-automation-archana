package CoreDataTypes;

import java.util.Scanner;

public class AllCoreData {
//001
		  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Print hello into console
		System.out.println("Hello");
		
		//Enter through keyboard use scanner class
       Scanner userinput=new Scanner(System.in);
       
       //Enter string from keyboard
		System.out.println("Enter name:");
		String myString=userinput.next();
		System.out.println("Welcome to java selenium world " + myString);
		
		//Enter integer from keyboard
		System.out.println("Enter integer:");
		int myInt=userinput.nextInt();
		System.out.println("Value is " +myInt);
		
		//Enter float from keyboard
		System.out.println("Enter float:");
		float myFloat=userinput.nextFloat();
		System.out.println("float vaue is " +myFloat);
		
		//Enter double from keyboard
		System.out.println("Enter double");
		double myDouble=userinput.nextDouble();
		System.out.println("Double vaue is " +myDouble);
		
		System.out.println("Enter boolean");
		boolean myBoolean=userinput.hasNext();
		System.out.println("Boolean value is " +myBoolean );
		
	}
	

}
