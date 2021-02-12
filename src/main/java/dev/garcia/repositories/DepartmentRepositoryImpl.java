package dev.garcia.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dev.garcia.models.Department;
import dev.garcia.util.JDBCConnection;

public class DepartmentRepositoryImpl implements DepartmentRepository {

	public static Connection conn = JDBCConnection.getConnection();
	@Override
	public Department getDepartment(int id) {
		try {
			
			String sql = "SELECT * FROM departments WHERE id = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				Department d = new Department();
				d.setId(rs.getInt("ID"));
				d.setName(rs.getString("NAME"));
				d.setDeptHeadID(rs.getInt("HEAD"));
				
				return d;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
