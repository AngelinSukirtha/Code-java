package com.chainsys.grocery;

import java.util.Scanner;

public class TestApp {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("\t\t\t" + "              LOGIN");
		Login app1 = new Login();
		app1.userName(null);
		app1.password(null);
		app1.phoneNo();
		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		System.out.println("\t\t" + "              WELCOME TO THE GROCER'S CHOICE");
		System.out.println(" ");
		System.out.println("Address:3/98 Anna Nagar,Chennai" + "\t\t\t\t\t\t" + "Contact:9443576543");
		System.out.println("Opposite to KFC" + "\t\t\t\t\t\t\t\t" + "GSTIN: 00AWBPP1234K123");
		AppA app = new AppA();
		app.categoryDetails();
		app.quantityDetails();
		// app.moreItems();
		TotalAmount app2 = new TotalAmount();
		app2.moreItems();
		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		app2.discount();
		app2.totalAmount();
		System.out.println(" ");
		System.out.println("\t\t" + "              THANK YOU!! COME AGAIN");
	}
}