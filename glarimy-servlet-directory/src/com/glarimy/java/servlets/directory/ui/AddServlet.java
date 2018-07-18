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
public class AddServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		double salary = Double.parseDouble(request.getParameter("salary"));
		boolean perm = Boolean.parseBoolean(request.getParameter("permanent"));
		Employee employee = new Employee(name, salary, perm);
		try {
			Directory directory = new ReliableDirectory();
			int eid = directory.save(employee);
			String message = "ID: " + eid;
			response.getWriter().write(message);
		} catch (InvalidInputException enfe) {
			response.getWriter().write(enfe.getMessage());
		} catch (Exception e) {
			response.getWriter().write("Internal error!");
		}
	}

}
