package dev.garcia.services;

import dev.garcia.models.Employee;
import dev.garcia.repositories.EmployeeRepository;
import dev.garcia.repositories.EmployeeRepositoryImpl;

public class EmployeeService {
	
	private EmployeeRepository er = new EmployeeRepositoryImpl();
	
	public Employee getEmployeeByID(int id) {
		return er.getEmployeeByID(id);
	}
	
	public Employee getEmployeeByUsername(String username) {
		return er.getEmployeeByUsername(username);
	}
	
	public boolean updateBalance(Employee e) {
		return er.updateBalance(e);
	}

	public Employee login(String username, String password) {
		return er.login(username, password);
	}
}
