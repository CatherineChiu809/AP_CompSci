/*
 *	Author: Catherine Chiu
 *  Date: 9/16/24
 *	Collaborator(s): Sathvi Reddy
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		System.out.println("\nEnter another number: (bigger than the first) ");
		int y = sc.nextInt();
		System.out.println("\nYour range is between " + x +" and "+y);
		System.out.println("\nHere are five random numbers from that range: ");
		
		System.out.print((int) (Math.random()*(y-x)+x) + ", ");
		System.out.print((int) (Math.random()*(y-x)+x) + ", ");
		System.out.print((int) (Math.random()*(y-x)+x) + ", ");
		System.out.print((int) (Math.random()*(y-x)+x) + ", ");
		System.out.print((int) (Math.random()*(y-x)+x));
	}
}
