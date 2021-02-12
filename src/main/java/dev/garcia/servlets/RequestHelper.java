package dev.garcia.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.garcia.controllers.DepartmentController;
import dev.garcia.controllers.EmployeeController;
import dev.garcia.controllers.FormController;

public class RequestHelper {
	
	/**
	 * This method will delegate other methods of the
	 * layer of our application to process the request.
	 * @param request the HTTP Request
	 * @param response the HTTP Response
	 * @throws IOException 
	 */
	public static void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String uri = request.getRequestURI();
		
		System.out.println(uri);
		
		switch(uri) {
		
		case "/Project1/login.do":{
			EmployeeController.login(request, response);
			break;
		}
		case "/Project1/loggedInUser.do":{
			EmployeeController.loggedInUser(request, response);
			break;
		}
		case "/Project1/logout.do":{
			EmployeeController.logout(request, response);
			break;
		}
		case "/Project1/getEmployeeByUsername.do":{
			EmployeeController.getEmployeeByUsername(request, response);
			break;
		}
		case "/Project1/getEmployeeByID.do":{
			EmployeeController.getEmployeeByID(request, response);
			break;
		}
		case "/Project1/updateBalance.do":{
			EmployeeController.updateBalance(request, response);
			break;
		}
		case "/Project1/getPendingFormsByEmployeeID.do":{
			FormController.getPendingFormsByEmployeeID(request, response);
			break;
		}
		case "/Project1/getApprovedFormsByEmployeeID.do":{
			FormController.getApprovedFormsByEmployeeID(request, response);
			break;
		}
		case "/Project1/getFormByID.do":{
			FormController.getFormByID(request, response);
			break;
		}
		case "/Project1/getDeniedFormsByEmployeeID.do":{
			FormController.getDeniedFormsByEmployeeID(request, response);
			break;
		}
		case "/Project1/getFormsBySupervisorID.do":{
			FormController.getFormsBySupervisorID(request, response);
			break;
		}
		case "/Project1/getFormsByDeptID.do":{
			FormController.getFormsByDeptID(request, response);
			break;
		}
		case "/Project1/getAllPendingForms.do":{
			FormController.getAllPendingForms(request, response);
			break;
		}
		case "/Project1/addForm.do":{
			FormController.addForm(request, response);
			break;
		}
		case "/Project1/updateSupervisorForm.do":{
			FormController.updateSupervisorForm(request, response);
			break;
		}
		case "/Project1/updateDeptForm.do":{
			FormController.updateDeptForm(request, response);
			break;
		}
		case "/Project1/updateSuperAndDeptForm.do":{
			FormController.updateSuperAndDeptForm(request, response);
			break;
		}
		case "/Project1/updateBencoForm.do":{
			FormController.updateBencoForm(request, response);
			break;
		}
		case "/Project1/updateStatus.do":{
			FormController.updateStatus(request, response);
			break;
		}
		case "/Project1/getDepartment.do":{
			DepartmentController.getDepartment(request, response);
			break;
		}
		default:{
			response.sendError(418, "Default case hit. Cannot brew coffee, is teapot.");
			break;
		}
		
		}
	}

}
