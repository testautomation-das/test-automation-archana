package allAssignmentIFElse;

import java.util.Scanner;

public class Assignment3IFElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// # 3) A company insures its drivers in the following cases:
		// # If the driver is married.
		// # If the driver is unmarried, male & above 30 years of age.(
		// martialstatus==unmarid && age>30, sex==male)
		// # If the driver is unmarried, female & above 25 years of age.
		// # In all other cases the driver is not insured. If the marital status, sex
		// and age of the driver are the inputs, write a program to determine
		// # whether the driver is to be insured or not.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter maritial status:");
		String marsta=sc.next();
		System.out.println("Enter age:");
		int age=sc.nextInt();
		System.out.println("Enter sex:");
		String sex=sc.next();
		
		//String driver=marsta.toString();
		//System.out.println("print driver :"+driver);
		//if(driver.equals(marsta)&& age<30 && sex=="male") {
		if(marsta.equals("married")) {
              System.out.println("married insured");
	}else if(sex.equals("male")&& age>30) {
		System.out.println("male_unmarried insured");
		}else if(sex.equals("female")&& age>25) {
//(marsta.equals("unmarried")&&age>25&&sex=="female") {
			System.out.println("female insured");
		}else {
			System.out.println("Not insured");
		}


}
}