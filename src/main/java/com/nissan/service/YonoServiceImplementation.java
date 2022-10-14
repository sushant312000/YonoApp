package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.YonoApp;
import com.nissan.repo.IYonoRepo;

@Service
public class YonoServiceImplementation implements IYonoServices {

	@Autowired
	IYonoRepo yonoRepo;
	
	@Override
	public YonoApp addNewCustomer(YonoApp _application)
	{
		System.out.println("default value " + _application.getAccountNumber());
		_application.setAccountNumber();
		_application.setAtmPin();
		return yonoRepo.save(_application);
	}

	@Override
	public YonoApp updateCustomer(YonoApp _application) {
		return yonoRepo.save(_application);
	}

	@Override
	public YonoApp deleteCustomer(YonoApp _application) {
		return yonoRepo.save(_application);
	}

	@Override
	public List<YonoApp> allCustomersList() {
		return (List<YonoApp>) yonoRepo.findAll();
	}

	@Override
	public YonoApp detailsOfSpecificCustomer(long accountNumber) {
		YonoApp _application = yonoRepo.searchSpecificCustomer(accountNumber);
		if(accountNumber == _application.getAccountNumber()) {
			return _application;
		}else {
			return null;
		}
	}

	@Override
	public YonoApp deposit(long accountNumber, double depositAmount) {
		if(depositAmount < 0) {
			return null;
		}
		
		YonoApp _application = yonoRepo.searchSpecificCustomer(accountNumber);
		_application.setBalance(depositAmount);
		return yonoRepo.save(_application);
	}

	@Override
	public YonoApp withdraw(long accountNumber, double withdrawAmount) {
		// TODO Auto-generated method stub
		if(withdrawAmount < 0) {
			return null;
		}
		
		YonoApp _application = yonoRepo.searchSpecificCustomer(accountNumber);
		_application.setBalance(_application.getBalance()-withdrawAmount);
		return yonoRepo.save(_application);
	}


}
