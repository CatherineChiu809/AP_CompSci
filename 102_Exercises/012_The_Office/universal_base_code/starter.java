/*
 *	Author: Catherine Chiu
 *  Date: 10/22/24
 * 	Collaborator(s): Sathvi
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Employee jim = new Employee(2474, "Jim" , "Halpert", 4416.66);
		Employee pam = new Employee(2011, "Pam" , "Beesly", 2250);
		Employee bob = new Employee(2011, "Bob" , "Joe", 2250);
		
		dwight.raiseSalary(5);
		jim.raiseSalary(5);
		pam.raiseSalary(5);
		bob.raiseSalary(5);
		
		
		dwight.employeeToString();
		System.out.println("Dwight's annual salary is: " + dwight.getAnnualSalary()+"\n");
		jim.employeeToString();
		System.out.println("Jim's annual salary is: " + dwight.getAnnualSalary()+"\n");
		pam.employeeToString();
		System.out.println("Pam's annual salary is: " + dwight.getAnnualSalary()+"\n");
		bob.employeeToString();
		System.out.println("Bob's annual salary is: " + dwight.getAnnualSalary()+"\n");
		
		
	}
}
