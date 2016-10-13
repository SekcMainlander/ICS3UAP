package com.bayviewglen.daythree;

public class HomeworkFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numOfPennies = 5;
		int numOfNickles = 10;
		int numOfDimes = 15;
		int numOfQuarters = 20;
		int numOfLoonies = 25;
		int numOfToonies = 30;
		
		double totalMoney = (0.01 * numOfPennies) + (0.05 * numOfNickles) + (0.1 * numOfDimes) + (0.25 * numOfQuarters) + (1 * numOfLoonies) + (2 * numOfToonies);		
		
		System.out.println("User has $" + totalMoney + " in coins.");
	}

}
