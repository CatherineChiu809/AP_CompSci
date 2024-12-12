/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: "); 
		String name = sc.nextLine();
		System.out.println("Your name is " + name);
		
		System.out.println("Enter your age: "); 
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Your age is "+age);
		
		System.out.println("Enter your birthday month: "); 
		String m = sc.nextLine();
		System.out.println("Your birth month is "+m);
		
		System.out.println("Enter your birthday day: "); 
		int day = sc.nextInt();
		System.out.println("Your birthday is "+ day);
		
		System.out.println("Enter your birth year: "); 
		int year = sc.nextInt();
		System.out.println("Your birth year is "+year);
		
		System.out.println("How much is a buck fifty? ");
		double money = sc.nextDouble();
		System.out.println("A buck fifty is $ "+money);
	}
}
