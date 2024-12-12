/*
 *	Author: Catherine Chiu
 *  Date: 9/24/24
 * 	Collaborator: Sathvi Reddy
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int x = sc.nextInt();
		
		System.out.println("Enter another number");
		int y = sc.nextInt();
		
		if(x%2==0){
			System.out.println("Your first number is even");
		}
		else{
			System.out.println("Your first number is odd");
		}
		
		if(y%2==0){
			System.out.println("Your second number is even");
		}
		else{
			System.out.println("Your second number is odd");
		}
		
		if(x%3==0&&x%4==0&&x%5==0){
			System.out.println("Your first number is divisible by 3, 4, and 5");
		}
		else{
			System.out.println("Your first number is not divisible by 3, 4, and 5");
		}
		if(y%3==0&&y%4==0&&y%5==0){
			System.out.println("Your first number is divisible by 3, 4, and 5");
		}
		else{
			System.out.println("Your first number is not divisible by 3, 4, and 5");
		}
	}
}
