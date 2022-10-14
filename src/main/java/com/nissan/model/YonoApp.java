package com.nissan.model;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Customer Class
@Entity
@Table(name = "tblBankDetails")
public class YonoApp {

	// Instance variables
	@Id
	@Column(nullable = false, unique = true)
	private long accountNumber;

	@Column(nullable = false, unique = true)
	private String customerName;
	private String accountType;
	private static double balance;
	private double minimumBalance;
	private long mobileNumber;
	private String customerEmailId;
	private boolean isActive;

	@Column(nullable = false, unique = true)
	private int atmPin;

	@Column(nullable = false, unique = true)
	private String panNumber;

	// Default constructor;
	public YonoApp() {
		super();

	}

	// Parameterized constructor
//	public YonoApp(long accountNumber, String customerName, String accountType, double minimumBalance,
//			long mobileNumber, String customerEmailId, boolean isActive, int atmPin, String panNumber) {
//		super();
//		this.accountNumber = accountNumber;
//		this.customerName = customerName;
//		this.accountType = accountType;
//		this.minimumBalance = minimumBalance;
//		this.mobileNumber = mobileNumber;
//		this.customerEmailId = customerEmailId;
//		this.isActive = isActive;
//		this.atmPin = atmPin;
//		this.panNumber = panNumber;
//	}

	// Getters and setters
	// Getting account number
	public long getAccountNumber() {
		return accountNumber;
	}

	// Generating random account number and assign the value to the accountNumber
	public void setAccountNumber() {
		Random rand = new Random();
		long accountNumber = 100000000 + rand.nextInt(900000000);
		this.accountNumber = accountNumber;
	}

	// Getting customer name
	public String getCustomerName() {
		return customerName;
	}

	// setting customer name
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	// getting account type
	public String getAccountType() {
		return accountType;
	}

	// setting account type
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	// Getting balance
	public static double getBalance() {
		return balance;
	}

	// setting balance
	public void setBalance(double balance) {
		this.balance = balance;
	}

	// getting minimum balance
	public double getMinimumBalance() {
		return minimumBalance;
	}

	// setting minimum balance
	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	// getting mobile number
	public long getMobileNumber() {
		return mobileNumber;
	}

	// setting mobile number
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	// getting customer email ID
	public String getCustomerEmailId() {
		return customerEmailId;
	}

	// Setting customer email id
	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

	// getting ATM pin
	public int getAtmPin() {
		return atmPin;
	}

	// setting ATM pin
	public void setAtmPin() {
		Random rand = new Random();
		int atmPin = 1000 + rand.nextInt(9000);
		this.atmPin = atmPin;
	}

	// Getting pan number
	public String getPanNumber() {
		return panNumber;
	}

	// Setting pan number
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Bank [accountNumber=" + accountNumber + ", customerName=" + customerName + ", accountType="
				+ accountType + ", balance=" + balance + ", minimumBalance=" + minimumBalance + ", mobileNumber="
				+ mobileNumber + ", customerEmailId=" + customerEmailId + ", atmPin=" + atmPin + "]";
	}

}
