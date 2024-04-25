package com.chainsys.grocery;

public class GroceryApp {

	public String name;
	public double price;
	public String category;
	int quantity;
	double discount;

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
		return "GroceryApp [discount=" + discount + ", getDiscount()=" + getDiscount() + ", getQuantity()="
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
