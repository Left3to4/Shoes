package com.jsplec.manager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jsplec.manager.dto.MHistoryDto;
import com.jsplec.manager.dto.MSalesDto;

public class MSalesListDao {

	// F
	DataSource dataSource;
	
	// C
	public MSalesListDao() {
		// TODO Auto-generated constructor stub
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// M
	public ArrayList<MSalesDto> salesList(){
		ArrayList<MSalesDto> dtos = new ArrayList<>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select sum(ordersaleprice), orderdate from orders ";
			String query1 = "group by orderdate";
			preparedStatement = connection.prepareStatement(query+query1);
			resultSet = preparedStatement.executeQuery();
			int i = 0;
			
			while(resultSet.next()) {
				i += 1;
				int seq = i;
				int sales = resultSet.getInt("sum(ordersaleprice)");
				Timestamp orderdate = resultSet.getTimestamp("orderdate");
				
				MSalesDto dto = new MSalesDto(seq, sales, orderdate);
						
				dtos.add(dto);
				}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return dtos;
		
	}
	
	
	
	
} // End
