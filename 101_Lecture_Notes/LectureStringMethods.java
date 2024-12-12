/* 
    Lecture note example - String Methods!
    length() - Returns the number of characters in a String
    substring(int) - Starts from the given int and returns to the end of the String
    substring(int, int) - Starts from the first int and returns until the last int (NOT including last int index)
    indexOf(String) - Returns the index of the first instance of a given String
    indexOf(String, int) - Returns the index of the first instance of a given String STARTING at the int index given
*/
import java.util.*;

class LectureStringMethods{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String x = sc.nextLine();
        
        // int space = x.indexOf(" ");
        // String a = x.substring(0,space);
        // int space2 = x.indexOf(" ",space+1);
        // String b = x.substring(space+1, space2);
        
        // System.out.println(a);
        // System.out.println(b);
        
        while(true){
            if(x.indexOf(" ") == -1){
                System.out.println(x);
                break;
            }
            int spaces = x.indexOf(" ");
            String c = x.substring(0,spaces);
            System.out.println(x.substring(0,spaces));
            x = x.substring(spaces+1);
        }
        
	}
}