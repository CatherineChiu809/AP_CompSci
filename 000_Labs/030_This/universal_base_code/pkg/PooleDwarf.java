/*
 *	Author:  Catherine Chiu
 *  Date: 10/9/24
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class PooleDwarf {
	String name;
	int age;
	int count;

	public PooleDwarf() {		// Default Constructor
		name = new String("");
		age = 0;
		count = 0;
	}

	public PooleDwarf(String name, int age){
		// Complete this constructor
		this.name = name;
		this.age = age;
		count= 0;
	}

	/*	Accessor Methods */
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	/*	Mutator Methods	*/
	public void setName(String name){
		// Fix this method
		this.name=name;
		
	}
	
	public void setAge(int age){
		// Fix this method
		
		this.age = age;
	}

	public boolean isSameName(PooleDwarf dwarf){
		// Complete this method
		if(name.equals(dwarf.getName())){
			count++;
			return true;
		}
		else{
			return false;
		}
		
	}
	public int getDuplicate(){
		return count;
	}
}

