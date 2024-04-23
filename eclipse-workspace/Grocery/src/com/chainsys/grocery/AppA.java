package com.chainsys.grocery;

import java.util.Scanner;

public class AppA {
	public String category;
	public double price;
	public double priceTotal;
	public double discount;

	/*
	 * public void getDetails() { Scanner sc = new Scanner(System.in);
	 * System.out.print("Enter item Name: "); String name = sc.nextLine(); String s1
	 * = "^[a-zA-Z]+$";
	 * 
	 * while (true) { if (name.matches(s1)) { break; } else {
	 * System.out.println("Enter the valid Data:"); name = sc.nextLine(); } } }
	 */

	public void categoryDetails() {
		System.out.println(" ");
		System.out.println("In GROCER'S CHOICE we have Fruits,Vegetables,Nuts,Stationery,Drinks,Grains");
		System.out.println("CHOOSE YOUR CATEGORY");
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
		switch (categoryInput) {
		case "Fruits":
			System.out.println(" ");
			System.out.println("AVAILABLE ITEMS");
			System.out.println(
					"1.Apple" + "\n2.Orange" + "\n3.Grapes" + "\n4.Banana" + "\n5.Watermelon" + "\n6.PineApple");
			System.out.println("Enter the item you want:");
			String itemInput = sc.nextLine();
			switch (itemInput) {
			case "Apple":
				System.out.println("You chose Apple from the Fruits category.");
				price=10;
				System.out.println("Price is "+price);
				break;
			case "Orange":
				System.out.println("You chose orange from the Fruits category.");
				price=12;
				System.out.println("Price is "+price);
				break;
			case "Grapes":
				System.out.println("You chose grapes from the Fruits category.");
				price=15;
				System.out.println("Price is "+price);
				break;
			case "Banana":
				System.out.println("You chose banana from the Fruits category.");
				price=6;
				System.out.println("Price is "+price);
				break;
			case "Watermelon":
				System.out.println("You chose Watermelon from the Fruits category.");
				price=30;
				System.out.println("Price is "+price);
				break;
			case "Pineapple":
				System.out.println("You chose pineapple from the Fruits category.");
				price=40;
				System.out.println("Price is "+price);
				break;
			default:
				System.out.println("INVALID INPUT");
				System.out.println("Enter the valid input");
				itemInput = sc.nextLine();
				break;
			}
			break;
		case "Vegetables":
			System.out.println(" ");
			System.out.println("AVAILABLE ITEMS");
			System.out
					.println("1.Potato" + "\n2.Tomato" + "\n3.Onion" + "\n4.Carrot" + "\n5.Beetroot" + "\n6.Broccoli");
			System.out.println("Enter the item you want:");
			String itemInput1 = sc.nextLine();

			switch (itemInput1) {
			case "Potato":
				System.out.println("You chose potato from the Vegetables category.");
				price=10;
				System.out.println("Price is "+price);
				break;
			case "Tomato":
				System.out.println("You chose tomato from the Vegetables category.");
				price=5;
				System.out.println("Price is "+price);
				break;
			case "Onion":
				System.out.println("You chose onion from the Vegetables category.");
				price=6;
				System.out.println("Price is "+price);
				break;
			case "Carrot":
				System.out.println("You chose carrot from the Vegetables category.");
				price=8;
				System.out.println("Price is "+price);
				break;
			case "Beetroot":
				System.out.println("You chose beetroot from the Vegetables category.");
				price=10;
				System.out.println("Price is "+price);
				break;
			case "Broccoli":
				System.out.println("You chose broccoli from the Vegetables category.");
				price=12;
				System.out.println("Price is "+price);
				break;
			default:
				System.out.println("INVALID INPUT");
				System.out.println("Enter the valid input");
				itemInput1 = sc.nextLine();
				break;
			}
			break;
		case "Nuts":
			System.out.println(" ");
			System.out.println("AVAILABLE ITEMS");
			System.out.println(
					"1.Almonds" + "\n2.Walnuts" + "\n3.Pecans" + "\n4.Cashews" + "\n5.Hazelnuts" + "\n6.Peanuts");
			System.out.println("Enter the item you want:");
			String itemInput2 = sc.nextLine();

			switch (itemInput2) {
			case "Almonds":
				System.out.println("You chose almonds from the Nuts category.");
				price=4;
				System.out.println("Price is "+price);
				break;
			case "Walnuts":
				System.out.println("You chose walnuts from the Nuts category.");
				price=5;
				System.out.println("Price is "+price);
				break;
			case "Pecans":
				System.out.println("You chose pecans from the Nuts category.");
				price=3;
				System.out.println("Price is "+price);
				break;
			case "Cashews":
				System.out.println("You chose cashews from the Nuts category.");
				price=8;
				System.out.println("Price is "+price);
				break;
			case "Hazelnuts":
				System.out.println("You chose hazelnut from the Nuts category.");
				price=10;
				System.out.println("Price is "+price);
				break;
			case "Peanuts":
				System.out.println("You chose peanuts from the Nuts category.");
				price=3;
				System.out.println("Price is "+price);
				break;
			default:
				System.out.println("INVALID INPUT");
				System.out.println("Enter the valid input");
				itemInput2 = sc.nextLine();
				break;
			}
			break;
		case "Stationery":
			System.out.println("AVAILABLE ITEMS");
			System.out.println("1.Notebooks" + "\n2.Diaries" + "\n3.Pen" + "\n4.Pencils" + "\n5.Calculator"
					+ "\n6.Punching Machine");
			System.out.println("Enter the item you want:");

			String itemInput3 = sc.nextLine();

			switch (itemInput3) {
			case "Notebooks":
				System.out.println("You chose notebooks from the Stationery category.");
				price=50;
				System.out.println("Price is "+price);
				break;
			case "Diaries":
				System.out.println("You chose diaries from the Stationery category.");
				price=200;
				System.out.println("Price is "+price);
				break;
			case "Pen":
				System.out.println("You chose pen from the Stationery category.");
				price=20;
				System.out.println("Price is "+price);
				break;
			case "Pencils":
				System.out.println("You chose pencils from the Stationery category.");
				price=5;
				System.out.println("Price is "+price);
				break;
			case "Calculator":
				System.out.println("You chose calculator from the Stationery category.");
				price=500;
				System.out.println("Price is "+price);
				break;
			case "Punching Machine":
				System.out.println("You chose punching machine from the Stationery category.");
				price=600;
				System.out.println("Price is "+price);
				break;
			default:
				System.out.println("INVALID INPUT");
				System.out.println("Enter the valid input");
				itemInput3 = sc.nextLine();
				break;
			}
			break;
		case "Drinks":
			System.out.println(" ");
			System.out.println("AVAILABLE ITEMS");
			System.out
					.println("1.Coca-Cola" + "\n2.Pepsi" + "\n3.Limca" + "\n4.Sprite" + "\n5.Fanta" + "\n6.Appy Fizz");
			System.out.println("Enter the item you want:");
			String itemInput4 = sc.nextLine();

			switch (itemInput4) {
			case "Coca-Cola":
				System.out.println("You chose Coca-Cola from the Drinks category.");
				price=25;
				System.out.println("Price is "+price);
				break;
			case "Pepsi":
				System.out.println("You chose Pepsi from the Drinks category.");
				price=30;
				System.out.println("Price is "+price);
				break;
			case "Limca":
				System.out.println("You chose Limca from the Drinks category.");
				price=15;
				System.out.println("Price is "+price);
				break;
			case "Sprite":
				System.out.println("You chose Sprite from the Drinks category.");
				price=35;
				System.out.println("Price is "+price);
				break;
			case "Fanta":
				System.out.println("You chose Fanta from the Drinks category.");
				price=25;
				System.out.println("Price is "+price);
				break;
			case "Appy Fizz":
				System.out.println("You chose Appy Fizz from the Drinks category.");
				price=30;
				System.out.println("Price is "+price);
				break;
			default:
				System.out.println("INVALID INPUT");
				System.out.println("Enter the valid input");
				itemInput4 = sc.nextLine();
				break;
			}
			break;
		case "Grains":
			System.out.println(" ");
			System.out.println("AVAILABLE ITEMS");
			System.out.println(
					"1.Wheat" + "\n2.Oats" + "\n3.Rice" + "\n4.Corn" + "\n5.Barley" + "\n6.Sorghum" + "\n7.Millet");
			System.out.println("Enter the item you want:");
			String itemInput5 = sc.nextLine();

			switch (itemInput5) {
			case "Wheat":
				System.out.println("You chose wheat from the Grains category.");
				price=50;
				System.out.println("Price is "+price);
				break;
			case "Oats":
				System.out.println("You chose oats from the Grains category.");
				price=50;
				System.out.println("Price is "+price);
				break;
			case "Rice":
				System.out.println("You chose rice from the Grains category.");
				price=60;
				System.out.println("Price is "+price);
				break;
			case "Corn":
				System.out.println("You chose corn from the Grains category.");
				price=20;
				System.out.println("Price is "+price);
				break;
			case "Barley":
				System.out.println("You chose barley from the Grains category.");
				price=30;
				System.out.println("Price is "+price);
				break;
			case "Sorghum":
				System.out.println("You chose sorghum from the Grains category.");
				price=30;
				System.out.println("Price is "+price);
				break;
			case "Millet":
				System.out.println("You chose millet from the Grains category.");
				price=25;
				System.out.println("Price is "+price);
				break;
			default:
				System.out.println("INVALID INPUT");
				System.out.println("Enter the valid input");
				itemInput5 = sc.nextLine();
				break;
			}
			break;
		default:
			System.out.println(" ");
			System.out.println("Not Available");
			System.out.println("Enter the valid category");
			categoryInput = sc.nextLine();
			break;
		}
	}

	/*public void priceDetails() {
		System.out.println(" ");
		System.out.println("Enter the price");
		Scanner sc = new Scanner(System.in);
		price = sc.nextInt();
	}*/

	public void quantityDetails() {
		System.out.println(" ");
		System.out.println("Enter the quantity");
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		while (true) {
			if (q > 0) {
				priceTotal = q * price;
				System.out.println("Your price amount is " + priceTotal);
				break;
			} else {
				System.out.println("Enter the valid Data:");
				q = sc.nextInt();
			}
		}
	}

	public void discount() {
		if (priceTotal > 0) {
			if (priceTotal > 1000) {
				discount = 0.1 * priceTotal;
				priceTotal -= discount;
				System.out.println("Your price amount with discount is " + priceTotal);
			} else if (priceTotal > 5000) {
				discount = 0.3 * priceTotal;
				priceTotal -= discount;
				System.out.println("Your price amount with discount is " + priceTotal);
			} else if (priceTotal > 10000) {
				discount = 0.9 * priceTotal;
				priceTotal -= discount;
				System.out.println("Your price amount with discount is " + priceTotal);
			} else {
				System.out.println("No Discount");
			}
		}
	}
}