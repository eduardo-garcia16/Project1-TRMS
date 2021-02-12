package dev.garcia.models;

public class Department {
	
	private int id;
	private String name;
	private int deptHeadID;
	
	public Department() {
		super();
	}

	public Department(int id, String name, int deptHeadID) {
		super();
		this.id = id;
		this.name = name;
		this.deptHeadID = deptHeadID;
	}

	public Department(String name, int deptHeadID) {
		super();
		this.name = name;
		this.deptHeadID = deptHeadID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDeptHeadID() {
		return deptHeadID;
	}

	public void setDeptHeadID(int deptHeadID) {
		this.deptHeadID = deptHeadID;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", deptHeadID=" + deptHeadID + "]";
	}
}
