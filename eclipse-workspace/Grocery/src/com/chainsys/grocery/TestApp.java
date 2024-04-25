package com.chainsys.grocery;

import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t" + "              WELCOME TO THE GROCER'S CHOICE");
		System.out.println(" ");
		System.out.println("Address:3/98 Anna Nagar,Chennai" + "\t\t\t\t\t\t" + "Contact:9443576543");
		System.out.println("Opposite to KFC" + "\t\t\t\t\t\t\t\t" + "GSTIN: 03AWBPP8756K592");
		AppA app = new AppA();
		app.categoryDetails();
		app.quantityDetails();
		app.moreItems();
		app.addPrice();
		app.discount();
		app.totalAmount();
		System.out.println(" ");
		System.out.println("\t\t" + "              THANK YOU!! COME AGAIN");
	}}