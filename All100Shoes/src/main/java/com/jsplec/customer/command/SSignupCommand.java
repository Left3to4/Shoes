package com.jsplec.customer.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.jsplec.customer.dao.DaoSighup;

public class SSignupCommand implements SCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String customerid = request.getParameter("id");
		String customerpw = request.getParameter("pw");
		String customername = request.getParameter("name");
		String customeraddress = request.getParameter("address");
		String customerphone = request.getParameter("phone");
		
		DaoSighup dao = new DaoSighup();
		dao.sighup(customerid, customerpw, customername, customerphone, customeraddress);
		
	
	

	}

}
