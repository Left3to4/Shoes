package com.jsplec.customer.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface SCustomerCommand {

	public void execute(HttpServletRequest request, HttpServletResponse response);
}
