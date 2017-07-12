package com.xsis.aziz.javacoder;

public class Main {
	

	public Employee employee, director, programer,manager;

	public void inheritanceExample(){
		//get instance
		//polimorphisem
		employee = new Employee();
		director = new Director();
		programer = new Programer();
		manager = new Manager();
		
		
		//casting
		Employee a = new Manager();
		Manager b =(Manager)new Employee();
		String anu = "21";
		Integer ab = Integer.parseInt(anu);
		
				
		
		director.setSalary(5000.0);
		System.out.println("salary direcor :" + director.getSalary());

		
	
	}

	
	public static void main(String[] args) {
//		//empty construct / manual seter
//		Employee emp = new Employee();
//
//		emp.setId(1);
//		emp.setName("aziz");
//		emp.setAddress("banten");
//		emp.setSalary(5000.0);
//		
//		//direct construct using field
//		Employee emp2 = new Employee(2,"tina","jakarta",50009.0);
//		
//		emp.info();
//		emp2.info();
		
		//inheritance
		Main main = new Main();
		main.inheritanceExample();
		
		
	}

}
