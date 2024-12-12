/*
 *	Author:  Catherine Chiu
 *  Date: 10/9/24
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Donkey {
	public String name;

	public Donkey() {
		name = "Donkey";
	}

	public String getName(){
		return name;
	}

	public void interact(Ogre shrek){
		System.out.println(shrek.getName() + ", parfaits may be the most delicious thing on the whole planet!");
		return;
	}



}
