package com.jsplec.customer.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.customer.dao.SCustomerCartDao;

public class SCustomerCartCommand implements SCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		HttpSession session = request.getSession();
		
		int productid = Integer.parseInt(request.getParameter("productid"));
		int productprice = Integer.parseInt(request.getParameter("productprice"));
		int productstock = Integer.parseInt(request.getParameter("productstock"));
		
		session.setAttribute("CUSTOMERID", "onestar");
		
		SCustomerCartDao dao = new SCustomerCartDao();
		dao.cartInsert(productid, productprice, productstock);
		
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}


}
