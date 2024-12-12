/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		System.out.println("Enter another number: ");
		int y = sc.nextInt();
		System.out.println("Enter another number: ");
		int z = sc.nextInt();
		
		if((x>y)&&(x>z)){
			System.out.println(x+" is the biggest number");
		}
		
		if((y>x)&&(y>z)){
			System.out.println(y+" is the biggest number");
		}
		if((z>x)&&(z>y)){
			System.out.println(z+" is the biggest number");
		}
		
		if((x<y)&&(x<z)){
			System.out.println(x+" is the smallest number");
		}
		
		if((y<x)&&(y<z)){
			System.out.println(y+" is the smallest number");
		}
		if((z<x)&&(z<y)){
			System.out.println(z+" is the smallest number");
		}
	}
}
