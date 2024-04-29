package com.chainsys.grocery;

import java.util.Scanner;

public abstract class Discount {
	Scanner sc = new Scanner(System.in);
	AppA app = new AppA();
	public int priceTotal;
	public double discount;
	public double priceTotal2;

	public abstract void moreItems();
//		System.out.println("Want to add more items? [y for yes (or) n for no]: ");
//		char choice = sc.next().charAt(0);
//		while (choice == 'y') {
//			app.categoryDetails();
//			app.quantityDetails();
//			System.out.println("Want to add more items? [y for yes (or) n for no]: ");
//			choice = sc.next().charAt(0);
//		}

	public double discount() {
		if (priceTotal > 0) {
			if (priceTotal > 1000) {
				discount = 0.1 * priceTotal;
				priceTotal2 = priceTotal - discount;
				System.out.println("Congradulations! you get 10% discount");
				System.out.println("Your price amount with discount is " + priceTotal2);
			} else if (priceTotal > 5000) {
				discount = 0.3 * priceTotal;
				priceTotal2 = priceTotal - discount;
				System.out.println("Congradulations! you get 30% discount");
				System.out.println("Your price amount with discount is " + priceTotal2);
			} else if (priceTotal > 10000) {
				discount = 0.9 * priceTotal;
				priceTotal2 = priceTotal - discount;
				System.out.println("Congradulations! you get 90% discount");
				System.out.println("Your price amount with discount is " + priceTotal2);
			} else {
				priceTotal2 = priceTotal - discount;
				System.out.println("NO DISCOUNT!!");
			}
		}
		System.out.println("\t\t\t\t\t\t\t\t" + "     " + "Final price: " + priceTotal2);
		return priceTotal2;
	}

	public abstract void totalAmount();
}
//		double sgst = priceTotal2 * 12 / 100;
//		System.out.println("\t\t\t\t\t\t\t\t\t" + "SGST (%): " + sgst);
//		double cgst = priceTotal2 * 12 / 100;
//		System.out.println("\t\t\t\t\t\t\t\t\t" + "CGST (%): " + cgst);
//		System.out.println("\t\t\t\t\t\t\t\t" + "    " + "Total Amount: " + (priceTotal2 + cgst + sgst));
//	}
