/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static int pow(int x, int y){
		
		int a=0;
		int pow = 1;
	 	while(a<y){
	 		pow=pow*x;
	 		a=a+1;
	 	}
	 
	 	return pow;
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		
		System.out.println(pow(4,3));
		
		
	}
}
