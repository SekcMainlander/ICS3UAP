package com.bayviewglen.crosscountry;

import java.util.Scanner;

public class ReadTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a time: ");
		String time1 = scanner.nextLine();
		int minutes = Integer.parseInt(time1.split(":")[0]);
		//"Interger.parseInt" converts string to int if it appears to be an interger
		//[0] grabs the first half (left side of ":"
		double seconds = Double.parseDouble(time1.split(":")[1]);
		//"Double.parseDouble" converts strings to double if it appears to be double
		// [1] grabs second half (right side of ":"
		
	}

}
