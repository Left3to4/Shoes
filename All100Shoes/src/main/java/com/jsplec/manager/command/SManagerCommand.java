package com.jsplec.manager.command;

import javax.servlet.http.HttpServlet;

public interface SManagerCommand {

	public void execute(HttpServlet request, HttpServlet response);
}
