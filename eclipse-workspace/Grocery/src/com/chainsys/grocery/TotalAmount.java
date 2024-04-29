package com.chainsys.grocery;

public class TotalAmount extends Discount {

	@Override
	public void moreItems() {
		// TODO Auto-generated method stub
		System.out.println("Want to add more items? [y for yes (or) n for no]: ");
		char choice = sc.next().charAt(0);
		while (choice == 'y') {
			app.categoryDetails();
			app.quantityDetails();
			System.out.println("Want to add more items? [y for yes (or) n for no]: ");
			choice = sc.next().charAt(0);
		}
	}

	@Override
	public void totalAmount() {
		// TODO Auto-generated method stub
		double sgst = priceTotal2 * 12 / 100;
		System.out.println("\t\t\t\t\t\t\t\t\t" + "SGST (%): " + sgst);
		double cgst = priceTotal2 * 12 / 100;
		System.out.println("\t\t\t\t\t\t\t\t\t" + "CGST (%): " + cgst);
		System.out.println("\t\t\t\t\t\t\t\t" + "    " + "Total Amount: " + (priceTotal2 + cgst + sgst));
	}
}
