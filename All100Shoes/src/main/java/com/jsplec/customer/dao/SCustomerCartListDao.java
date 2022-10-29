package com.jsplec.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import com.jsplec.customer.dto.SCustomerCartListDto;
import com.jsplec.customer.dto.SCustomerDetailDto;

public class SCustomerCartListDao {

	DataSource dataSource;
	
	public SCustomerCartListDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<SCustomerCartListDto> cartList(HttpServletRequest request) {
		
		ArrayList<SCustomerCartListDto> dtos = new ArrayList<SCustomerCartListDto>();
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		HttpSession session = request.getSession();
		
		try {
			connection = dataSource.getConnection();
			
			String query1 = "select o.orderid, p.productid, p.productmodel, p.productprice, p.productcategory, p.productsize, o.orderquantity ";
			String query2 = "from product p, orders o where o.customerid = '" + session.getAttribute("CUSTOMERID") + "' and o.orderstatus = '장바구니' and p.productid = o.shoesid";
			
			preparedStatement = connection.prepareStatement(query1 + query2);
			
			rs = preparedStatement.executeQuery();
			
			while(rs.next()) {

				int orderid = rs.getInt(1);
				int productid = rs.getInt(2);
				String productmodel = rs.getString(3);
				int productprice = rs.getInt(4);
				String productcategory = rs.getString(5);
				String productsize = rs.getString(6);
				int orderquantity = rs.getInt(7);
				
				SCustomerCartListDto dto = new SCustomerCartListDto(orderid, productid, productmodel, productprice, productcategory, productsize, orderquantity);
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
	} // productDetailSize() --
	
	public SCustomerCartListDto cartTotalPrice(HttpServletRequest request) {
		
		SCustomerCartListDto dto = null;
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		HttpSession session = request.getSession();
		
		try {
			connection = dataSource.getConnection();
			
			String query1 = "select count(*), sum(ordersaleprice) from orders where orderstatus = '장바구니' and customerid = '" + session.getAttribute("CUSTOMERID") + "'";
			System.out.println("session : " + session.getAttribute("CUSTOMERID"));
			preparedStatement = connection.prepareStatement(query1);
			
			rs = preparedStatement.executeQuery();
			
			while(rs.next()) {
				
				int listCount = rs.getInt(1);
				int listTotalSum = rs.getInt(2);

				dto = new SCustomerCartListDto(listCount, listTotalSum);
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
		return dto;
	} // productDetailSize() --
	
}
