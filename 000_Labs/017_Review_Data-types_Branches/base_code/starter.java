/*
 *	Author:  Catherine Chiu
 *  Date: 9/17/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		int points = 20;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you name: "); 
		String name = sc.nextLine();
		System.out.print("\nEnter you title: "); 
		String title = sc.nextLine();
		System.out.print("\nEnter you role; Wizard, Warrior, Rogue: "); 
		String role = sc.nextLine();
		
		if((role.equals("Wizard"))||(role.equals("wizard"))){
			System.out.println("\nYou are a wizard! Make Harry Potter proud!");
		}
		else if((role.equals("Warrior"))||(role.equals("warrior"))){
			System.out.println("\nYou are a warrior! Fight with honor!");
		}
		else if((role.equals("Rogue"))||(role.equals("rogue"))){
			System.out.println("\nYou are a rogue! Good for you!");
		}
		else{
			System.out.println("\nThat is not an option, try again");
		}
		
		
		
		System.out.println("\nYou have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		
		System.out.print("\nStrength (1-10): ");
		int s = sc.nextInt();
		if(s>10){
			System.out.println("Please enter a smaller number");
			s = sc.nextInt();
		}
		if(points<s){
			System.out.println("Please enter a smaller number");
			s = sc.nextInt();
		}
		else{
			points = points - s;
			System.out.println("You have " + points + " points left to spend");
		}
		
		System.out.print("\nDexterity (1-10): ");
		int d = sc.nextInt();
		if(d>10){
			System.out.println("Please enter a smaller number");
			d = sc.nextInt();
		}
		if(points<d){
			System.out.println("Please enter a smaller number");
			d = sc.nextInt();
		}
		else{
			points = points - d;
			System.out.println("You have " + points + " points left to spend");
		}
		
		System.out.print("\nIntelligence (1-10): ");
		int i = sc.nextInt();
		if(i>10){
			System.out.println("Please enter a smaller number");
			i = sc.nextInt();
		}
		if(points<i){
			System.out.println("Please enter a smaller number");
			i = sc.nextInt();
		}
		else{
			points = points - i;
			System.out.println("You have " + points + " points left to spend");
		}
		
		System.out.print("\nCharisma (1-10): ");
		int c = sc.nextInt();
		if(c>10){
			System.out.println("Please enter a smaller number");
			c = sc.nextInt();
		}
		if(points<c){
			System.out.println("Please enter a smaller number");
			c = sc.nextInt();
		}
		else{
			points = points - c;
			System.out.println("You have " + points + " points left to spend");
		}
		
		
		if(points>0){
			System.out.println("\nYou have " + points + "left to spend next time.");
		}
		
		
		
		System.out.println("\nYou are a " + name + ", the "+ title+" of CVHS.\nYou're a " + role + " with the following stats!");
		System.out.println("Strength - "+s);
		System.out.println("Dexterity - "+d);
		System.out.println("Intelligence - "+i);
		System.out.println("Charisma - "+c);
		System.out.println("\nGood luck on your quest "+name);
	}
}
