/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class Character{
	String role = new String("Wizard");
	int s = 4;
	int d = 3;
	int i = 10;
	int c = 3;
}
class starter {
	
	public static void main(String args[]) {
		
		Character me = new Character();
		System.out.println("Your role is: "+me.role);
		System.out.println("Your strength is: "+me.s);
		System.out.println("Your dexterity is: "+me.d);
		System.out.println("Your intelligence is: "+me.i);
		System.out.println("Your charisma is: "+me.c);
	}
}
