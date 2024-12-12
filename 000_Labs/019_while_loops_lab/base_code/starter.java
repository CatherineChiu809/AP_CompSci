/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		int c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter the number of times you want your name outputed: ");
		int t = sc.nextInt();
		
		while(c<t){
			c = c +1;
			System.out.print(name + " ");
			
		}
		
	}
}
