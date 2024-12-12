/*
 *	Author:  Catherine Chiu
 *  Date: 10/14/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int [] array = new int[201];
		int i = 0;
		int min = 100;
		int max = 0;
		int average = 0;
		for(i = 51; i < 201; i++){
			array[i]= (int)(Math.random()*100+1);
			if(array[i]<min){
				min = array[i];
			}
			if(array[i]>max){
				max = array[i];
			}
			average = average + array[i];
		}
		System.out.println("There are "+(i-52)+" elements in this array!");
		System.out.println("The minimum of this array is: " + min);
		System.out.println("The maximum of this array is: " + max);
		System.out.println("The average of this array is: " + average/(i-51));


		
	}
}
