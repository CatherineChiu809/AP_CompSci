/*
 *	Author:  Catherine Chiu
 *  Date: 11/18/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a name first and last: ");
		String name = sc.nextLine();
		int l = name.length();
		System.out.println(name.substring(name.indexOf(" ")+1,l));


		
	}
}
