package allAssignmentIFElse;

import java.util.Scanner;

public class AssignmentFunctions {

	//# 5) Any integer is input through the keyboard. Write a program to find out
	// whether it is an odd number or even number.

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter number:");
//		int num=sc.nextInt();
//		evenodd(num);
//	}
//	public static void evenodd(int num) {	
//		if(num%2==0) {
//			System.out.println("Print even number");
//    	}else {
//		System.out.println("Print odd number");
//		}
//	
//		
//	}
//
//}

//# 6) Any year is input through the keyboard. Write a program to determine
// whether the year is a leap year or not.
// # (Hint: Use the % (modulus) operator)
//     public static void main(String[] arg) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter year:");
//		int yr=sc.nextInt();
//		leapyear(yr);
//     }
//		public static void leapyear(int yr) {
//		if((yr % 4 == 0) && (yr % 100 != 0) || (yr%400==0)) {
//		System.out.println("leap year");
//		}else {
//		System.out.println("Not leap year");
//		}
//		}
//     }


	// TODO Auto-generated method stub
	
	// # 4) If cost price and selling price of an item is input through the
	// keyboard, write a program to determine whether the seller has
	// # made profit or incurred loss. Also determine how much profit he made or
	// loss he incurred.

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cost price:");
		float cost=sc.nextFloat();
		System.out.println("Enter selling price:");
		float sell=sc.nextFloat();
		costsell(cost,sell);		
		
	}
	public static void costsell(float cost,float sell) {
		if (sell>cost) {
			float totprofit =sell-cost;
			System.out.println("Print total profit:" +totprofit); ;
		}else if(cost>sell) {
			float totprofit=cost-sell;
			System.out.println("Print total loss:" +totprofit);;
		}else {
			System.out.println("No profit no loss");
		}  
	}
}

// 8) A five-digit number is entered through the keyboard. Write a program to
// obtain the reverse
	//Method1:done
//		public static void main(String[] args) {
//			
//			Scanner sc=new Scanner(System.in);
//			System.out.println("Enter number:");
//			int num=sc.nextInt();
//			reverse(num);
//		}
//		public static void reverse(int num) {	
//		int reverse=0; 
//		while(num!=0) {
//		int digit = num % 10;
//		reverse = reverse * 10 + digit;
//		num =num/10;
//		}
//		System.out.println("Reverse no is " +reverse);
//	}
//}