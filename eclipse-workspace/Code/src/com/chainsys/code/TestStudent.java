package com.chainsys.code;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.studentDetails();
		s.studentDetails1();
		System.out.println(" ");
		StudentA s1 = new StudentA();
		s1.studentDetails();//override
		s1.studentDetails1();//parent class
	}

}
