/*
 *	Author: Catherine Chiu
 *  Date: 10/9/24
*/

import java.util.Scanner;

class starter {
	
	public static boolean checkPrime(int num){
		int a = 2;
		boolean notprime=false;
		
		while(a<num){
			if(num%a==0){
				notprime = true;
				break;
			}
			a++;
		}
		return notprime;
	}
	
	public static void printPrime(int givennumber){
		int b = 2;
		while(b<=givennumber){
			checkPrime(b);
			if(checkPrime(b)==false){
				System.out.println(b);
			}
			
			b++;
		}
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number and we'll print out every prime until that number: ");
		int givennumber = sc.nextInt();
		printPrime(givennumber);
		
	}
}
