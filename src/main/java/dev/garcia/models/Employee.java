package dev.garcia.models;

public class Employee {
	
	private int id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String role;
	private double availableTuition;
	private int supervisorID;
	private int deptID;
	private int is_depthead;
	
	public Employee() {
		super();
	}
	
	public Employee(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public Employee(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public Employee(int id, String username, String password, String firstName, String lastName, String role,
			double availableTuition, int supervisorID, int deptID, int is_depthead) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.availableTuition = availableTuition;
		this.supervisorID = supervisorID;
		this.deptID = deptID;
		this.is_depthead = is_depthead;
	}

	public Employee(String username, String password, String firstName, String lastName, String role,
			double availableTuition, int supervisorID, int deptID, int is_depthead) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.availableTuition = availableTuition;
		this.supervisorID = supervisorID;
		this.deptID = deptID;
		this.is_depthead = is_depthead;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getAvailableTuition() {
		return availableTuition;
	}

	public void setAvailableTuition(double availableTuition) {
		this.availableTuition = availableTuition;
	}

	public int getSupervisorID() {
		return supervisorID;
	}

	public void setSupervisorID(int supervisorID) {
		this.supervisorID = supervisorID;
	}

	public int getDeptID() {
		return deptID;
	}

	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}

	public int getIs_depthead() {
		return is_depthead;
	}

	public void setIs_depthead(int is_depthead) {
		this.is_depthead = is_depthead;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", username=" + username + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", role=" + role + ", availableTuition=" + availableTuition
				+ ", supervisorID=" + supervisorID + ", deptID=" + deptID + "]";
	}
}
