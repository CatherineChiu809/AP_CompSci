package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	int age;
	String name;
	String breed;
	
	public Dog() {
		age = 3;
		breed = "big red dog";
		name = "Clifford";
	}
	public Dog(String n){
		name = n;
	}
	public Dog(String na, String b){
		name = na;
		breed = b;
	}
	public Dog(String nam, int a){
		name = nam;
		age = a;
	}
	
	public void setName(String nn){ 
		name = nn;
	}
	public void setAge(int ag){
		age = ag;
	}
	public void setBreed(String br){
		breed = br;
	}
	public String getName(){
		return name;
	}
	public String getBreed(){
		return breed;
	}
	public int getAge(){
		return age;
	}
	public boolean isSleeping(){
		int z = (int)(Math.random()*2);
		if (z==0){
			return true;
		}
		else{
			return false;
		}
		
	}
	public void bark(){
		System.out.println(name+" barks");
	}

}
