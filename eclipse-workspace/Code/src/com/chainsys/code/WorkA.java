package com.chainsys.code;

import java.util.Scanner;

public class WorkA {
	String empName;
	long empId;

	public void getUserDetails() {
		Scanner scanner = new Scanner(System.in);
		String s1 = "^[a-zA-Z]+$";
		System.out.print("Enter your Name: ");
		empName = scanner.nextLine();
		while (true)
			if (empName.matches(s1)) {
				break;
			} else {
				System.out.println("Enter the valid Data:");
				empName = scanner.next();
			}
		System.out.print("Enter your Employee ID: ");
		empId = scanner.nextLong();
		while (true)

			if (empId >= 0) {
				break;
			} else {
				System.out.println("Enter the valid data:");
				empId = scanner.nextInt();
			}
		return;
	}

	public void printUserDetails() {
		System.out.println("Your Name: " + empName);
		System.out.println("Employee ID: " + empId);
	}

	public void details(String empName, int empId) {
		String password = empName + empId;
		System.out.println("Your password is: " + password);
	}

}
