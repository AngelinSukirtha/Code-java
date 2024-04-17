package com.chainsys.code;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital hospital = new Hospital();
		hospital.setHospitalName("AAA");
		hospital.setDoctorName("Sam");
		hospital.setPatientlName("Edwin");
		hospital.setPatientId(5);
		hospital.setMobileNumber(9446754365L);
		System.out.println("Hospital Name: " + hospital.getHospitalName());
		System.out.println("Doctor Name: " + hospital.getDoctorName());
		System.out.println("Patient Name: " + hospital.getPatientlName());
		System.out.println("Patient Id: " + hospital.getPatientId());
		System.out.println("Mobile Number: " + hospital.getMobileNumber());
	}
}
