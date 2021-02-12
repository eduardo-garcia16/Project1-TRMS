package dev.garcia.services;

import dev.garcia.models.Department;
import dev.garcia.repositories.DepartmentRepository;
import dev.garcia.repositories.DepartmentRepositoryImpl;

public class DepartmentService {
	
	private DepartmentRepository dr = new DepartmentRepositoryImpl();
	
	public Department getDepartment(int id) {
		return dr.getDepartment(id);
	}

}
