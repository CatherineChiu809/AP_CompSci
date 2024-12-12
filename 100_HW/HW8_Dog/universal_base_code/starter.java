/*
 *	Author: Catherine Chiu
 *  Date: 10/22/24
 *	Collaborator(s): Sathvi Reddy 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Dog pluto = new Dog("Pluto");
		pluto.setAge(5);
		
		Dog buddy = new Dog("Buddy", "Golden Doodle");
		
		if(pluto.isSleeping()==false){
			pluto.bark();
			buddy.bark();
		}
		else{
			System.out.println("Pluto is sleeping!");
		}
	}
}
