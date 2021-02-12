package dev.garcia.controllers;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import dev.garcia.models.Employee;
import dev.garcia.services.EmployeeService;

public class EmployeeController {
	
	public static EmployeeService es = new EmployeeService();
	public static Gson gson = new Gson();
	
	public static void getEmployeeByID(HttpServletRequest request, HttpServletResponse response) throws IOException, JsonSyntaxException, JsonIOException {
		String param = request.getParameter("id");
		System.out.println(param);
		
		int id;
		try {
			id = Integer.parseInt(param);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			response.sendError(400, "ID was invalid!");
			return;
		}
		
		Employee e = es.getEmployeeByID(id);
		response.getWriter().append((e != null) ? gson.toJson(e) : "{}");
	}
	
	public static void getEmployeeByUsername(HttpServletRequest request, HttpServletResponse response) throws IOException, JsonSyntaxException, JsonIOException {
		String param = request.getParameter("username");
		System.out.println(param);
		
		Employee e = es.getEmployeeByUsername(param);
		response.getWriter().append((e != null) ? gson.toJson(e) : "{}");
	}

	public static void login(HttpServletRequest request, HttpServletResponse response) throws IOException, JsonSyntaxException, JsonIOException {
		Employee e = gson.fromJson(request.getReader(), Employee.class);
		e = es.login(e.getUsername(), e.getPassword());
		
		if(e != null) {
			Cookie cookie = new Cookie("loggedInUser", e.getUsername());
			cookie.setSecure(true);
			response.addCookie(cookie);
			response.getWriter().append(gson.toJson(e));
		} else {
			response.getWriter().append("{}");
		}
	}
	
	public static void loggedInUser(HttpServletRequest request, HttpServletResponse response) throws IOException, JsonSyntaxException, JsonIOException {
		Cookie[] cookies = request.getCookies();
		Cookie cookie = null;
		String username;
		
		for(int i = 0; i < cookies.length; i++) {
			cookie = cookies[i];
			if(cookie.getName().equals("loggedInUser")) {
				username = cookie.getValue();
				Employee e = es.getEmployeeByUsername(username);
				response.getWriter().append((e != null) ? gson.toJson(e) : "{}");
				break;
			}
		}
	}
	
	public static void logout(HttpServletRequest request, HttpServletResponse response) throws IOException, JsonSyntaxException, JsonIOException {
		Cookie cookie = new Cookie("loggedInUser", "");
		cookie.setMaxAge(0);
		
		response.getWriter().append("Employee is logged out");
	}
	
	public static void updateBalance(HttpServletRequest request, HttpServletResponse response) throws IOException, JsonSyntaxException, JsonIOException {
		Employee e = gson.fromJson(request.getReader(), Employee.class);
		
		boolean success = es.updateBalance(e);
		
		response.getWriter().append((success) ? gson.toJson(e) : "{}");
	}
}
