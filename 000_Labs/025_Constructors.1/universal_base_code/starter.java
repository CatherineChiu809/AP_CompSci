/*
 *	Author:  Catherine Chiu
 *  Date: 9/26/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;



class starter {
	public static void main(String args[]) {
		
		String x;
		Scanner sc = new Scanner(System.in);
		myCharacter role=new myCharacter();
		
		System.out.print("Would you like to be a Wizard, Warrior, or a Rogue? ");
		x = sc.nextLine();
		myCharacter bob = new myCharacter(x);
		
		
	}
}
