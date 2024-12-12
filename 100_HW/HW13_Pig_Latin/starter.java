/*
   * Author: Catherine Chiu
   * Date: 12/8/24
   * Collaborator(s):
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a phrase: ");
		String a = sc.nextLine();
		
		
		
		while(true){
			int space = a.indexOf(" ");
			
			if(a.indexOf(" ") == -1){
				if(a.substring(0,1).equals("a")||a.substring(0,1).equals("e")||a.substring(0,1).equals("i")||a.substring(0,1).equals("o")||a.substring(0,1).equals("u")){
					a = a + "-way";
					System.out.print(a+" ");
				}
				else{
					String letter = "";
					if(a.substring(1,2).equals("a")||a.substring(1,2).equals("e")||a.substring(1,2).equals("i")||a.substring(1,2).equals("o")||a.substring(1,2).equals("u")){
						letter = a.substring(0,1);
						a = a.substring(1)+"-"+letter+"ay";
						System.out.print(a+" ");
					}
					else{
						letter = a.substring(0,2);
						a = a.substring(2)+"-"+letter+"ay";
						System.out.print(a+" ");
					}
				}
				break;
			}
			
			
			if(a.substring(0,1).equals("a")||a.substring(0,1).equals("e")||a.substring(0,1).equals("i")||a.substring(0,1).equals("o")||a.substring(0,1).equals("u")){
				String c = a.substring(0,space);
				c = c + "-way";
				System.out.print(c+" ");
			}
			else{
				String c = a.substring(0,space);
				String letter = "";
				if(a.substring(1,2).equals("a")||a.substring(1,2).equals("e")||a.substring(1,2).equals("i")||a.substring(1,2).equals("o")||a.substring(1,2).equals("u")){
					letter = c.substring(0,1);
					c = c.substring(1)+"-"+letter+"ay";
					System.out.print(c+" ");
				}
				else{
					letter = c.substring(0,2);
					c = c.substring(2)+"-"+letter+"ay";
					System.out.print(c+" ");
				}
			}
			a = a.substring(space+1);
			
		}
		
	}
}
