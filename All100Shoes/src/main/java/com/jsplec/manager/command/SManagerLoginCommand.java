package com.jsplec.manager.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.manager.dao.MLoginDao;

public class SManagerLoginCommand implements SManagerCommand {
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
	}

	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String managerid = request.getParameter("managerid");
		String managerpw = request.getParameter("managerpw");

		MLoginDao dao = new MLoginDao();
		boolean logincheck = dao.managerCheck(managerid, managerpw);
		return logincheck;
	}

}
