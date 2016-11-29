package com.bayviewglen.dayone;

public class ExampleThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		
		int current = 1;
		
		while(current < 10001){
			sum += current;
			current++;
	}
		System.out.println("THE SUM OF THE NUMBERS FROM 1 TO 1000 IS:" + sum);
}
}
