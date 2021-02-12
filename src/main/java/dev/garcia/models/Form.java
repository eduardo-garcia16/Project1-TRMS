package dev.garcia.models;

public class Form {
	
	private int id;
	private int employee_id;
	private String dated;
	private String time;
	private String location;
	private String description;
	private double cost;
	private String grade_format;
	private String type;
	private String justification;
	private int supervisor_id;
	private String supervisor_approval;
	private String supervisor_reason;
	private int department_id;
	private String department_approval;
	private String department_reason;
	private String benco_approval;
	private String benco_reason;
	private String status;
	
	public Form() {
		super();
	}
	
	public Form(int id) {
		super();
		this.id = id;
	}

	public Form(int id, int employee_id, String dated, String time, String location, String description, double cost,
			String grade_format, String type, String justification, int supervisor_id, String supervisor_approval,
			String supervisor_reason, int department_id, String department_approval, String department_reason,
			String benco_approval, String benco_reason, String status) {
		super();
		this.id = id;
		this.employee_id = employee_id;
		this.dated = dated;
		this.time = time;
		this.location = location;
		this.description = description;
		this.cost = cost;
		this.grade_format = grade_format;
		this.type = type;
		this.justification = justification;
		this.supervisor_id = supervisor_id;
		this.supervisor_approval = supervisor_approval;
		this.supervisor_reason = supervisor_reason;
		this.department_id = department_id;
		this.department_approval = department_approval;
		this.department_reason = department_reason;
		this.benco_approval = benco_approval;
		this.benco_reason = benco_reason;
		this.status = status;
	}

	public Form(int employee_id, String dated, String time, String location, String description, double cost,
			String grade_format, String type, String justification, int supervisor_id, String supervisor_approval,
			String supervisor_reason, int department_id, String department_approval, String department_reason,
			String benco_approval, String benco_reason, String status) {
		super();
		this.employee_id = employee_id;
		this.dated = dated;
		this.time = time;
		this.location = location;
		this.description = description;
		this.cost = cost;
		this.grade_format = grade_format;
		this.type = type;
		this.justification = justification;
		this.supervisor_id = supervisor_id;
		this.supervisor_approval = supervisor_approval;
		this.supervisor_reason = supervisor_reason;
		this.department_id = department_id;
		this.department_approval = department_approval;
		this.department_reason = department_reason;
		this.benco_approval = benco_approval;
		this.benco_reason = benco_reason;
		this.status = status;
	}
	
	

	public Form(int id, int employee_id, String dated, String time, String location, String description, double cost,
			String grade_format, String type, String justification, int supervisor_id, int department_id) {
		super();
		this.id = id;
		this.employee_id = employee_id;
		this.dated = dated;
		this.time = time;
		this.location = location;
		this.description = description;
		this.cost = cost;
		this.grade_format = grade_format;
		this.type = type;
		this.justification = justification;
		this.supervisor_id = supervisor_id;
		this.department_id = department_id;
	}

	public Form(int id, String approval, String reason) {
		super();
		this.id = id;
		this.supervisor_approval = approval;
		this.supervisor_reason = reason;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getDated() {
		return dated;
	}

	public void setDated(String dated) {
		this.dated = dated;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getGrade_format() {
		return grade_format;
	}

	public void setGrade_format(String grade_format) {
		this.grade_format = grade_format;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public int getSupervisor_id() {
		return supervisor_id;
	}

	public void setSupervisor_id(int supervisor_id) {
		this.supervisor_id = supervisor_id;
	}

	public String getSupervisor_approval() {
		return supervisor_approval;
	}

	public void setSupervisor_approval(String supervisor_approval) {
		this.supervisor_approval = supervisor_approval;
	}

	public String getSupervisor_reason() {
		return supervisor_reason;
	}

	public void setSupervisor_reason(String supervisor_reason) {
		this.supervisor_reason = supervisor_reason;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_approval() {
		return department_approval;
	}

	public void setDepartment_approval(String department_approval) {
		this.department_approval = department_approval;
	}

	public String getDepartment_reason() {
		return department_reason;
	}

	public void setDepartment_reason(String department_reason) {
		this.department_reason = department_reason;
	}

	public String getBenco_approval() {
		return benco_approval;
	}

	public void setBenco_approval(String benco_approval) {
		this.benco_approval = benco_approval;
	}

	public String getBenco_reason() {
		return benco_reason;
	}

	public void setBenco_reason(String benco_reason) {
		this.benco_reason = benco_reason;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Form [id=" + id + ", employee_id=" + employee_id + ", dated=" + dated + ", time=" + time + ", location="
				+ location + ", description=" + description + ", cost=" + cost + ", grade_format=" + grade_format
				+ ", type=" + type + ", justification=" + justification + ", supervisor_id=" + supervisor_id
				+ ", supervisor_approval=" + supervisor_approval + ", supervisor_reason=" + supervisor_reason
				+ ", department_id=" + department_id + ", department_approval=" + department_approval
				+ ", department_reason=" + department_reason + ", benco_approval=" + benco_approval + ", benco_reason="
				+ benco_reason + ", status=" + status + ", is_depthead=" +"]";
	}
}
