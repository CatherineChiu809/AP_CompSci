/*
 *	Author:  Catherine Chiu
 *  Date: 10/9/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}
	public static int randAge(){
		int a = (int)(Math.random()*101);
		return a;
	}

	public static void main(String args[]) {
		// Your code goes below here
		int count = 0;
		PooleDwarf dwarfone = new PooleDwarf();
		dwarfone.setAge(randAge());
		dwarfone.setName(randName());
		
		
		PooleDwarf dwarftwo = new PooleDwarf();
		dwarftwo.setAge(randAge());
		dwarftwo.setName(randName());
		
		PooleDwarf dwarfthree = new PooleDwarf();
		dwarfthree.setAge(randAge());
		dwarfthree.setName(randName());
		
		PooleDwarf dwarffour = new PooleDwarf();
		dwarffour.setAge(randAge());
		dwarffour.setName(randName());
		
		PooleDwarf dwarffive = new PooleDwarf();
		dwarffive.setAge(randAge());
		dwarffive.setName(randName());
		
		PooleDwarf dwarfsix = new PooleDwarf();
		dwarfsix.setAge(randAge());
		dwarfsix.setName(randName());
		
		PooleDwarf dwarfseven = new PooleDwarf();
		dwarfseven.setAge(randAge());
		dwarfseven.setName(randName());
		
		dwarfone.isSameName(dwarftwo);
		dwarfone.isSameName(dwarfthree);
		dwarfone.isSameName(dwarffour);
		dwarfone.isSameName(dwarffive);
		dwarfone.isSameName(dwarfsix);
		dwarfone.isSameName(dwarfseven);

		System.out.println(dwarfone.getName()+" was the name with "+dwarfone.getDuplicate()+" repeats!");
	}
}
