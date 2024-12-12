/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = sc.nextLine();
        System.out.println("Hello "+name);
        
        System.out.println("Please enter a number: ");
        int bob = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter another number: ");
        int joe = sc.nextInt();
        System.out.println("The sum of these numbers is: "+(bob+joe));
        sc.nextLine();
        
        System.out.println("What is your favorite food?: ");
        String food = sc.nextLine();
        System.out.println("Your favorite food is " + food);
	}
}