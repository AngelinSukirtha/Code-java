package com.chainsys.code;

public class Work {
String empName;
int empId;
long empNumber;
String empBloodGroup;
String empEmailId;
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public long getEmpNumber() {
	return empNumber;
}
public void setEmpNumber(long empNumber) {
	this.empNumber = empNumber;
}
public String getEmpBloodGroup() {
	return empBloodGroup;
}
public void setEmpBloodGroup(String empBloodGroup) {
	this.empBloodGroup = empBloodGroup;
}
public String getEmpEmailId() {
	return empEmailId;
}
public void setEmpEmailId(String empEmailId) {
	this.empEmailId = empEmailId;
}
@Override
public String toString() {
	return "Work [empName=" + empName + ", empId=" + empId + ", empNumber=" + empNumber + ", empBloodGroup="
			+ empBloodGroup + ", empEmailId=" + empEmailId + ", getEmpName()=" + getEmpName() + ", getEmpId()="
			+ getEmpId() + ", getEmpNumber()=" + getEmpNumber() + ", getEmpBloodGroup()=" + getEmpBloodGroup()
			+ ", getEmpEmailId()=" + getEmpEmailId() + "]";
}
public Work(String empName, int empId, long empNumber, String empBloodGroup, String empEmailId) {
	super();
	this.empName = empName;
	this.empId = empId;
	this.empNumber = empNumber;
	this.empBloodGroup = empBloodGroup;
	this.empEmailId = empEmailId;
}
}
