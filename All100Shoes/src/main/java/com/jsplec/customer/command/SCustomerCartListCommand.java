package com.jsplec.customer.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.customer.dao.SCustomerCartListDao;
import com.jsplec.customer.dto.SCustomerCartListDto;

public class SCustomerCartListCommand implements SCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		SCustomerCartListDao dao = new SCustomerCartListDao();
		System.out.println("2");
		ArrayList<SCustomerCartListDto> dtos = dao.cartList(request);
		request.setAttribute("list", dtos);
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
