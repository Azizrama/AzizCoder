package com.xsis.aziz.javacoder;

public class Employee {
	
	int    id;
	String name;
	String address;
	Double salary;
	
	public void info(){
		System.out.println("name" + this.name);
		System.out.println("address" + this.address);
		System.out.println("salary" + this.salary);
	}
}
