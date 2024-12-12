/*
 *	Author: Catherine Chiu
 *  Date: 11/6/24
 * 	Collaborator(s): Sathvi
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] array = new int [20];
		for(int a = 0; a<20; a++){
			array[a]=(int)(Math.random()*11+1);
		}
		int num = (int)(Math.random()*11+1);
		int d = 0;
		System.out.print("The indexes with duplicates are: ");
		for(int a = 0; a<20; a++){
			if(num==array[a]){
				d++;
				System.out.print(a+", ");
			}
		}
		System.out.println();
		System.out.println("There were "+ d +" duplicates");
		System.out.println();
		for(int a = 0; a<19; a++){
			if(array[a]==array[a+1]-1){
				System.out.println("Indexes "+a+" and "+(a+1)+" are consecutive! The numbers are " + array[a]+" and "+array[a+1]);
			}
		}
	}
	
	
}
