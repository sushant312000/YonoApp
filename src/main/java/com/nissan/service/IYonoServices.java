package com.nissan.service;

import java.util.List;

import com.nissan.model.YonoApp;

public interface IYonoServices {
	//Add new customer
	YonoApp addNewCustomer(YonoApp _application);
	
	//Update customer
	YonoApp updateCustomer(YonoApp _application);
	
	//Delete a customer
	YonoApp deleteCustomer(YonoApp _application);
	
	//List all customers
	List<YonoApp> allCustomersList();
	
	//Details of specific customer
	YonoApp detailsOfSpecificCustomer(long accountNumber);
	
	//Depositing money 
	YonoApp deposit(long accountNumber, double depositAmount);
	
	//Withdraw money
	YonoApp withdraw(long accountNumber, double withdrawAmount);
}
