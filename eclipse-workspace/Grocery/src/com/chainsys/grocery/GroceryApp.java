package com.chainsys.grocery;

import java.util.Scanner;

public class GroceryApp {
	Scanner sc = new Scanner(System.in);
	public String name;
	public double price;
	public String category;
	int quantity;
	double discount;
	public double priceTotal;
	public double priceTotal2;
	public double totalPrice;
	public double priceTotal1;
	public String userName;
	public String password;
	public Object P;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public GroceryApp(double priceTotal, Object p, double priceTotal2, double totalPrice, double priceTotal1) {
		super();
		this.priceTotal = priceTotal;
		P = p;
		this.priceTotal2 = priceTotal2;
		this.totalPrice = totalPrice;
		this.priceTotal1 = priceTotal1;
	}

	public double getPriceTotal() {
		return priceTotal;
	}

	public void setPriceTotal(double priceTotal) {
		this.priceTotal = priceTotal;
	}

	public Object getP() {
		return P;
	}

	public void setP(Object p) {
		P = p;
	}

	public double getPriceTotal2() {
		return priceTotal2;
	}

	public void setPriceTotal2(double priceTotal2) {
		this.priceTotal2 = priceTotal2;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getPriceTotal1() {
		return priceTotal1;
	}

	public void setPriceTotal1(double priceTotal1) {
		this.priceTotal1 = priceTotal1;
	}

	public GroceryApp(double discount) {

		this.discount = discount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public GroceryApp(int quantity) {
		super();
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "GroceryApp [priceTotal=" + priceTotal + ", P=" + P + ", priceTotal2=" + priceTotal2 + ", totalPrice="
				+ totalPrice + ", priceTotal1=" + priceTotal1 + ", getPriceTotal()=" + getPriceTotal() + ", getP()="
				+ getP() + ", getPriceTotal2()=" + getPriceTotal2() + ", getTotalPrice()=" + getTotalPrice()
				+ ", getPriceTotal1()=" + getPriceTotal1() + ", getDiscount()=" + getDiscount() + ", getQuantity()="
				+ getQuantity() + ", getName()=" + getName() + ", getPrice()=" + getPrice() + ", getCategory()="
				+ getCategory() + "]";
	}

	public GroceryApp(String name, double price, String category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}
}
