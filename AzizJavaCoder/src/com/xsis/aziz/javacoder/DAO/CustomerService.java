package com.xsis.aziz.javacoder.DAO;

import java.sql.PreparedStatement;

public class CustomerService {

	// Insert
	public void insert(XsisCustomer xsisCustomer) {
		String sql = "insert into XSIS_CUSTOMER (ID, NAMA, ADDRESS, NO_HP)" + "values(?,?,?,?)";

		PreparedStatement pas = DbTtils.getPreparedStatement(sql, DbTtils.getConnect());

		try {
			pas.setInt(1, xsisCustomer.getId());
			pas.setString(2, xsisCustomer.getName());
			pas.setString(3, xsisCustomer.getAddress());
			pas.setString(4, xsisCustomer.getNoHp());
			pas.executeUpdate();
			System.out.println(xsisCustomer.getName() + " berhasil tersimpan");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
