/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		int answer = 888;
		Scanner sc = new Scanner(System.in);
		System.out.print("Guess a number between 1 and 1000: "); 
		int guess = sc.nextInt();
		if(answer==guess){
			System.out.println("That is the number!!");
		}
		else if (answer > guess){
			System.out.println("Your number is too small");
		}
		else{
			System.out.print("Your number is too big");
		}
	}
}
