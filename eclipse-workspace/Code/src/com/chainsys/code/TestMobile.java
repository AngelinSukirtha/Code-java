package com.chainsys.code;

public class TestMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mobile = new Mobile();
		mobile.setMobileId(95);
		mobile.setMobileName("Samsung");
		mobile.setMobileCost(40000);
		mobile.setModel(true);
		System.out.println("Mobile Id: " + mobile.getMobileId());
		System.out.println("Mobile Name: " + mobile.getMobileName());
		System.out.println("Mobile Cost: " + mobile.getMobileCost());
		System.out.println("Model: " + mobile.isModel());
	}

}
