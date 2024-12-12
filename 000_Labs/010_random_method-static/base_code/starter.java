/*
 *	Author:  Catherine Chiu
 *  Date: 9/11
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int x = (int) (Math.random()*10);
		System.out.println(x);
		
		int y = ((int) (Math.random()*100)+1);
		System.out.println(y);
		
		double z = (Math.random()*1.5)+2.5;
		System.out.println(z);
		
		double a = (Math.random()*575)+14;
		System.out.println(a);
	}
}
