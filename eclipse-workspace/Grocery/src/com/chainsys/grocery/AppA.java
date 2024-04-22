package com.chainsys.grocery;

import java.util.Scanner;

public class AppA {

	public Object category;
	public int quantity;
	public int price;

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
		System.out.println("Choose your category");
		System.out.println("Fruits, Vegetables");
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
		if ("Fruits".equals(category)) {
			price = 50;
		} else if ("Vegetables".equals(category)) {
			price = 40;
		}
	}

	public void quantityDetails(int priceDetails) {
		System.out.println("Enter the quantity");
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		quantity = q * priceDetails;
		System.out.println("Your price amount is " + quantity);
		return;
	}

}