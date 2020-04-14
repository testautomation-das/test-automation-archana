package allAssignmentIFElse;

import java.util.Scanner;

public class Assignment2IFElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// # 2) The marks obtained by a student in 5 different subjects are input
				// through the keyboard. The student gets a
				// # division as per the following rules: Percentage above or equal to 60 -
				// First division
				// # Percentage between 50 and 59 - Second division
				// # Percentage between 40 and 49 - Third division
				// # Percentage less than 40 - Fail
				// # Write a program to calculate the division obtained by the student
				
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sub1:");
		int sub1=sc.nextInt();
		System.out.println("Enter sub2:");
		int sub2=sc.nextInt();
		System.out.println("Enter sub3:");
		int sub3=sc.nextInt();
		System.out.println("Enter sub4:");
		int sub4=sc.nextInt();
		System.out.println("Enter sub5:");
		int sub5=sc.nextInt();
		int total=sub1+sub2+sub3+sub4+sub5;
		System.out.println("total :" +total);
		int percent=total*100/500;
		if(percent>=60) {
			System.out.println("First division");
			
		}else if(percent>50 &&percent<60) {
			System.out.println("second division");
			
		}else if(percent>40 && percent<50) {
			System.out.println("Third division");
			}else {
				System.out.println("fail");
			}
	}
}

		
				




				
				
	