package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkThree {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		
		int digit1 , digit2 , digit3 , digit4 , digit5 , digit6;
		System.out.print("Please enter a 6 digit number: ");
		digit1 = keyboard.nextInt();
		digit2 = keyboard.nextInt();
		digit3 = keyboard.nextInt();
		digit4 = keyboard.nextInt();
		digit5 = keyboard.nextInt();
		digit6 = keyboard.nextInt();
		
		int product = digit2 * digit4
				;
		
		System.out.println("The product of the 2nd and 5th digit is: " + product);
		
	}

}
