package com.skilldistillery.projects.makechange;

//simple cash register app that takes a user input for price & how much they payed
//will printout the correct amount of bills and change to give the customer to use
//the least amount possible

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		while (true) {
			//prompt user for price
			System.out.println("(To quit the program, simply type 0 for both of the following options.)");
			System.out.print("Please enter the price of the item: ");
			double itemPrice = kb.nextDouble();

			//prompt user for payment amount
			System.out.print("Please give me money: ");
			double amountPayed = kb.nextDouble();
			
			
			//set if statement to end app
			if (amountPayed == 0 && itemPrice == 0) {
				System.out.println("Thank you, have a nice day!");
				break;
			}
			//set if statement that informs the customer if they didn't pay enough
			if (amountPayed < itemPrice) {
				System.out.println("Sorry, that is not enough money.");
				System.out.println("");
				continue;
			}
			//set if statement for exact change
			if (amountPayed == itemPrice) {
				System.out.println("Oh wow, that's exact change! Thank you, have a nice day!");
				System.out.println("");
				continue;
			}

			//send doubles to decideChange method
			decideChange(itemPrice, amountPayed);
		}
		
		kb.close();
	}

	//this method decides how much change to give the customer as well as print out the results
	public static void decideChange(double price, double payed) {
		//assign each currency a vale in array
		int[] currency = {2000, 1000, 500, 100, 25, 10, 5, 1};

		//multiply entered numbers by 100 and set to int for easier calculations
		int itemPrice = (int) (price * 100);
		int amountPayed = (int) (payed * 100);

		//calculate the difference between the amount payed and the price
		//set that number to a new variable
		int change = (int) (amountPayed - itemPrice);
		
		//calculate the amount of change needed for each type of currency
		//set change to new amount of leftover via %
		int twentyChange = change / currency[0];
		change = change % currency[0];
		int tenChange = change / currency[1];
		change = change % currency[1];
		int fiveChange = change / currency[2];
		change = change % currency[2];
		int oneChange = change / currency[3];
		change = change % currency[3];
		int quarterChange = change / currency[4];
		change = change % currency[4];
		int dimeChange = change / currency[5];
		change = change % currency[5];
		int nickelChange = change / currency[6];
		change = change % currency[6];
		int pennyChange = change / currency[7];
		change = change % currency[7];
		
		//print out the change the customer receives & final message
		System.out.print("You get " + twentyChange + " $20 bills, ");
		System.out.print(tenChange + " $10 bills, ");
		System.out.print(fiveChange + " $5 bills, ");
		System.out.print(oneChange + " $1 bills, ");
		System.out.print(quarterChange + " quarters, ");
		System.out.print(dimeChange + " dimes, ");
		System.out.print(nickelChange + " nickels, ");
		System.out.println("and " + pennyChange + " pennies.");
		System.out.println("Have a great day!");
		System.out.println("");
	}

}
