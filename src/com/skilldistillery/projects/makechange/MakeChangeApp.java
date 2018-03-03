package com.skilldistillery.projects.makechange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		while (true) {
			System.out.print("Please enter the price of the item: ");
			double itemPrice = kb.nextDouble();

			System.out.print("Please give me money: ");
			double amountPayed = kb.nextDouble();

			if (amountPayed < itemPrice) {
				System.out.println("Sorry, that is not enough money.");
				continue;
			}

			decideChange(itemPrice, amountPayed);
		}
	}

	public static void decideChange(double price, double payed) {
		int twentyDollars = 2000, tenDollars = 1000, fiveDollars = 500, oneDollar = 100, quarter = 25, dime = 10,
				nickel = 5, penny = 1;

		int itemPrice = (int) (price * 100);
		int amountPayed = (int) (payed * 100);

		System.out.println("price " + itemPrice + " payed " + amountPayed);

		int change = (int) (amountPayed - itemPrice);
		int twentyChange = change / twentyDollars;
		change = change % twentyDollars;
		int tenChange = change / tenDollars;
		change = change % tenDollars;
		int fiveChange = change / fiveDollars;
		change = change % fiveDollars;
		int oneChange = change / oneDollar;
		change = change % oneDollar;
		int quarterChange = change / quarter;
		change = change % quarter;
		int dimeChange = change / dime;
		change = change % dime;
		int nickelChange = change / nickel;
		change = change % nickel;
		int pennyChange = change / penny;
		change = change % penny;

		System.out.println("You get " + twentyChange + " $20");
		System.out.println("You get " + tenChange + " $10");
		System.out.println("You get " + fiveChange + " $5");
		System.out.println("You get " + oneChange + " $1");
		System.out.println("You get " + quarterChange + " $0.25");
		System.out.println("You get " + dimeChange + " $0.10");
		System.out.println("You get " + nickelChange + " $0.05");
		System.out.println("You get " + pennyChange + " $0.01");
	}

}
