package com.glarimy.java.servlets.directory.ui;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.core.compiler.InvalidInputException;

import com.glarimy.java.servlets.directory.api.Directory;
import com.glarimy.java.servlets.directory.api.Employee;
import com.glarimy.java.servlets.directory.api.EmployeeNotFoundException;
import com.glarimy.java.servlets.directory.service.ReliableDirectory;

/*
 * /directory/employees/findEmployee?eid=
 * /directory/employees/addEmployee?name=asdf&salary=asdf&permanent=asf
 * 
 */

@SuppressWarnings("serial")
public class FindServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int eid = Integer.parseInt(request.getParameter("eid"));
		try {
			Directory directory = new ReliableDirectory();
			Employee employee = directory.find(eid);
			String message = "Name: " + employee.getName();
			response.getWriter().write(message);
		} catch (EmployeeNotFoundException enfe) {
			response.getWriter().write("Sorry! No employee found with id: " + eid);
		} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().write("Internal error!");
		}
	}

}
