package com.bayviewglen.hangman;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class HangMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner (System.in);
		
		String playerOneName;
		String playerTwoName;
		String playerInput; 								
		String creator = "";				
	    String wanderer = "";					
		String ALPHA_NUMERIC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1123456789";
		final String CONSTANT_ALPHA_NUMERIC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1123456789";
		final String SPACE_ALPHA_NUMERIC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1123456789 ";
		long current = System.currentTimeMillis();
		int playerOneScore = 1;
		int playerTwoScore = 1;
		int playerOneWin = playerOneScore - playerTwoScore;
		int playerTwoWin = playerTwoScore - playerOneScore;
		int roundNumber = 1;
		int usedGuesses = 0;
		final int threeSeconds = 3000;
		final int twoSeconds = 2000;
		final int oneSecond = 1000;
		final int HIDE_ANSWER = 35;
		final int MOST_GUESSES = 7;
		final int EVEN_ROUND = 2;
		final int PLAYER_TURN = 2;
		final int PLAYER_ONE = 1;
		final int PLAYER_TWO = 0;
		final int FRESH_START = 0;
		final int PLAYER_FAILED = -1;
		final int NON_ALPHA_NUMERIC = -1;
		
		
		System.out.print("Prepare yourselves for an epic game of HANGMAN!!!!!");
		System.out.println();
		System.out.println();
		
		while((System.currentTimeMillis() - current) < threeSeconds){		
		}
		
		System.out.print("Player 1 Name (First, Middle, Last): "); 
		playerOneName = keyboard.nextLine();
		System.out.println();

		while((System.currentTimeMillis() - current) < oneSecond){		
		}
		
		System.out.print("Welcome " + playerOneName + "!");
		System.out.println();
		System.out.println();

		while((System.currentTimeMillis() - current) < twoSeconds){		
		}
		
		System.out.print("Player 2 Name (First, Middle, Last): ");
		playerTwoName = keyboard.nextLine();
		System.out.println();

		while((System.currentTimeMillis() - current) < oneSecond){		
		}
		
		System.out.print("Welcome " + playerTwoName + "!");
		System.out.println();
		System.out.println();
		
		while((System.currentTimeMillis() - current) < twoSeconds){		
		}
		
		//Hang-man Game- Start
		boolean gameOver = false;
		while(!gameOver){
			
			boolean roundOver = false;
			while (!roundOver){
				ALPHA_NUMERIC = CONSTANT_ALPHA_NUMERIC;
				System.out.println("____________________Round " + roundNumber + "____________________");
				System.out.println();
				
				 if (roundNumber % PLAYER_TURN == PLAYER_ONE) {
	                 creator = playerOneName;
	                 wanderer = playerTwoName;
	           } else if (roundNumber % PLAYER_TURN == PLAYER_TWO) {
	                 creator = playerTwoName;
	                 wanderer = playerOneName;
	           }
				 System.out.println(creator + ", please enter a phrase for " + wanderer + " to guess: ");
				 String answer = "";
				 boolean valid = true;
				 while (valid) {
					 answer = keyboard.nextLine().toUpperCase();
					 valid = false;
					 for (int i = 0; i < answer.length(); i++) {
						 if(SPACE_ALPHA_NUMERIC.indexOf(answer.charAt(i)) == NON_ALPHA_NUMERIC){
							 System.out.println("ERROR!!! Please enter another phrase, using strictly alpha-numeric characters: ");
							 answer = keyboard.nextLine().toUpperCase();
							 valid = true;
						 }
					 }
					 
					 for (int i = 0; i <= HIDE_ANSWER; i++){
						 System.out.println();
					 }
					 
					 String phrase = "";
					 for (int i = 0; i < answer.length(); i++){
						 if (answer.charAt(i) == ' ')
							 phrase += "/ ";
						 else
							 phrase += "_ ";
					 }
					 System.out.println(phrase); 				//provide the person guessing with the restrictions/clue (number of words and letters)
					 System.out.println();
					 
					 //the other player begins to guess
					 while (usedGuesses <= MOST_GUESSES && !roundOver){
						 System.out.println(wanderer + ", you have used " + usedGuesses + " guesses. Please enter 1 to solve the whole phrase or enter 2 to guess a single character: ");
						 String option = keyboard.nextLine();
						 
						//option 1 (full solution)- start
						 if(option.equals("1")){
							 System.out.println(wanderer + ", please enter your solution: ");
							 valid = true;
							 while(valid){
								 playerInput = keyboard.nextLine().toUpperCase();
								 valid = false;
								 for (int i = 0; i < answer.length(); i++){
									 if(SPACE_ALPHA_NUMERIC.indexOf(answer.charAt(i)) == NON_ALPHA_NUMERIC){
										 System.out.println("ERROR!!! Please guess again, using strictly alpha-numeric characters: ");
										 answer = keyboard.nextLine().toUpperCase();
										 valid = true;
									 }
								 }if(playerInput.equals(answer)){
									 System.out.println("Wow! You were correct!");
									 System.out.println();
									 System.out.println();
									 System.out.println();
									 if(playerOneName == wanderer){					
										 playerOneScore += MOST_GUESSES - usedGuesses;
									 }else{
										 playerTwoScore += MOST_GUESSES - usedGuesses;
									 }
									 roundNumber ++;
									 usedGuesses = FRESH_START;
									 roundOver = true;
								 }
								 if(!playerInput.equals(answer)){
									 System.out.println("Oops! You are incorrect!");
									 usedGuesses ++;
									 
								 }
								 if (usedGuesses == MOST_GUESSES){
									 System.out.println(wanderer + ", you failed to correctly solve! :( ");
									 System.out.println("Correct answer: " + answer);
									 System.out.println();
									 System.out.println();
									 System.out.println();
									 if(playerOneName == wanderer){					// 1 + (-1) = 0 points for player that failed to guess answer in 7 tries
										 playerOneScore += PLAYER_FAILED;
									 }else{
										 playerTwoScore += PLAYER_FAILED;
									 }
									 roundNumber++;
									 usedGuesses = FRESH_START;
									 roundOver = true;
								 }
							 
							 }
						 }
						 //option 1 (full solution)- start

						 
						 
						 //option 2 (single char/int)- start
						 if(option.equals("2")){
							 System.out.println(wanderer + ", trying using: ");
							 for(int i = 0; i < ALPHA_NUMERIC.length(); i++){
								 System.out.print(ALPHA_NUMERIC.charAt(i) + "");
							 }System.out.println("\n");

							 System.out.println(wanderer + " please enter a character: ");
							 valid = true;
							 while(valid){
								 playerInput = keyboard.nextLine().toUpperCase();
								 valid = false;
								 
								 if(playerInput.length()>= 2){
									 System.out.println("ERROR!!! You can only enter a single character: ");
									 playerInput = keyboard.nextLine().toUpperCase();
									 valid = false;
								 }
								 else if(SPACE_ALPHA_NUMERIC.indexOf(playerInput)== NON_ALPHA_NUMERIC){
									 System.out.println("ERROR!!! Please guess again, using strictly an alpha-numeric character: ");
									 answer = keyboard.nextLine().toUpperCase();
									 usedGuesses--;
									 valid = false; 
								 }
								 else if(playerInput.equals("")){
									 System.out.println("ERROR!!! Please enter a letter/number: ");
									 usedGuesses--;
									 valid = false;
								 }
								 else{
									 valid = false;
									 ALPHA_NUMERIC = ALPHA_NUMERIC.substring(0,ALPHA_NUMERIC.indexOf(playerInput)) + "_" + ALPHA_NUMERIC.substring(ALPHA_NUMERIC.indexOf(playerInput) + 1);
								 }
								 if (answer.indexOf(playerInput) != -1){
									 System.out.print(playerInput + " is in the string.");
									 String temporary = "";
									 for (int i = 0; i < answer.length(); i++){
										 
										 if(answer.charAt(i) == playerInput.charAt(0)){
											 temporary += playerInput.charAt(0) + " ";											 
										 }else{
											 temporary += phrase.charAt(i * 2) + " ";
										 }
									 }
									 phrase = temporary;
									 System.out.println();
									 for (int z = 0; z < phrase.length(); z++){
										 System.out.print(phrase.charAt(z));
									 }
									 usedGuesses++;
								 }else{
									 System.out.println("Character is not in the string.");
									 System.out.println();
									 for(int z = 0; z < phrase.length(); z++){
										 System.out.print(phrase.charAt(z));
									 }
									 System.out.println();
									 usedGuesses++;
									 if(usedGuesses == MOST_GUESSES){
										 System.out.println(wanderer + ", you failed to correctly solve! :( ");
										 System.out.println("Correct answer: " + answer);
										 System.out.println();
										 System.out.println();
										 System.out.println();
										 if(playerOneName == wanderer){					// 1 + (-1) = 0 points for player that failed to guess answer in 7 tries
											 playerOneScore += PLAYER_FAILED;
										 }else{
											 playerTwoScore += PLAYER_FAILED;
										 }
										 roundOver = true;
										 usedGuesses = FRESH_START;
										 roundNumber++;
									 }
								 }
								 System.out.println();
								 System.out.println();
								 if(phrase.indexOf("_") == -1){
									 System.out.println("Good job! You solved it!");
									 if(roundNumber % EVEN_ROUND != 1){
										 playerOneScore += MOST_GUESSES - usedGuesses;
									}else{
										playerTwoScore += MOST_GUESSES - usedGuesses;
									}
									 roundOver = true;
									 usedGuesses = FRESH_START;
									 roundNumber++;
								 }
									 
							 }
						 }
						//option 2 (single char/int)- end
					 }
					 
				 }
				 
			 }
						 
			 }
			 //Hang-man Game- end

		
			 if(roundNumber == 6 && playerOneScore == playerTwoScore){
				 System.out.print("You are tied! Here comes the time breaker... \n");
				 
				 while((System.currentTimeMillis() - current) < threeSeconds){		
					}										//play one more round to break the tie
				 
			 }if(roundNumber == 6 && playerOneScore > playerTwoScore){
				 System.out.print("Congrats " + playerOneName + "! You are the winner! You scored " + playerOneWin + " points more than " + playerTwoName + "!");
				 gameOver = true;							//Player 1 wins	
				 
			 }if(roundNumber == 6 && playerTwoScore > playerOneScore){
				 System.out.print("Congrats " + playerTwoName + "! You are the winner! You scored " + playerTwoWin + " points more than " + playerOneName + "!");
				 gameOver = true;							//Player 2 wins	
			 
			 }																										 			 

	}
}

