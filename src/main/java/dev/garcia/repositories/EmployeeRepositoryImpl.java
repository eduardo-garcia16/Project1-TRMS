package dev.garcia.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dev.garcia.models.Employee;
import dev.garcia.util.JDBCConnection;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	public static Connection conn = JDBCConnection.getConnection();

	@Override
	public Employee getEmployeeByID(int id) {
		try {

			String sql = "SELECT * FROM employees WHERE id = ?";

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, Integer.toString(id));

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				Employee e = new Employee();
				e.setId(rs.getInt("ID"));
				e.setUsername(rs.getString("USERNAME"));
				e.setPassword(rs.getString("PASSWORD"));
				e.setFirstName(rs.getString("FIRST_NAME"));
				e.setLastName(rs.getString("LAST_NAME"));
				e.setRole(rs.getString("ROLE"));
				e.setAvailableTuition(rs.getDouble("AVAILABLE_TUITION"));
				e.setSupervisorID(rs.getInt("SUPERVISOR_ID"));
				e.setDeptID(rs.getInt("DEPARTMENT_ID"));

				return e;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}
	
	@Override
	public Employee getEmployeeByUsername(String username) {
		try {
			
			String sql = "SELECT * FROM employees WHERE username = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, username);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				Employee e = new Employee();
				e.setId(rs.getInt("ID"));
				e.setUsername(rs.getString("USERNAME"));
				e.setPassword(rs.getString("PASSWORD"));
				e.setFirstName(rs.getString("FIRST_NAME"));
				e.setLastName(rs.getString("LAST_NAME"));
				e.setRole(rs.getString("ROLE"));
				e.setAvailableTuition(rs.getDouble("AVAILABLE_TUITION"));
				e.setSupervisorID(rs.getInt("SUPERVISOR_ID"));
				e.setDeptID(rs.getInt("DEPARTMENT_ID"));
				
				return e;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean updateBalance(Employee e) {
		try {

			String sql = "UPDATE employees SET available_tuition = ? WHERE id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setDouble(1, e.getAvailableTuition());
			ps.setInt(2, e.getId());

			ps.execute();
			return true;

		} catch (SQLException p) {
			p.printStackTrace();
		}
		return false;
	}

	@Override
	public Employee login(String username, String password) {
		try {
			
			String sql = "SELECT * FROM employees WHERE username = ? AND password = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				Employee e = new Employee();
				e.setId(rs.getInt("ID"));
				e.setUsername(rs.getString("USERNAME"));
				e.setPassword(rs.getString("PASSWORD"));
				e.setFirstName(rs.getString("FIRST_NAME"));
				e.setLastName(rs.getString("LAST_NAME"));
				e.setRole(rs.getString("ROLE"));
				e.setAvailableTuition(rs.getDouble("AVAILABLE_TUITION"));
				e.setSupervisorID(rs.getInt("SUPERVISOR_ID"));
				e.setDeptID(rs.getInt("DEPARTMENT_ID"));
				
				return e;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
