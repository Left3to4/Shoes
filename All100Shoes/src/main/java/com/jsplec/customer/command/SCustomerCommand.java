package com.jsplec.customer.command;

import javax.servlet.http.HttpServlet;

public interface SCustomerCommand {

	public void execute(HttpServlet request, HttpServlet response);
}
