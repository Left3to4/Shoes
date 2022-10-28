package com.jsplec.customer.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.customer.dao.SCustomerDetailDao;
import com.jsplec.customer.dto.SCustomerDetailDto;

public class SCustomerDetailCommand implements SCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		SCustomerDetailDao dao = new SCustomerDetailDao();
		String productmodel = dao.productDetail();
		
		ArrayList<SCustomerDetailDto> dtos = dao.productDetail2(productmodel);
		
		request.setAttribute("list", dtos);
		
	}

}
