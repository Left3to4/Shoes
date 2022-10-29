package com.jsplec.customer.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.customer.dao.SCustomerCartDao;
import com.jsplec.customer.dto.SCustomerDetailDto;

public class SCustomerCartCommand implements SCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		HttpSession session = request.getSession();
		
		int productid = Integer.parseInt(request.getParameter("productid"));
		int productprice = Integer.parseInt(request.getParameter("productprice"));
		int productstock = Integer.parseInt(request.getParameter("productstock"));
		
		int index = 0;
		
		session.setAttribute("CUSTOMERID", "onestar");
		
		SCustomerCartDao dao = new SCustomerCartDao();
		dao.cartInsert(productid, productprice, productstock);

		ArrayList<SCustomerDetailDto> dtos = dao.selectProduct();
		for(int i = 0; i < dtos.size(); i++) {
			if(productid == dtos.get(i).getProductid()) {
				index++;
			} else {
				
			}
		}
		
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}


}
