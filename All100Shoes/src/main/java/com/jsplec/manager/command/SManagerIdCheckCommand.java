package com.jsplec.manager.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.manager.dao.MAddDao;

public class SManagerIdCheckCommand implements SManagerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String managerid=request.getParameter("managerid");
		MAddDao dao=new MAddDao();
		boolean check=dao.idCheck(managerid);
		
		return check;
	}

}
