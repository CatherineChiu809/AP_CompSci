/*
 *	Author:  Catherine Chiu
 *  Date: 10/19/24
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Warrior[]bob = new Warrior[100];
		Wizard[] joe = new Wizard[100];
		
		int a = 0;
		while(a<100){
			bob[a] = new Warrior("bob"); 
			joe[a] = new Wizard("joe");
			a++;
		}
		int j=0;
		int b=0;
		boolean fight = true;
		while(fight){
			
			if(joe[j].isDead()==true){
				
				j=j+1;
				if(j==joe.length-1){
					j=j-1;
					System.out.println("The warriors wone with "+(100-b)+" left in their army");
					fight = false;
					break;
				}
			}
			if(bob[b].isDead()==true){
				
				b=b+1;
				
				if(b==bob.length-1){
					b=b-1;
					System.out.println("The wizards wone with "+(100-j)+" left in their army");
					fight = false;
					break;
				}
			}
			joe[j].attack(bob[b]);
			bob[b].attack(joe[j]);
		}

		
		
		

	}
}
