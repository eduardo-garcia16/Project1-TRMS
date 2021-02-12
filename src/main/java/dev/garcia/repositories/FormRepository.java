package dev.garcia.repositories;

import java.util.List;

import dev.garcia.models.Form;

public interface FormRepository {

	public Form getFormByFormID(int form_id);
	public List<Form> getPendingFormsByEmployeeID(int employee_id);
	public List<Form> getApprovedFormsByEmployeeID(int employee_id);
	public List<Form> getDeniedFormsByEmployeeID(int employee_id);
	public List<Form> getFormsBySupervisorID(int supervisor_id);
	public List<Form> getFormsByDeptID(int department_id);
	public List<Form> getAllPendingForms();
	public boolean addForm(Form f);
	public boolean updateSupervisorForm(Form f);
	public boolean updateDeptForm(Form f);
	public boolean updateSuperAndDeptForm(Form f);
	public boolean updateBencoForm(Form f);
	public boolean updateStatus(Form f);
}
