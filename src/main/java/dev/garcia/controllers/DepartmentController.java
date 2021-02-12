package dev.garcia.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import dev.garcia.models.Department;
import dev.garcia.services.DepartmentService;

public class DepartmentController {

	public static DepartmentService ds = new DepartmentService();
	public static Gson gson = new Gson();
	
	public static void getDepartment(HttpServletRequest request, HttpServletResponse response) throws IOException, JsonSyntaxException, JsonIOException {
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
		
		Department d = ds.getDepartment(id);
		response.getWriter().append((d != null) ? gson.toJson(d) : "{}");
	}
}
