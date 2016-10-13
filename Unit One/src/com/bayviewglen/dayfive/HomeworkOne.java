package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkOne {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		
		double num;
		System.out.print("Please enter a number: ");
		num = keyboard.nextDouble();
		
		double finalNumber = (Math.pow(num, 2));
		
		System.out.println("Your number squared: " + finalNumber);
		
	}

}
