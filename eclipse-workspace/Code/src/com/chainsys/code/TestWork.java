package com.chainsys.code;

public class TestWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkA w = new WorkA();
		w.getUserDetails();
		w.printUserDetails();
		w.details(w.empName, (int) w.empId);
		System.out.println(" ");
		WorkB w1 = new WorkB();
		w1.getUserDetails();
		w1.printUserDetails();
		w1.details(w1.empName, (int) w1.empId);
	}

}
