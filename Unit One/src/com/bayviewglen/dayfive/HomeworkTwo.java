package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		double studentScore;
		System.out.print("Please enter what you scored on the test?: ");
		studentScore = keyboard.nextInt();
		
		int totalScore;
		System.out.print("Please enter what the test was out of: ");
		totalScore = keyboard.nextInt();
		
		double studentPercent = ((studentScore / totalScore) * 100);
		
		System.out.println("Your percentage grade was: " + studentPercent);
		
		
	}

}
