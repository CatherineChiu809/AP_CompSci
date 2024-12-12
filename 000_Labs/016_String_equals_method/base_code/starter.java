/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Would you like to be a Wizard, Warrior, or a Rogue? ");
		String role = sc.nextLine();
		
		if((role.equals("Wizard"))||(role.equals("wizard"))){
			System.out.println("You are a wizard! Make Harry Potter proud!");
		}
		else if((role.equals("Warrior"))||(role.equals("warrior"))){
			System.out.println("You are a warrior! Fight with honor!");
		}
		else if((role.equals("Rogue"))||(role.equals("rogue"))){
			System.out.println("You are a rogue! Good for you!");
		}
		else{
			System.out.println("That is not an option, try again");
		}
	}
}
