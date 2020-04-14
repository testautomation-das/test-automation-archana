package allAssignmentIFElse;

import java.util.Scanner;

public class TestSting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	 1)Write a Java program to get the character at the given index
	// within the String
		
//        String str1=new String("Selenium");
//        //System.out.println(str1.indexOf('l'));//get index of the given character //output different
//        //System.out.println(str1.charAt(5));//get the character at the given index OR below code //line 12 or 13-16 will be same
//        int index=str1.charAt(3);
//        int index1=str1.charAt(7);
//        System.out.println("get character at index:" +(char)index);
//        System.out.println("get character at index:" +(char)index1);
		
	//	 3) Write a java program to count a character of a
	//* String.
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter String:");
//		String str1=sc.next();
//		int count=0;
//		for(int i=0;i<str1.length();i++) {
//			if(str1.charAt(i)!= ' ') {
//			 count++;
//			}
//			System.out.println("number of character" +count);
//		}
		
		//4)Write a java program to compare two strings
		//Method1:
//		String str1="test";
//		String str2= "java";
//		System.out.println(str1.equals(str2));
		//Method2:
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter string1");
//		String str1=sc.next();
//		System.out.println("Enter string2");
//		String str2=sc.next();
//		if(str1.equals(str2)) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
		//5) Write a Java program to concatenate a given string to the end of another string.
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter string1");
//		String str1=sc.next();
//		System.out.println("Enter string2");
//		String str2=sc.next();
//		System.out.println(str1.concat(str2));
		
		//6) Write a Java program to test if a given string contains the specified sequence of char values.
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter string1");
//		String str1=sc.next();
//		System.out.println("Enter string2");
//		String str2=sc.next();
//		System.out.println(str1.contains(str2));
		
	//7) Write a java program to get the length of a given string.
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter string1");
//		String str1=sc.next();
//		System.out.println("Length of string is :" +str1.length());
	//8)Write a Java program to convert all the characters in a string to lowercase.	
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter string1");
//		String str1=sc.next();
//		System.out.println("Length of string is :" +str1.toLowerCase());
		
	//9) Write a Java program to convert all the characters in a string to uppercase
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter string1");
//		String str1=sc.next();
//		System.out.println("Length of string is :" +str1.toUpperCase());
		
	//10) Write a program to reverse a string
		StringBuilder sb=new StringBuilder("Test new java");
		System.out.println("String is: " +sb);
		sb.reverse();
		System.out.println("Reverse of string is :" +sb);
	}

}



