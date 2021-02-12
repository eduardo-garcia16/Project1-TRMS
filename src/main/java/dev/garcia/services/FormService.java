package dev.garcia.services;

import java.util.List;

import dev.garcia.models.Form;
import dev.garcia.repositories.FormRepository;
import dev.garcia.repositories.FormRepositoryImpl;

public class FormService {

	private FormRepository fr = new FormRepositoryImpl();
	
	public boolean addForm(Form f) {
		return fr.addForm(f);
	}
	
	public Form getFormByID(int form_id){
		return fr.getFormByFormID(form_id);
	}
	
	public List<Form> getPendingFormsByEmployeeID(int emp_id){
		return fr.getPendingFormsByEmployeeID(emp_id);
	}
	
	public List<Form> getApprovedFormsByEmployeeID(int emp_id){
		return fr.getApprovedFormsByEmployeeID(emp_id);
	}
	
	public List<Form> getDeniedFormsByEmployeeID(int emp_id) {
		return fr.getDeniedFormsByEmployeeID(emp_id);
	}
	
	public List<Form> getFormsBySupervisorID(int supervisor_id){
		return fr.getFormsBySupervisorID(supervisor_id);
	}
	
	public List<Form> getFormsByDeptID(int department_id){
		return fr.getFormsByDeptID(department_id);
	}
	
	public List<Form> getAllPendingForms(){
		return fr.getAllPendingForms();
	}
	
	public boolean updateSupervisorForm(Form f) {
		return fr.updateSupervisorForm(f);
	}
	
	public boolean updateDeptForm(Form f) {
		return fr.updateDeptForm(f);
	}
	
	public boolean updateSuperAndDeptForm(Form f) {
		return fr.updateSuperAndDeptForm(f);
	}
	
	public boolean updateBencoForm(Form f) {
		return fr.updateBencoForm(f);
	}
	
	public boolean updateStatus(Form f) {
		return fr.updateStatus(f);
	}
}
