/*
 *	Author:  Catherine Chiu
 *  Date: 11/19/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word:");
		String a = sc.nextLine();
		int length = a.length();
		System.out.println("\nLetter by letter:");
		for(int i = 0; i<length; i++){
			System.out.println(a.substring(i,i+1)+"\n");
		}
		
		
	}
}
