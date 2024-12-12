import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords

		int z = 0;
		
        for(int a = 0; a<count; a++){
            if(passwords[a].length()>=8){
                z++;
            }
        }
        System.out.println("There are " + z + " strong passwords for level one!");
		
		int y = 0;
		
		for(int b = 0; b<count; b++){
		    if(passwords[b].contains("!")||passwords[b].contains("@")||passwords[b].contains("#")||passwords[b].contains("$")||passwords[b].contains("%")||passwords[b].contains("^")||passwords[b].contains("&")||passwords[b].contains("*")){
		        y++;
		    }
		}
		System.out.println("There are "+y+" strong passwords for level two!");
		
		int w = 0; 
		for(int c = 0; c<count; c++){
		    if(passwords[c].length()>=8){
                if(passwords[c].contains("!")||passwords[c].contains("@")||passwords[c].contains("#")||passwords[c].contains("$")||passwords[c].contains("%")||passwords[c].contains("^")||passwords[c].contains("&")||passwords[c].contains("*")){
    		        w++;
		        }
            }
		}
		
		System.out.println("There are "+w+" strong passwords for level three!");
	}
}
