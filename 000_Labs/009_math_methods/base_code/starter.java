/*
 *	Author: Catherine Chiu 
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		System.out.println("Maximum: " + Math.max(13-6*11,30%7*(-2)));
		System.out.println("Square Root: " + Math.sqrt(3*8+31%7));
		System.out.println("Power: " + Math.pow(37/3,35%21));
		System.out.println("Maximum: " + Math.max(Math.pow(2,14%3),Math.sqrt(2*6)));
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a double: ");
		double x = sc.nextDouble();
		System.out.println("Enter another double: ");
		double y = sc.nextDouble();
		System.out.println("Maximum: "+ Math.max(x,y));
		System.out.println("Square Root: " + Math.sqrt(y));
		System.out.println("Power: " + Math.pow(x,y));
		
	}
}
