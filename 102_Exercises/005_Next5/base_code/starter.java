/*
 *	Author: Catherine Chiu
 *  Date: 9/11
 *	Collaborator(s): Sathvi Reddy
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = sc.nextInt();
		System.out.println("Here are the next five numbers: ");
		
		int x = 0;
		while(x<5){
			x=x+1;
			System.out.println(number+x);
			
			
		}
		int y = 0;
		System.out.println("\nHere are the next five multiples: ");
		while(y<number*5){
			
			y=y+number;
			System.out.println(number+y);
			
		}
		
		System.out.println("\nHere is your integer divided by 100: \n"+(number/100.0));
		System.out.println("\nHere is your integer divided by 10: \n"+(number/10.0));
	}
}
