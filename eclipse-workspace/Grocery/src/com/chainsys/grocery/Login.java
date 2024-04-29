package com.chainsys.grocery;

import java.util.Scanner;

public class Login {
	public String userName;
	public String password;
	public String phoneNo;
	Scanner sc = new Scanner(System.in);

	public String userName(String userName) {
		while (true) {
			System.out.println("Enter the Username: " + "\n[Username must have upper case,lower case,and digits]");
			userName = sc.nextLine();
			if (userName.matches("^[a-z A-Z 0-9]{6,}$"))
				break;
			else
				System.out.print("INVALID USERNAME\n");
		}
		return userName;
	}

	public String phoneNo() {
		while (true) {
			System.out.println("Enter your phone number: ");
			phoneNo = sc.nextLine();
			if (phoneNo.matches("^\\d{10}$"))
				break;
			else
				System.out.println("INVALID PHONE NUMBER\n");
		}
		return phoneNo;
	}

	public String password(String password) {
		while (true) {
			System.out.println("Enter the password: "
					+ "\n[password must have upper case,lower case,special characters and digits]");
			password = sc.nextLine();
			if (password.matches("^[a-z A-Z]{4,}[@#$%^&*][0-9]{2,}"))
				break;
			else
				System.out.print("INVALID PASSWORD\n");
		}
		return password;
	}
}
