package dev.garcia.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import dev.garcia.models.Form;
import dev.garcia.services.FormService;

public class FormController {
	
	public static FormService fs = new FormService();
	public static Gson gson = new Gson();
	
	public static void addForm(HttpServletRequest request, HttpServletResponse response) throws IOException, JsonSyntaxException, JsonIOException {
		
		Form f = gson.fromJson(request.getReader(), Form.class);
		
		boolean success = fs.addForm(f);
		
		response.getWriter().append((success) ? gson.toJson(f) : "{}");
	}
	
	public static void getFormByID(HttpServletRequest request, HttpServletResponse response) throws IOException {
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
		
		Form f = fs.getFormByID(id);
		response.getWriter().append((f != null) ? gson.toJson(f) : "{}");
	}
	
	public static void getPendingFormsByEmployeeID(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String param = request.getParameter("emp_id");
		System.out.println(param);
		
		int emp_id;
		try {
			emp_id = Integer.parseInt(param);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			response.sendError(400, "ID was invalid!");
			return;
		}
		
		for(Form f : fs.getPendingFormsByEmployeeID(emp_id)) {
			response.getWriter().append(gson.toJson(f));
		}
	}
	
	public static void getApprovedFormsByEmployeeID(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String param = request.getParameter("emp_id");
		System.out.println(param);
		
		int emp_id;
		try {
			emp_id = Integer.parseInt(param);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			response.sendError(400, "ID was invalid!");
			return;
		}
		
		for(Form f : fs.getApprovedFormsByEmployeeID(emp_id)) {
			response.getWriter().append(gson.toJson(f));
		}
	}

	public static void getDeniedFormsByEmployeeID(HttpServletRequest request, HttpServletResponse response) throws IOException, JsonSyntaxException, JsonIOException {
		String param = request.getParameter("emp_id");
		System.out.println(param);
		
		int emp_id;
		try {
			emp_id = Integer.parseInt(param);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			response.sendError(400, "ID was invalid!");
			return;
		}
		
		for(Form f : fs.getDeniedFormsByEmployeeID(emp_id)) {
			response.getWriter().append(gson.toJson(f));
		}
	}
	
	public static void getFormsBySupervisorID(HttpServletRequest request, HttpServletResponse response) throws IOException, JsonSyntaxException, JsonIOException {
		String param = request.getParameter("emp_id");
		System.out.println(param);
		
		int emp_id;
		try {
			emp_id = Integer.parseInt(param);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			response.sendError(400, "ID was invalid!");
			return;
		}
		
		for(Form f : fs.getFormsBySupervisorID(emp_id)) {
			response.getWriter().append(gson.toJson(f));
		}
	}
	
	public static void getFormsByDeptID(HttpServletRequest request, HttpServletResponse response) throws IOException, JsonSyntaxException, JsonIOException {
		String param = request.getParameter("emp_id");
		System.out.println(param);
		
		int emp_id;
		try {
			emp_id = Integer.parseInt(param);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			response.sendError(400, "ID was invalid!");
			return;
		}
		
		for(Form f : fs.getFormsByDeptID(emp_id)) {
			response.getWriter().append(gson.toJson(f));
		}
	}
	
	public static void getAllPendingForms(HttpServletRequest request, HttpServletResponse response) throws IOException, JsonSyntaxException, JsonIOException {
		for(Form f : fs.getAllPendingForms()) {
			response.getWriter().append(gson.toJson(f));
		}
	}
	
	public static void updateSupervisorForm(HttpServletRequest request, HttpServletResponse response) throws IOException, JsonSyntaxException, JsonIOException {
		Form f = gson.fromJson(request.getReader(), Form.class);
		
		boolean success = fs.updateSupervisorForm(f);
		
		response.getWriter().append((success) ? gson.toJson(f) : "{}");
	}
	
	public static void updateDeptForm(HttpServletRequest request, HttpServletResponse response) throws IOException, JsonSyntaxException, JsonIOException {
		Form f = gson.fromJson(request.getReader(), Form.class);
		
		boolean success = fs.updateDeptForm(f);
		
		response.getWriter().append((success) ? gson.toJson(f) : "{}");
	}
	
	public static void updateSuperAndDeptForm(HttpServletRequest request, HttpServletResponse response) throws IOException, JsonSyntaxException, JsonIOException {
		Form f = gson.fromJson(request.getReader(), Form.class);
		
		boolean success = fs.updateSuperAndDeptForm(f);
		
		response.getWriter().append((success) ? gson.toJson(f) : "{}");
	}
	
	public static void updateBencoForm(HttpServletRequest request, HttpServletResponse response) throws IOException, JsonSyntaxException, JsonIOException {
		Form f = gson.fromJson(request.getReader(), Form.class);
		
		boolean success = fs.updateBencoForm(f);
		
		response.getWriter().append((success) ? gson.toJson(f) : "{}");
	}
	
	public static void updateStatus(HttpServletRequest request, HttpServletResponse response) throws IOException, JsonSyntaxException, JsonIOException {
		Form f = gson.fromJson(request.getReader(), Form.class);
		
		boolean success = fs.updateSupervisorForm(f);
		
		response.getWriter().append((success) ? gson.toJson(f) : "{}");
	}
}
