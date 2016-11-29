package com.bayviewglen.daytwo;

public class ExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for loops: built in counter, meant to iterate over a collection, series of data.
		//Use for loops when the number of executions is known
		//Now let's compare both loops
		
		//While loop
		int i = 0; 							//Runs 1
		while (i < 100){					//Runs next
			System.out.println(i);;         //Runs 3rd
			i ++;							//Runs 4th, then steps 2, 3, & 4 repeats over and over until condition = false
		}
		
		//for loop
		for (int i1 = 0; i1 < 100; i1 ++){		//" i = 0" Runs 1, "i < 100" Runs next,"i ++" runs 4th, then steps 2, 3, & 4 repeats over and over until condition = false
			System.out.println(i1);			//Runs 3rd
		}
		
	}

}
