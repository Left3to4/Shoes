package com.jsplec.customer.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.customer.dao.SCustomerProductListDao;
import com.jsplec.customer.dto.SCustomerProductListDto;

public class SCustomerProductListCommand implements SCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		String queryName = request.getParameter("query");
		String content = request.getParameter("content");

		if (queryName == null) {
			queryName = "name";
			content = "";
		}

		SCustomerProductListDao dao = new SCustomerProductListDao();
		ArrayList<SCustomerProductListDto> dtos = dao.list(queryName, content);
		request.setAttribute("list", dtos);
	}

}