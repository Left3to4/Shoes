package com.jsplec.customer.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.manager.dao.MAddDao;

public class SCustomerIdCheckCommand implements SCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String customerid=request.getParameter("customerid");
		MAddDao dao=new MAddDao();
		boolean check=dao.idCheck(customerid);
		
		request.setAttribute("CHECK", check);
		request.setAttribute("CHECKID", customerid);
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
