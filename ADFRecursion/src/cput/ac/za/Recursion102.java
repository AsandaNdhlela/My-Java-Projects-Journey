package cput.ac.za;

import java.util.Scanner;

public class Recursion102 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int intialUserInput, userInput;

		
		System.out.println("Enter any integer to get the factorial of:");
		intialUserInput = scan.nextInt();
		
		userInput = intialUserInput;
		
		
		
		tryingOutFactorial(userInput, intialUserInput);
		scan.close();
		
	}
	public static void tryingOutFactorial(int n, int x) {
		if(n == 0) {
			System.out.println("Done!!");
		}else {
			int total = n*x;
			System.out.println("the factorial of "+ x + " is calculated as follows:");
			System.out.println(x+ " * " +n+ " = "+ total );
			
			System.out.println("The factorial of " + x + " is :" + x*x);
			n--;
			tryingOutFactorial(n,x);
		}
	}

}
