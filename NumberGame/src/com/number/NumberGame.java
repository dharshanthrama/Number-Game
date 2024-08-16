package com.number;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int chances = 8;
		 int finals = 0;
		 boolean playAgain = true;
		 System.out.println("Welcome to the Number Guess Game!");
	        System.out.println("You have " + chances + " chances to guess the correct number.");
		 while(playAgain) {
			 int rand = getRandN(1,100);
			 boolean guess = false;
			 for(int i=0;i<chances;i++) {
	                System.out.print("Chance " + (i + 1) + ": Enter your guess: ");
				 int user = sc.nextInt();
				 if(user == rand) {
					 guess = true;
					 finals+=1;
	                    System.out.println("Congratulations! You've guessed the correct number.");
					 break;
				 }else if(user>rand){
	                    System.out.println("Too HIGH! Try again.");
				 }else {
	                    System.out.println("Too LOW! Try again.");
				 }
			 }
			 if(guess==false) {
	                System.out.println("Sorry, you've used all your chances. The correct number was " + rand);

			 }
			 System.out.print("Do you want to play again? (y/n): ");
			 String pA = sc.next();
			 playAgain = pA.equalsIgnoreCase("y");
		 }
		 }
	
		 public static int getRandN(int min , int max) {
			 Random rand = new Random();
			return rand.nextInt(max-min+1)+min;
		 }
}
