/*
 *	Author: Catherine Chiu
 *  Date: 11/15/24
*/

import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the file name of one of the text files in the \'books\' folder: (Ex: test.txt)");
		String textFile = sc.nextLine();		// This is one of the files in the 'books' folder. It MUST exist.
		String[] arr = fillArray(textFile);		// Uses the fillArray method that has been built below. This fills the array 'arr' with each word individually in the text file.
		System.out.println();


		/*
			The only time you should use Scanner with (System.in) is within the 'main' method.
			At no point should any other method use Scanner(System.in)
		*/
		while(true){
			System.out.println("What action would you like to take?");
			System.out.println("1. Check text file (file)");
			System.out.println("2. Print the text given (print)");
			System.out.println("3. Print the text backwards (printBack)");
			System.out.println("4. Print a certain number of words (printNum)");
			System.out.println("5. Change the text file (change)");
			System.out.println("6. Check the number of words in a text (check)");
			System.out.println("7. Most common word (common)");
			String choice = sc.nextLine();
			System.out.println();

			// Your code goes here.
			if(choice.equals("file")){
				System.out.println(textFile);
			}
			
			if(choice.equals("print")){
				printsArray(arr);
			}
			
			if(choice.equals("printBack")){
				printsArrayBack(arr);
			}
			if(choice.equals("printNum")){
				System.out.println("How many words would you like to print?");
				int n = sc.nextInt();
				sc.nextLine();
				printsNumber(arr, n);
			}
			if(choice.equals("change")){
				System.out.println("What file would you like to change to? ");
				textFile = sc.nextLine();
				fillArray(textFile);
				System.out.println();
			}
			if(choice.equals("check")){
				System.out.println("What word would you like to check for?");
				String c = sc.nextLine();
				int a = checksArray(arr, c);
				System.out.println("The word "+c+" was used "+a+" times!");
			}
			if(choice.equals("common")){
				String word = mostCommon(arr);
				System.out.println("The most common word is "+word);
			}

			System.out.println("----------");
		}
	}


	/* ---------------------------------------------------------------------------------------
		The printsArray method prints the entire array given.
	*/
	public static void printsArray(String[] arr){
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}


	/* ---------------------------------------------------------------------------------------
		The printsArrayBack method prints the entire array given in opposite order.
	*/
	public static void printsArrayBack(String[] arr){
		for(int i = arr.length-1; i>=0; i--){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}


	/* ---------------------------------------------------------------------------------------
		The printsNumber method prints "num" words out of the entire given array.
		If the number is larger than the number of words in the array, it tells the user too large and to try again.
			This should immediately end the method.
	*/
	public static void printsNumber(String[] arr, int num){
		if(num>arr.length){
			System.out.println("Your number is to large");
			return;
		}
		for(int i = 0; i<num; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}


	/* ---------------------------------------------------------------------------------------
		The checksArray method checks the given array for a given String.
		It counts the number of occurences that the given String shows up.
		The count is returned to the call.
	*/
	public static int checksArray(String[] arr, String check){
		int count = 0;
		for(int i = 0; i<arr.length; i++){
			if(arr[i].equals(check)){
				count++;
			}
		}
		return count;	// Dummy value, delete when needed.
	}


	/* ---------------------------------------------------------------------------------------
		The mostCommon method finds the most common word in the given array.
		It returns the String of the most common word.
		This is a harder method but is doable!
		Do this one last!
	*/
	public static String mostCommon(String[] arr){
		int count = 0; 
		int max=0;
		String bigword = new String ("");
		String word = new String ("");
		
		for(int i = 0; i<arr.length; i++){
			word = arr[i];
			count = 0;
			for(int j = i+1; j<arr.length; j++){
				if(arr[j].equals(word)){
					count++;
				}
			}
			if(count>max){
				max = count;
				bigword = word;
			}
		}
		return bigword;
	}




	// ---------------------------------------------------------------------------------------
	/*
		The fillArray method returns an array filled of all of the words in a given text file (String).
		Each word is slotted into its own index in the array.
		The array length is the number of words in the text file.
		A precondition is that "String args" must be a valid .txt file stored in the "books" folder.
	*/
	public static String[] fillArray(String arg) throws FileNotFoundException {
		File text = new File("./books/" + arg);
		Scanner sc = new Scanner(text);
		int lineNumber = 0;
		while(sc.hasNext()){
			sc.next();
			lineNumber++;
		}

		String[] arr = new String[lineNumber];
		sc = new Scanner(text);
		for(int i = 0; i < lineNumber; i++){
			arr[i] = sc.next();
        }
		return arr;
	}

}
