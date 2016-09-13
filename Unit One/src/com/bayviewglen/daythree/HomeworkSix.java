package com.bayviewglen.daythree;

public class HomeworkSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 7;
		double b = 8;
		int c = -11;
		int y = 0;
		
		double x1 = ( -b + Math.sqrt((Math.pow(b, 2) - 4 * a * c)) ) / (2 * a);
		double x2 = ( -b - Math.sqrt((Math.pow(b, 2) - 4 * a * c)) ) / (2 * a);
		
		System.out.print("The equation equals " + x1 +" or " + x2);

	}

}
