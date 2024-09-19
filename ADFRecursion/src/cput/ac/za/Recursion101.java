package cput.ac.za;

import java.util.Scanner;

public class Recursion101 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//asking the user where to start counting
		System.out.println("Please enter an integer to start from:");
		//saving the user input
		int userInput = scan.nextInt();
		
		countingBackwardsScanner(userInput);
		
		scan.close();
	}
	public static void countingBackwardsScanner(int n) {
		//creating a base case using if statement
		if(n == 0) {
			//what to print when a base case is reached 
			System.out.println("Done counting!!");
		}else {
			//showing the current value of n every time the program is executed
			System.out.println(n + " counting backwards");
			//decrementing the value of n so the program will not run forever and also for the value to reach the base case
			n--;
			//using Recursion (calling a method inside of itself)
			countingBackwardsScanner(n);
		}
		
	}

}
