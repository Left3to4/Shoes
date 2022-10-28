package com.jsplec.common.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.customer.command.SCustomerCommand;
import com.jsplec.manager.command.SManagerCommand;
import com.jsplec.manager.command.SManagerLoginCommand;
import com.jsplec.manager.command.SManagerUserListCommand;


/**
 * Servlet implementation class Controller
 */
@WebServlet("*.do")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Controller() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		actionDo(request, response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String viewPage = null;
		SManagerCommand managercommand = null;
		SCustomerCommand customercommand = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		switch(com) {

//		-------------- 유승 --------------------------
		case("/managerlogin.do"):
			viewPage = "Manager/managerlogin.jsp";
			break;
		
		case("/Manager/login.do"):
			
			managercommand = new SManagerLoginCommand();
			boolean check = managercommand.execute2(request, response);
			
			if (check==false) {
				request.setAttribute("CHECK", check);
				viewPage = "http://localhost:8080/All100Shoes/Manager/managerlogin.jsp";
			} else {
				viewPage = "http://localhost:8080/All100Shoes/Manager/managerMain.jsp";
			}
			break;
			
//			-------------- 예진 --------------------------
			case("/Manager/userlist.do"):
			managercommand = new SManagerUserListCommand();
			managercommand.execute(request, response);
			viewPage="managerUserList.jsp";
			break;
			
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}
}
