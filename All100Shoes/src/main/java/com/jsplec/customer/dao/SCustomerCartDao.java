package com.jsplec.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

public class SCustomerCartDao {

	DataSource dataSource;
	HttpSession session;
	
	public SCustomerCartDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void cartInsert(int shoesid, int ordersaleprice, int orderquantity) {
		System.out.println(shoesid);
		System.out.println(ordersaleprice);
		System.out.println(orderquantity);
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = dataSource.getConnection();
			
			String query = "insert into orders (customerid, shoesid, orderquantity, ordersaleprice, orderstatus) values ('onestar', ?, ?, ?, '장바구니')";
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setInt(1, shoesid);
			preparedStatement.setInt(2, orderquantity);
			preparedStatement.setInt(3, ordersaleprice);

			preparedStatement.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	} // cartInsert() --
	
}
