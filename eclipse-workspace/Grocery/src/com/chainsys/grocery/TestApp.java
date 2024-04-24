package com.chainsys.grocery;

public class TestApp {

	public static void main(String[] args) {
		System.out.println("\t\t" + "              WELCOME TO THE GROCER'S CHOICE");
		System.out.println(" ");
		System.out.println("Address:3/98 Anna Nagar,Chennai" + "\t\t\t\t\t\t" + "Contact:9443576543");
		System.out.println("Opposite to KFC" + "\t\t\t\t\t\t\t\t" + "GSTIN: 03AWBPP8756K592");
		AppA app = new AppA();
		// app.getDetails();
		app.categoryDetails();
		// app.priceDetails();
		app.quantityDetails();
		app.discount();
		System.out.println(" ");
		System.out.println("\t\t" + "              THANK YOU!! COME AGAIN");
	}
}