package com.chainsys.grocery;

import java.util.Scanner;

public class AppA {
	public String category;
	public double price;
	public double priceTotal;
	public double discount;

	public void getDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter item Name: ");
		String name = sc.nextLine();
		String s1 = "^[a-zA-Z]+$";

		while (true) {
			if (name.matches(s1)) {
				break;
			} else {
				System.out.println("Enter the valid Data:");
				name = sc.nextLine();
			}
		}
	}

	public void categoryDetails() {
		System.out.println("Choose your category[Fruits, Vegetables]");
		Scanner sc = new Scanner(System.in);
		String categoryInput = sc.nextLine();
		String s2 = "^[a-zA-Z]+$";

		while (true) {
			if (categoryInput.matches(s2)) {
				this.category = categoryInput;
				break;
			} else {
				System.out.println("Enter the valid Data:");
				categoryInput = sc.nextLine();
			}
		}
	}

	public void priceDetails() {
		System.out.println("Enter the price");
		Scanner sc = new Scanner(System.in);
		price = sc.nextInt();
	}

	public void quantityDetails() {
		System.out.println("Enter the quantity");
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		priceTotal = q * price;
		System.out.println("Your price amount is " + priceTotal);
	}

	public void discount() {
		if (priceTotal > 1000) {
			discount = 0.1 * priceTotal;
			priceTotal -= discount;
			System.out.println("Your price amount with discount is " + priceTotal);
		} else if (priceTotal > 5000) {
			discount = 0.2 * priceTotal;
			priceTotal -= discount;
			System.out.println("Your price amount with discount is " + priceTotal);
		} else if (priceTotal > 10000) {
			discount = 0.3 * priceTotal;
			priceTotal -= discount;
			System.out.println("Your price amount with discount is " + priceTotal);
		} else {
			System.out.println("No Discount");
		}
	}
}