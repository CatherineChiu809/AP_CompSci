/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a phrase: ");
		String x = sc.nextLine();
		System.out.println(x);
		String pb = "";
		
		
		while(true){
            if(x.indexOf(" ") == -1){
                System.out.print(x+" ");
                break;
            }
            int spaces = x.indexOf(" ");
            String c = x.substring(0,spaces+1);
            pb=c+pb;
            x = x.substring(spaces+1);
        }
        System.out.print(pb);
		
	}
}
