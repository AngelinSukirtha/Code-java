package com.chainsys.code;

public class Mobile {
	int mobileId;
	String mobileName;
	int mobileCost;
	boolean model;

	public void validation(int mobileId) {
		if (mobileId >= 0) {
			this.mobileId = mobileId;
		} else {
			System.out.println("INVALID, Please enter correct ID");
		}
	}

	public void validation1(String mobileName) {
		if (mobileName.matches("[a-zA-Z\\s'-]+")) {
			this.mobileName = mobileName;
		} else {
			System.out.println("INVALID, Please enter correct name");
		}
	}

	public void validation2(int mobileCost) {
		if (mobileCost >= 0) {
			this.mobileCost = mobileCost;
		} else {
			System.out.println("INVALID, Please enter correct ID");
		}
	}

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public int getMobileCost() {
		return mobileCost;
	}

	public void setMobileCost(int mobileCost) {
		this.mobileCost = mobileCost;
	}

	public boolean isModel() {
		return model;
	}

	public Mobile(int mobileId, String mobileName, int mobileCost, boolean model) {
		super();
		this.mobileId = mobileId;
		this.mobileName = mobileName;
		this.mobileCost = mobileCost;
		this.model = model;
	}

	public Mobile() {
		// TODO Auto-generated constructor stub
	}

	public void setModel(boolean model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", mobileName=" + mobileName + ", mobileCost=" + mobileCost + ", model="
				+ model + ", getMobileId()=" + getMobileId() + ", getMobileName()=" + getMobileName()
				+ ", getMobileCost()=" + getMobileCost() + ", isModel()=" + isModel() + "]";
	}
}
