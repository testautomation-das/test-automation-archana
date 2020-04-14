package allAssignmentIFElse;

import java.util.Scanner;

public class Assignment4To8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// # 4) If cost price and selling price of an item is input through the
		// keyboard, write a program to determine whether the seller has
		// # made profit or incurred loss. Also determine how much profit he made or
		// loss he incurred.
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter cost price:");
//		float cost=sc.nextFloat();
//		System.out.println("Enter selling price:");
//		float sell=sc.nextFloat();
//		if (sell>cost) {
//			float totprofit=sell-cost;
//			System.out.println("Print total profit:" +totprofit);
//		}else if(cost>sell) {
//			float totprofit=cost-sell;
//			System.out.println("Print total loss:" +totprofit);
//		}else {
//			System.out.println("No profit no loss");
//		}
//		
		
		
		
		//# 5) Any integer is input through the keyboard. Write a program to find out
				// whether it is an odd number or even number.
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter integer:");
//		int num=sc.nextInt();
//		if(num%2==0) {
//			System.out.println("Print even number");
//		}else {
//			System.out.println("Print odd number");
//		}
		// # 6) Any year is input through the keyboard. Write a program to determine
				// whether the year is a leap year or not.
				// # (Hint: Use the % (modulus) operator)
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter year:");
//		int yr=sc.nextInt();
//		if((yr % 4 == 0) && (yr % 100 != 0) || (yr%400==0)) {
//			System.out.println("leap year");
//		}else {
//			System.out.println("Not leap year");
//		}
		
		// # 8) A five-digit number is entered through the keyboard. Write aprogram to
		// obtain the reverse
		int reverse=0; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		while(num!=0) {
		int digit = num % 10;
        reverse = reverse * 10 + digit;
        num =num/10;
		}
		System.out.println("Reverse no is " +reverse);
	}

}

		
		