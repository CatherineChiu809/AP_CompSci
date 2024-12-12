/*
 *	Author:  Catherine Chiu
 *  Date: 10/14/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int[]array){
		for(int i = 0; i<100; i++){
			array[i]=(int)(Math.random()*100+1);
			System.out.println(array[i]);
		}
		
	}
	public static int getArrayAverage(int[]array){
		int average=0;
		int b = 0;
		for(b=0; b<100; b++){
			average=average + array[b];
		}
		average=average/b;
		return average;
	}
	public static int getArrayMax(int[]array){
		int max = 0;
		for(int c = 0; c<100; c++){
			if(array[c]>max){
				max = array[c];
			}
		}
		return max;
	}
	public static int getArrayMin(int[]array){
		int min = 100;
		for(int d = 0; d<100; d++){
			if(array[d]<min){
				min = array[d];
			}
		}
		return min;
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int [] a = new int [100];
		System.out.println("Here are the random numbers in your array: ");
		toStringArray(a);
		System.out.println("\nThe average of this array is: "+getArrayAverage(a));
		System.out.println("The maximum of this array is: "+getArrayMax(a));
		System.out.println("The minimum of this array is: "+getArrayMin(a));
		

		
	}
}
