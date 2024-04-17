package com.chainsys.code;

import java.util.Scanner;

public class ABCBank {
	long accountNumber;
	String depositerName;
	String branch;
	String bankName;
	long mobileNumber;

	public void getUserDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your Bank Name: ");
		bankName = scanner.nextLine();
		String s1 = "^[a-zA-Z]+$";
		System.out.print("Enter your branch name: ");
		branch = scanner.nextLine();
		while (true)
			if (branch.matches(s1)) {
				break;
			} else {
				System.out.println("Enter the valid Data:");
				branch = scanner.next();
			}
		System.out.print("Enter your Name: ");
		depositerName = scanner.nextLine();
		while (true)
			if (depositerName.matches(s1)) {
				break;
			} else {
				System.out.println("Enter the valid Data:");
				depositerName = scanner.next();
			}

		System.out.print("Enter your mobile number: ");
		mobileNumber = scanner.nextLong();
		while (true)

			if (mobileNumber > 0) {
				break;
			} else {
				System.out.println("Enter the valid data:");
				mobileNumber = scanner.nextInt();
			}

		System.out.print("Enter your account number: ");
		accountNumber = scanner.nextLong();
		while (true)

			if (accountNumber > 0) {
				break;
			} else {
				System.out.println("Enter the valid data:");
				accountNumber = scanner.nextInt();
			}
		return;
	}

	public void printUserDetails() {
		System.out.println("Bank Name: " + bankName);
		System.out.println("Branch Name: " + branch);
		System.out.println("Depositer Name: " + depositerName);
		System.out.println("Mobile number: " + mobileNumber);
		System.out.println("Account number: " + accountNumber);
	}

	public void deposit(double amount, int accountNumber) {
		int balance = 500;
		balance += amount;
		System.out.println("Your balance" + balance);
	}

	public void deposit(double amount, int accountNumber, String depositerName) {
		int balance = 500;
		balance += amount;
		System.out.println("Your balance amount : " + balance + " deposited by " + depositerName);
	}
}
