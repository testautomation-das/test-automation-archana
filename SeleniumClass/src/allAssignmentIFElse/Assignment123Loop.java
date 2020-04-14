package allAssignmentIFElse;

import java.util.Scanner;

public class Assignment123Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// # ***********For loop**********
		// # 1) Write a program to find the factorial value of any number entered
		// through the keyboard.
//		long fact=1;
//		Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number:");
//        long count=sc.nextLong();
//        for(int i=1;i<=count;i++) {
//        	
//        	 fact=fact*i;
//        }
//        System.out.println("Print factorial:" + fact);
		
		
		
		//# 2) Two numbers are entered through the keyboard. Write a program to find
				// the value of one number raised to the power
				// # of another.
//		long count=1;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter number1:");
//		int num=sc.nextInt();
//		System.out.println("Enter exponent");
//		int exp=sc.nextInt();
//		
//		while(exp!=0) {
//			count=count*num;
//			--exp;
//		}
//		System.out.println("print count:" +count);
		
		// # 3) Write a program to enter the numbers till the user wants and
				// # at the end it should display the count of positive, negative and
				// # zeros entered.
		int poscount=0,negcount=0,zerocount=0;
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter numbers:");
		//int num=sc.nextInt();
		System.out.println("Enter max no:");
		int max=sc.nextInt();
		int a[]=new int[max];
		for(int i=0;i<max;i++) {
			a[i]=sc.nextInt();
			}
		for(int i=0;i<max;i++) { 
			if (a[i]<0) {
				negcount++;
			} else if(a[i]==0) {
				zerocount++;
								
			}else {
				poscount++;
				
		}		
		
		}
		System.out.println("positive :" +poscount);
		System.out.println("negative :" +negcount);
		System.out.println("zero :" +zerocount);
		}
		

}



		