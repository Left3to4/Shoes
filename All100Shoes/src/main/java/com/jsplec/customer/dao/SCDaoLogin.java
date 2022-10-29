package com.jsplec.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class SCDaoLogin {

	DataSource dataSource;
	public SCDaoLogin() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public boolean	customerCheck(String customerid, String customerpw) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int count=0;

		try {
			connection = dataSource.getConnection();

			String query = "select count(*) from customer where customerid=? and customerpw=? and customerdeletedate is null";
			ps = connection.prepareStatement(query);
			ps.setString(1, customerid);
			ps.setString(2, customerpw);
			rs = ps.executeQuery();

			if (rs.next()) {
				count=rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs!=null) rs.close();
				if(ps!=null)ps.close();
				if (connection!=null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		if (count==1) {
			return true;
		} else {
			return false;
		}
	}
	// 수저ㅓㅇ해야
	public String checkName(String customerid, String customerpw) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String customername=null;
		boolean check=customerCheck(customerid, customerid);
		
		if (check==true) {
			try {
				connection = dataSource.getConnection();

				String query = "select customername from customer where customerid=? and customerdeletedate is null";
				ps = connection.prepareStatement(query);
				ps.setString(1, customerid);
				rs = ps.executeQuery();

				if (rs.next()) {
					customername=rs.getString(1);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (rs!=null) rs.close();
					if(ps!=null)ps.close();
					if (connection!=null) connection.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		} else {
			customername=null;
		}
		
		return customername;
		
	}
	
	public String customerFindid(String customername, String customerphoe) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String managerid=null;

		try {
			connection = dataSource.getConnection();

			String query = "select customerid from customer where customername=? and customerphoe=? and customerdeletedate is null";
			ps = connection.prepareStatement(query);
			ps.setString(1, customername);
			ps.setString(2, customerphoe);
			rs = ps.executeQuery();

			if (rs.next()) {
				managerid=rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs!=null) rs.close();
				if(ps!=null)ps.close();
				if (connection!=null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return managerid;
	}
	
	public String managerFindPw(String customername, String customerphone, String customerid) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String customerpw=null;

		try {
			connection = dataSource.getConnection();

			String query = "select customerpw from customer where customername=? and customerphone=? and customerid=? and customerdeletedate is null";
			ps = connection.prepareStatement(query);
			ps.setString(1, customername);
			ps.setString(2, customerphone);
			ps.setString(3, customerid);
			rs = ps.executeQuery();

			if (rs.next()) {
				customerpw=rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs!=null) rs.close();
				if(ps!=null)ps.close();
				if (connection!=null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return customerpw;
	}
}
