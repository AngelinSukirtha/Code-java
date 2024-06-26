package com.chainsys.model;

public class UserDetails {
	int userId;
	String userName;
	String userPassword;
	String phoneNumber;
	String email;

	public UserDetails(int userId, String userName, String userPassword, String phoneNumber, String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public UserDetails() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", phoneNumber=" + phoneNumber + ", email=" + email + ", getUserId()=" + getUserId()
				+ ", getUserName()=" + getUserName() + ", getUserPassword()=" + getUserPassword()
				+ ", getPhoneNumber()=" + getPhoneNumber() + ", getEmail()=" + getEmail() + "]";
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
