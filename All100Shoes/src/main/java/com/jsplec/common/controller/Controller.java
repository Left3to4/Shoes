package com.jsplec.common.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.customer.command.SCustomerCommand;
import com.jsplec.customer.command.SCustomerDetailCommand;
import com.jsplec.customer.command.SCustomerIdCheckCommand;
import com.jsplec.customer.command.SCustomerLoginCommand;
import com.jsplec.manager.command.SManagerAddCommand;
import com.jsplec.manager.command.SManagerCommand;
import com.jsplec.manager.command.SManagerIdCheckCommand;
import com.jsplec.manager.command.SManagerLoginCommand;
import com.jsplec.manager.command.SManagerMypageDeleteCommand;
import com.jsplec.manager.command.SManagerMypageUpdateCommand;
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
		case("/Manager/login.do"):
			managercommand = new SManagerLoginCommand();
			boolean check = managercommand.execute2(request, response);
			
			if (check == false) {
				request.setAttribute("CHECK", check);
				viewPage = "managerlogin.jsp";
			} else {
				viewPage = "managerMain.jsp";
			}
			break;
		case("/Manager/idcheck.do"):
	         managercommand=new SManagerIdCheckCommand();
	         managercommand.execute(request, response);
	         
	         viewPage="managerAdd.jsp";
	         break;
	         
	      case("/Manager.delete.do"):
	         managercommand=new SManagerMypageDeleteCommand();
	         managercommand.execute(request, response);
	         viewPage="managerMain.jsp";
	         break;
	         
	      case("/Manager.update.do"):
	         managercommand=new SManagerMypageUpdateCommand();
	         managercommand.execute(request, response);
	         viewPage="managerMain.jsp";
	         break;
	      
	      case("/Manager/manageradd.do"):
	         managercommand=new SManagerAddCommand();
	         managercommand.execute(request, response);
	         viewPage="managerlogin.jsp";
	         break;
	         
//			-------------- 예진 --------------------------
		case("/Manager/userlist.do"):
			managercommand = new SManagerUserListCommand();
			managercommand.execute(request, response);
			viewPage = "managerUserList.jsp";
			break;
//			-------------- 오수 --------------------------
			
//			-------------- 태권 --------------------------
			
//			-------------- 한별 --------------------------
		case("/Customer/productDetailSize.do"):
			customercommand = new SCustomerDetailCommand();
			customercommand.execute(request, response);
			viewPage = "productDetail.jsp";
			break;

		case("/Customer/productDetailStock.do"):
			System.out.println("넘어옴");
			break;
		
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}
}
