package com.xsis.aziz.javacoder.DAO;

public class XsisCustomer {
	private int id;
	private String name;
	private String address;
	private String noHp;
	
	public XsisCustomer(int id, String name, String address, String noHp) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.noHp = noHp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNoHp() {
		return noHp;
	}

	public void setNoHp(String noHp) {
		this.noHp = noHp;
	}
	
	public XsisCustomer() {
		// TODO Auto-generated constructor stub
	}
	
}
	
	
	
	
	

