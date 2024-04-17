package com.chainsys.code;

public class WorkB extends WorkA{

	public void details(String empName, int empId) {
	String userId=empName +empId;
	System.out.println("Your User ID is: "+ userId);
}

}
