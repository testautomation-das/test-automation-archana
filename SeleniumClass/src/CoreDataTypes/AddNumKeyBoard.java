package CoreDataTypes;

import java.math.BigInteger;
import java.util.Scanner;

public class AddNumKeyBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print sum of 2 numbers and 2 strings(user input)
		Scanner userinput=new Scanner(System.in);
		System.out.println("Enter number1:");
		int myint=userinput.nextInt();
		System.out.println("Enter number2:");
		int myint1=userinput.nextInt();
		int sum=myint+myint1;
		System.out.println("print sum:" +sum);
        
	}

}
