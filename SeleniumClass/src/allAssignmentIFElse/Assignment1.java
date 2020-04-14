package allAssignmentIFElse;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * #Assignment 1 1)The current year and the year in which the employee joined
		 * the organization are entered through the keyboard. If the number of years for
		 * which the employee has # served the organization is greater than 3 then a
		 * bonus of Rs. 2500/- is given to the employee. If the years of service are not
		 * greater than 3, then the program should do nothing.
		 */

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter current year:");
		int curyr=sc.nextInt();
		System.out.println("Enter joined year:");
		int joinyr=sc.nextInt();
		int noyr=curyr-joinyr;
		System.out.println("Enter number of year:" +noyr);
		if(noyr>3) {
			System.out.println("Employee gets 2500 bonus");
		}else {
			System.out.println("the program should do nothing");
		}
		}

	}

