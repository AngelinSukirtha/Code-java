package com.chainsys.code;

public class BankA extends ABCBank {

	// TODO Auto-generated method stub
	public void deposit(double amount, int accountNumber) {
		int balance = 500;
		balance += amount;
		System.out.println("Your balance is " + balance);
	}
}
