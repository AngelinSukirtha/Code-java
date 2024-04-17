package com.chainsys.code;

public class Bank {
	String bankName;
	String branch;
	String depositerName;
	String mobileNumber;
	int amount;
	long accountNumber;
	int balance;
	float interest;

	String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getDepositerName() {
		return depositerName;
	}

	public void setDepositerName(String depositerName) {
		this.depositerName = depositerName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public float getInterest() {
		return interest;
	}

	public void setInterest(float interest) {
		this.interest = interest;
	}

	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", depositerName=" + depositerName + ", mobileNumber=" + mobileNumber
				+ ", amount=" + amount + ", accountNumber=" + accountNumber + ", balance=" + balance + ", interest="
				+ interest + ", getBankName()=" + getBankName() + ", getDepositerName()=" + getDepositerName()
				+ ", getMobileNumber()=" + getMobileNumber() + ", getAmount()=" + getAmount() + ", getAccountNumber()="
				+ getAccountNumber() + ", getBalance()=" + getBalance() + ", getInterest()=" + getInterest() + "]";
	}

	public Bank(String bankName, String depositerName, String mobileNumber, int amount, long accountNumber, int balance,
			int interest) {
		super();
		this.bankName = bankName;
		this.depositerName = depositerName;
		this.mobileNumber = mobileNumber;
		this.amount = amount;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interest = interest;
	}
}
