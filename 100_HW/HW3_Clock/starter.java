/*
 *	Author: Catherine Chiu
 *  Date: 9/17/24
 *	Collaborator(s): Sathvi Reddy
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("What day is it today? Monday = 1, Tuesday = 2... ");
		int day = sc.nextInt();
		
		if(day<=5){
			System.out.println("\nWake up, it's 7:00 AM!! You have school today!");
		}
		else if((day>5)&&(day<=7)){
			System.out.println("\nIt's 10:AM! Wake up and enjoy your weekend!");
		}
	}
}
