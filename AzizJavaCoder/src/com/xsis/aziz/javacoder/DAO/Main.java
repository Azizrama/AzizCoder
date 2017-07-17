package com.xsis.aziz.javacoder.DAO;

public class Main {
	public static void main(String[] args) {
		XsisCustomer x = new XsisCustomer(9, "aziz","asd", "911");
		
		CustomerService coCustomerService = new CustomerService();
		coCustomerService.insert(x);
		
	}

}
