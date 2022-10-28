package com.jsplec.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jsplec.customer.dto.SCustomerDetailDto;

public class SCustomerDetailDao {

	DataSource dataSource;
	
	public SCustomerDetailDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public String productDetail() {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		
		String productmodel = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select productmodel from product where productid = 50";
			
			preparedStatement = connection.prepareStatement(query);
			rs = preparedStatement.executeQuery();
			
			if(rs.next()) {
				
				productmodel = rs.getString(1);
				
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
		return productmodel;
	} // productDetail() --
	
	public ArrayList<SCustomerDetailDto> productDetail2(String productname) {
		
		ArrayList<SCustomerDetailDto> dtos = new ArrayList<SCustomerDetailDto>();
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select productid, productmodel, productprice, productsize, productstock from product where productmodel = '" + productname + "'";
			
			preparedStatement = connection.prepareStatement(query);
			rs = preparedStatement.executeQuery();
			
			if(rs.next()) {

				int productid = rs.getInt(1);
				String productmodel = rs.getString(2);
				int productprice = rs.getInt(3);
				String productsize = rs.getNString(4);
				int productstock = rs.getInt(5);
				
				
				SCustomerDetailDto dto = new SCustomerDetailDto(productid, productmodel, productprice, productsize, productstock);
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
	} // productDetail() --
	
	
	
} // End Line 