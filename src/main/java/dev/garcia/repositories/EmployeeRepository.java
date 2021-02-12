package dev.garcia.repositories;

import dev.garcia.models.Employee;

public interface EmployeeRepository {
	
	public Employee getEmployeeByID(int id);
	public Employee getEmployeeByUsername(String username);
	public boolean updateBalance(Employee e);
	public Employee login(String username, String password);
}
