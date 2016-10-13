package com.bayviewglen.dayfive;

public class ExampleThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double number = 3.45677;
		int number2 = 3;
		
		// f is decimal #
		// d is integer
		// %width.decimalplacesTYPE
		// %10.2f means width of 10 and 2 decimal places for a decimal number
		//"%" allows you to add extra "width", example %10= 10 extra total "width" (see example bellow)
		
		System.out.printf("This is a string %10.2f %4d", number, number2);
		
	}

}
