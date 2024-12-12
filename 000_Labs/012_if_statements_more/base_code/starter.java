/*
 *	Author: Catherine Chiu 
 *  Date: 9/11
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter another number: ");
		int num2 = sc.nextInt();
		
		if(num1!=num2){
			System.out.println("They are different");
		}
		
		if(num1==num2){
			System.out.println("They are the same");
		}
	}
}
