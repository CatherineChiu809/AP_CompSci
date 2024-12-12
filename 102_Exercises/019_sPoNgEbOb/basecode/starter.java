/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static String spongecase(String a){
		String b = "";
		String c = "";
		int count = 0;
		int space = a.indexOf(" ");
		
		for(int i = 0; i<a.length(); i++){
			b = a.substring(i,i+1);
			if(space==i){
				c=c+" ";
				space=a.indexOf(" ",space+1);
				
			}
			else if(count%2==0){
				c=c+b.toLowerCase();
				count++;
			}
			else{
				c=c+b.toUpperCase();
				count++;
			}
			
		}
		return c;
	}
	public static void main(String args[]) {
		String a = spongecase("black cats eat white mice");
		System.out.println(a);
	}
}
