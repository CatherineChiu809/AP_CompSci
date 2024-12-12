/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void slot(){
		Scanner sc = new Scanner(System.in);
		int money = 100;
		String p = new String("Do you want to play the slots? ");
		String play = new String();
		int wager;
		
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than you total amount of money.");
		System.out.println("3. The slot machine will roll 3 number from 1 to 10.");
		System.out.println("	a. If two numbers match, you double your wager.");
		System.out.println("	b. If three numbers match, you triple your wager.");
		System.out.println("	c. If no numbers match, you lose your wager.");
		
		while(true){
			
			
			System.out.print(p);
			
			play = sc.nextLine();
			if((play.equals("no"))||(play.equals("No"))||(play.equals("n"))||(play.equals("N"))){
				System.out.println("Sad to see you go! You have "+money + " left. Come play again soon!");
				break;
			}
			else if((play.equals("yes"))||(play.equals("Yes"))||(play.equals("y"))||(play.equals("Y"))){
				System.out.print("You have $" + money + ". How much would you like to wager? ");
				
				wager = sc.nextInt();
				sc.nextLine();
				while(wager>money){
					System.out.print("That is not a valid input. Please try again.");
					wager = sc.nextInt();
					sc.nextLine();
				}
				
				System.out.println("\nGreat let's play!\nYour rolls are:");
			
				int a = (int)(Math.random()*9+1);
				int b = (int)(Math.random()*9+1);
				int c = (int)(Math.random()*9+1);
				System.out.println("---------------");
				System.out.println(" | "+ a + " | "+b+" | "+ c+" | ");
				System.out.println("---------------");
			
				if(a==b||a==c||b==c){
					System.out.println("Congrats your money is doubled!");
					money = money +wager;
					System.out.println("You now have $"+money);
					System.out.println();
				}
				else if(a==b&b==c){
					System.out.println("Wow! Your money is tripled!");
					money = money +(wager*2);
					System.out.println("You now have $"+money);
					System.out.println();
				}
				else{
					System.out.println("You didn't win this time, better luck next time!");
					money = money -wager;
					System.out.println("You now have $"+money);
					System.out.println();
					
				}
				
				if(money==0){
					System.out.println("Sad to see you go! You have "+money + " left. Come play again soon!");
					break;
				}
			}
			
			else{
				System.out.println("That was not a valid input, please try again");
			}
			
			
		}
	}
	public static void main(String args[]) {
		
		slot();

	}
}
