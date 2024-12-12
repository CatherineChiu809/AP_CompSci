/*
 *	Author:  Catherine Chiu
 *  Date: 9/26/24
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	String role;
	int s;
	int d;
	int i;
	int c;
	Scanner sc = new Scanner(System.in);

	public BaseClass() {
		role = ("No role");
		
		s = 0;
		d = 0;
		i = 0;
		c = 0;
		
	}
	public void myToString(){
			
		System.out.println("Your role is "+role);
		
		System.out.println(s);
		System.out.println(d);
		System.out.println(i);
		System.out.println(c);
		
	}
	public void askRole(){
			
		System.out.print("\nWhat role would you like to be? ");
		role = sc.nextLine();
			
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
			System.out.println("\nYou still hae no role");
		}
		
		System.out.println(s);
		System.out.println(d);
		System.out.println(i);
		System.out.println(c);
	}
}

