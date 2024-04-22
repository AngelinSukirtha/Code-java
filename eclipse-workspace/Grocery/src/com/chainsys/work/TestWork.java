package com.chainsys.work;

public class TestWork {

	public static void main(String[] args) {
		WorkB w1 = new WorkB();
		w1.getUserDetails();
		w1.printUserDetails();
		w1.details(w1.empName, (int) w1.empId);
	}
}
