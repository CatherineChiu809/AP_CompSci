/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		boolean x;
		int answer = (int) (Math.random()*1001);
		
		while(x=true){
			System.out.println("Guess a number between 0 and 1000: ");
			int guess = sc.nextInt();
			if(guess == answer){
				break;
			}
			System.out.println("That was not the number\n");
		}
		System.out.println("You guessed the number!");
		
	}
}
