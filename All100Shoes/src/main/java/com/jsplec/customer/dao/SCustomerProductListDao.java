package com.jsplec.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jsplec.customer.dto.SCustomerProductListDto;

public class SCustomerProductListDao {

	// Field

	DataSource dataSource;

	// Constructor

	public SCustomerProductListDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Method

	// product 리스트 출력
	public ArrayList<SCustomerProductListDto> productList() {
		ArrayList<SCustomerProductListDto> dtos = new ArrayList<SCustomerProductListDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = dataSource.getConnection();

			String query1 = "select productmodel, productprice from product ";
			String query2 = "where productmodel like '%%' group by productmodel, productprice";

			preparedStatement = connection.prepareStatement(query1 + query2);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int productid = resultSet.getInt("productid");
				String productmodel = resultSet.getString("productmodel");
				int productprice = resultSet.getInt("productprice");
				String productbrand = resultSet.getString("productbrand");
				String productcategory = resultSet.getString("productcategory");

				SCustomerProductListDto dto = new SCustomerProductListDto(productid, productmodel, productprice, productbrand,
						productcategory);
				dtos.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (preparedStatement != null)
					preparedStatement.close();
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dtos;

	} // list
	
	
	/* // product 리스트 출력
	public ArrayList<SCustomerProductListDto> productList(String queryName, String content) {
		ArrayList<SCustomerProductListDto> dtos = new ArrayList<SCustomerProductListDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query1 = "select productmodel, productprice from product ";
			String query2 = "where productmodel like '%%' group by productmodel, productprice";
			
			preparedStatement = connection.prepareStatement(query1 + query2);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				int productid = resultSet.getInt("productid");
				String productmodel = resultSet.getString("productmodel");
				int productprice = resultSet.getInt("productprice");
				String productbrand = resultSet.getString("productbrand");
				String productcategory = resultSet.getString("productcategory");
				
				SCustomerProductListDto dto = new SCustomerProductListDto(productid, productmodel, productprice, productbrand,
						productcategory);
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (preparedStatement != null)
					preparedStatement.close();
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dtos;
		
	} // list */

}
