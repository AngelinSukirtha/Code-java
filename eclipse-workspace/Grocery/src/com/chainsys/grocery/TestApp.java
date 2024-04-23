package com.chainsys.grocery;

public class TestApp {

	public static void main(String[] args) {
		AppA app = new AppA();
		app.getDetails();
		app.categoryDetails();
		app.priceDetails();
		app.quantityDetails();
		app.discount();
	}
}