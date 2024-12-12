import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many magic numbers would you like? ");
		int n = sc.nextInt();
		CVMath test = new CVMath();
		System.out.println("\nHere are your magic squares: ");
		test.magicSquare(n);
	}
}
