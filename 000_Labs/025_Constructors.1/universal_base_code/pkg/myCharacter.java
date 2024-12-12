/*
 *	Author:  Catherine Chiu
 *  Date: 9/26/24
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	
	
	public String role;
	
	public myCharacter(){
		
		role=new String("No role");
		System.out.println("Your role is "+role);
		System.out.println("Strength - 0");
		System.out.println("Dexterity - 0");
		System.out.println("Intelligence - 0");
		System.out.println("Charisma - 0");
	}
	public myCharacter(String r){
		
		if((r.equals("Wizard"))||(r.equals("wizard"))){
			System.out.println("You are a wizard! Make Harry Potter proud!");
		}
		else if((r.equals("Warrior"))||(r.equals("warrior"))){
			System.out.println("You are a warrior! Fight with honor!");
		}
		else if((r.equals("Rogue"))||(r.equals("rogue"))){
			System.out.println("You are a rogue! Good for you!");
		}
		else{
			System.out.println("That is not an option, try again");
		}
		System.out.println("Strength - 0");
		System.out.println("Dexterity - 0");
		System.out.println("Intelligence - 0");
		System.out.println("Charisma - 0");
	}

}

