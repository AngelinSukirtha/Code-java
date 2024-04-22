package com.chainsys.work;

public class WorkB extends WorkA {

	@Override
	public void printUserDetails() {
		System.out.println("Your Name: " + empName);
		System.out.println("Employee ID: " + empId);
	}

	@Override
	public void details(String empName, int empId) {
		String userId = empName + empId;
		System.out.println("Your User ID is: " + userId);
	}

}
