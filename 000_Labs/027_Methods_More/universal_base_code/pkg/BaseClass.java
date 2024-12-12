/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	int example = 0;

	public BaseClass() {
		
		
	}
	
	public String setRole(String role){
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
		return(role);
	}
	
	public int setD(int d){
		if(d<=0){
			d=0;
		}
		return d;
	}
	
	public int setS(int s){
		
		if(s<=0){
			s=0;
		}
		return s;
	}
	
	public int setI(int i){
		if(i<=0){
			i=0;
		}
		return i;
	}
	
	public int setC(int c){
		if(c<=0){
			c=0;
		}
		return c;
	}
	
	public boolean setAll(String role, int s, int i, int c, int d){
		return true;
	}
	
	public void myToString(String role, int s, int i, int c, int d){
		setRole(role);
		System.out.println("Your dexterity is: "+(setD(d)));
		System.out.println("Your strength is: "+(setS(s)));
		System.out.println("Your intelligence is: "+(setI(i)));
		System.out.println("Your charisma is: "+(setC(c)));
	}

}

