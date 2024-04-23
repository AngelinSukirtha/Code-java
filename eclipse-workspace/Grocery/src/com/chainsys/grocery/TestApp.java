package com.chainsys.grocery;

public class TestApp {

	public static void main(String[] args) {
		System.out.println("              WELCOME TO THE GROCER'S CHOICE");
		AppA app = new AppA();
		//app.getDetails();
		app.categoryDetails();
		//app.priceDetails();
		app.quantityDetails();
		app.discount();
		System.out.println(" ");
		System.out.println("              THANK YOU!! COME AGAIN");
	}
}