package com.jsplec.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import com.jsplec.customer.dto.SCustomerDetailDto;

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

	public void cartInsert(int productid, int ordersaleprice, int orderquantity) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = dataSource.getConnection();
			
			String query = "insert into orders (customerid, productid, orderquantity, ordersaleprice, orderstatus) values (?, ?, ?, ?, '장바구니')";
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, (String)session.getAttribute("CUSTOMERID"));
			preparedStatement.setInt(2, productid);
			preparedStatement.setInt(3, orderquantity);
			preparedStatement.setInt(4, ordersaleprice);

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
	
	public ArrayList<SCustomerDetailDto> selectProduct() {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		ArrayList<SCustomerDetailDto> dtos = new ArrayList<SCustomerDetailDto>();
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select productid from orders where orderstatus = '장바구니' and customerid = '" + session.getAttribute("CUSTOMERID") + "'";
			
			preparedStatement = connection.prepareStatement(query);
			rs = preparedStatement.executeQuery();
			
			if(rs.next()) {
				
				int productid = rs.getInt(1);
				
				SCustomerDetailDto dto = new SCustomerDetailDto(productid);
				dtos.add(dto);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return dtos;
	} // productDetailModel() --
	
}
