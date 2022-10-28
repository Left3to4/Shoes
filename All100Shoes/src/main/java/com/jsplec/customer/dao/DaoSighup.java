package com.jsplec.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class DaoSighup {
	// F
		DataSource dataSource;
		
		// C
		// 생성시 데이터베이스에 바로 연결하기
		public DaoSighup() {
			try {
				Context context = new InitialContext();
				dataSource = (DataSource) context.lookup("java:comp/env/jdbc/shoespj");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		public int checkId(String customerid) {
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;

			int checked = 0;
//			String loginId = null;

			String query = "select count(*) from customer "; // 마지막 띄워주기
			String query2 = "where id = '" + customerid + "' and deletedate is null";

			try {connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query+query2);
			preparedStatement.setInt(1, Integer.parseInt(customerid));
			resultSet = preparedStatement.executeQuery();
			
				if (resultSet.next()) { // true값일때만 가져온다
					checked=resultSet.getInt(1);
					checked = 0;
					System.out.println("result 값 : " + checked);
					 
				}else{
					checked=resultSet.getInt(1);
					checked = 1;
				}

				System.out.println("아이디 중복체크결과 : "+checked);

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
			return checked;
		}


	
	public void sighup(String customerid, String customerpw, String customername, String customerphone , String customeraddress) {
		//write
		Connection connection = null;
		PreparedStatement preparedStatement = null;
	
		
		try {
			connection = dataSource.getConnection();
			
			String query = "insert into shoespj.customer (customerid,customerpw,customername,customerphone,customeraddress,customerinitdate) values(?,?,?,?,?,now())";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, customerid);
			preparedStatement.setString(2, customerpw);
			preparedStatement.setString(3, customername);
			preparedStatement.setString(4, customerphone);
			preparedStatement.setString(5, customeraddress);
			
			preparedStatement.executeUpdate();
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
				
			}
		}
	
		
	}//write
}
