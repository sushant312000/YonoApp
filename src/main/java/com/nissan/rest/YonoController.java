package com.nissan.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.YonoApp;
import com.nissan.service.IYonoServices;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class YonoController {

	//Field Injection
	@Autowired
	IYonoServices yonoService;
	
	//Adding new customer
	@PostMapping("admin")
	public ResponseEntity<YonoApp> addNewCustomer(@RequestBody YonoApp _application) {
		System.out.println("Adding a new customer");
		return new ResponseEntity<YonoApp>(yonoService.addNewCustomer(_application), HttpStatus.OK);
	}
	
	//Updating a customer
	@PutMapping("admin")
	public YonoApp updateCustomer(@RequestBody YonoApp _application) {
		System.out.println("Updating a customer");
		yonoService.updateCustomer(_application);
		return _application;
	}
	
	//Delete a customer
	@PutMapping("admin/delete")
	public YonoApp deleteCustomer(@RequestBody YonoApp _application) {
		System.out.println("Deleting a customer");
		yonoService.deleteCustomer(_application);
		return _application;
	}
	
	//List all Customers
	@GetMapping("admin")
	public List<YonoApp> allCustomers(){
		return yonoService.allCustomersList();
	}
	
	//Get a specific customer
	@GetMapping("admin/{accountNumber}")
	public YonoApp searchCustomerByAccountNumber(@PathVariable long accountNumber) {
		return yonoService.detailsOfSpecificCustomer(accountNumber);
	}
	
	//Deposit
	@PutMapping("customer/{accountNumber}&{depositAmount}")
	public YonoApp deposit(@PathVariable long accountNumber, double depositAmount) {
		return yonoService.deposit(accountNumber, depositAmount);
	}
	
	@PutMapping("customer/{accountNumber}&{withdrawAmount}")
	public YonoApp withdraw(@PathVariable long accountNumber, double withdrawAmount) {
		return yonoService.withdraw(accountNumber, withdrawAmount);
	}
	
}
