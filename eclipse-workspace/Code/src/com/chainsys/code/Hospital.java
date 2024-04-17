package com.chainsys.code;

public class Hospital {
	String hospitalName;
	String doctorName;
	String patientName;
	int patientId;
	long mobileNumber;

	public void validation(String hospitalName) {
		if (hospitalName.matches("[a-zA-Z\\s'-]+")) {
			this.hospitalName = hospitalName;
		} else {
			System.out.println("INVALID, Please enter correct hospital name");
		}
	}

	public void validation1(String doctorName) {
		if (doctorName.matches("[a-zA-Z\\s'-]+")) {
			this.doctorName = doctorName;
		} else {
			System.out.println("INVALID, Please enter correct name");
		}
	}

	public void validation2(String patientName) {
		if (patientName.matches("[a-zA-Z\\s'-]+")) {
			this.patientName = patientName;
		} else {
			System.out.println("INVALID, Please enter your correct name");
		}
	}

	public void validation3(int patientId) {
		if (patientId >= 0) {
			this.patientId = patientId;
		} else {
			System.out.println("INVALID, Please enter correct ID");
		}
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getPatientlName() {
		return patientName;
	}

	public void setPatientlName(String patientlName) {
		this.patientName = patientlName;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long l) {
		this.mobileNumber = l;
	}

	public Hospital(String hospitalName, String doctorName, String patientName, int patientId, long mobileNumber) {
		super();
		this.hospitalName = hospitalName;
		this.doctorName = doctorName;
		this.patientName = patientName;
		this.patientId = patientId;
		this.mobileNumber = mobileNumber;
	}

	public Hospital() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Hospital [hospitalName=" + hospitalName + ", doctorName=" + doctorName + ", patientlName=" + patientName
				+ ", patientId=" + patientId + ", mobileNumber=" + mobileNumber + ", getHospitalName()="
				+ getHospitalName() + ", getDoctorName()=" + getDoctorName() + ", getPatientlName()="
				+ getPatientlName() + ", getPatientId()=" + getPatientId() + ", getMobileNumber()=" + getMobileNumber()
				+ "]";
	}

}
