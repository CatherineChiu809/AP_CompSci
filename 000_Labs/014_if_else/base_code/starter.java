/*
 *	Author:  Catherine Chiu
 *  Date: 9/11
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
		else{
			System.out.print("That was not the number I was thinking of");
		}
	}
}
