package dev.garcia.repositories;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dev.garcia.models.Form;
import dev.garcia.util.JDBCConnection;

public class FormRepositoryImpl implements FormRepository {

	public static Connection conn = JDBCConnection.getConnection();

	@Override
	public boolean addForm(Form f) {
		try {
			String sql = "CALL add_form(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			CallableStatement cs = conn.prepareCall(sql);
			cs.setInt(1, f.getEmployee_id());
			cs.setString(2, f.getDated());
			cs.setString(3, f.getTime());
			cs.setString(4, f.getLocation());
			cs.setString(5, f.getDescription());
			cs.setDouble(6, f.getCost());
			cs.setString(7, f.getGrade_format());
			cs.setString(8, f.getType());
			cs.setString(9, f.getJustification());
			cs.setInt(10, f.getSupervisor_id());
			cs.setInt(11, f.getDepartment_id());

			boolean success = cs.execute();
			return success;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Form getFormByFormID(int form_id) {
		try {
			String sql = "SELECT * FROM forms WHERE id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, form_id);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				Form f = new Form();
				f.setId(rs.getInt("ID"));
				f.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
				f.setDated(rs.getString("TIME"));
				f.setTime(rs.getString("TIME"));
				f.setLocation(rs.getString("LOCATION"));
				f.setDescription(rs.getString("DESCRIPTION"));
				f.setCost(rs.getDouble("COST"));
				f.setGrade_format(rs.getString("GRADE_FORMAT"));
				f.setType(rs.getString("TYPE"));
				f.setJustification(rs.getString("JUSTIFICATION"));
				f.setSupervisor_id(rs.getInt("SUPERVISOR_ID"));
				f.setSupervisor_approval(rs.getString("SUPERVISOR_APPROVAL"));
				f.setSupervisor_reason(rs.getString("SUPERVISOR_REASON"));
				f.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
				f.setDepartment_approval(rs.getString("DEPARTMENT_APPROVAL"));
				f.setDepartment_reason(rs.getString("DEPARTMENT_REASON"));
				f.setBenco_approval(rs.getString("BENCO_APPROVAL"));
				f.setBenco_reason(rs.getString("BENCO_REASON"));
				f.setStatus(rs.getString("STATUS"));
				return f;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Form> getPendingFormsByEmployeeID(int employee_id) {
		List<Form> forms = new ArrayList<Form>();
		try {
			String sql = "SELECT * FROM forms WHERE employee_id = ? AND status = 'Pending'";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, employee_id);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Form f = new Form();
				f.setId(rs.getInt("ID"));
				f.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
				f.setDated(rs.getString("TIME"));
				f.setTime(rs.getString("TIME"));
				f.setLocation(rs.getString("LOCATION"));
				f.setDescription(rs.getString("DESCRIPTION"));
				f.setCost(rs.getDouble("COST"));
				f.setGrade_format(rs.getString("GRADE_FORMAT"));
				f.setType(rs.getString("TYPE"));
				f.setJustification(rs.getString("JUSTIFICATION"));
				f.setSupervisor_id(rs.getInt("SUPERVISOR_ID"));
				f.setSupervisor_approval(rs.getString("SUPERVISOR_APPROVAL"));
				f.setSupervisor_reason(rs.getString("SUPERVISOR_REASON"));
				f.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
				f.setDepartment_approval(rs.getString("DEPARTMENT_APPROVAL"));
				f.setDepartment_reason(rs.getString("DEPARTMENT_REASON"));
				f.setBenco_approval(rs.getString("BENCO_APPROVAL"));
				f.setBenco_reason(rs.getString("BENCO_REASON"));
				f.setStatus(rs.getString("STATUS"));
				forms.add(f);
			}
			return forms;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Form> getApprovedFormsByEmployeeID(int employee_id) {
		List<Form> forms = new ArrayList<Form>();
		try {
			String sql = "SELECT * FROM forms WHERE employee_id = ? AND status = 'Approved'";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, employee_id);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Form f = new Form();
				f.setId(rs.getInt("ID"));
				f.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
				f.setDated(rs.getString("TIME"));
				f.setTime(rs.getString("TIME"));
				f.setLocation(rs.getString("LOCATION"));
				f.setDescription(rs.getString("DESCRIPTION"));
				f.setCost(rs.getDouble("COST"));
				f.setGrade_format(rs.getString("GRADE_FORMAT"));
				f.setType(rs.getString("TYPE"));
				f.setJustification(rs.getString("JUSTIFICATION"));
				f.setSupervisor_id(rs.getInt("SUPERVISOR_ID"));
				f.setSupervisor_approval(rs.getString("SUPERVISOR_APPROVAL"));
				f.setSupervisor_reason(rs.getString("SUPERVISOR_REASON"));
				f.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
				f.setDepartment_approval(rs.getString("DEPARTMENT_APPROVAL"));
				f.setDepartment_reason(rs.getString("DEPARTMENT_REASON"));
				f.setBenco_approval(rs.getString("BENCO_APPROVAL"));
				f.setBenco_reason(rs.getString("BENCO_REASON"));
				f.setStatus(rs.getString("STATUS"));
				forms.add(f);
			}
			return forms;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Form> getDeniedFormsByEmployeeID(int employee_id) {
		List<Form> forms = new ArrayList<Form>();
		try {
			String sql = "SELECT * FROM forms WHERE employee_id = ? AND status = 'Denied'";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, employee_id);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Form f = new Form();
				f.setId(rs.getInt("ID"));
				f.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
				f.setDated(rs.getString("TIME"));
				f.setTime(rs.getString("TIME"));
				f.setLocation(rs.getString("LOCATION"));
				f.setDescription(rs.getString("DESCRIPTION"));
				f.setCost(rs.getDouble("COST"));
				f.setGrade_format(rs.getString("GRADE_FORMAT"));
				f.setType(rs.getString("TYPE"));
				f.setJustification(rs.getString("JUSTIFICATION"));
				f.setSupervisor_id(rs.getInt("SUPERVISOR_ID"));
				f.setSupervisor_approval(rs.getString("SUPERVISOR_APPROVAL"));
				f.setSupervisor_reason(rs.getString("SUPERVISOR_REASON"));
				f.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
				f.setDepartment_approval(rs.getString("DEPARTMENT_APPROVAL"));
				f.setDepartment_reason(rs.getString("DEPARTMENT_REASON"));
				f.setBenco_approval(rs.getString("BENCO_APPROVAL"));
				f.setBenco_reason(rs.getString("BENCO_REASON"));
				f.setStatus(rs.getString("STATUS"));
				forms.add(f);
			}
			return forms;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Form> getFormsBySupervisorID(int supervisor_id) {
		List<Form> forms = new ArrayList<Form>();
		try {
			String sql = "SELECT * FROM forms WHERE supervisor_id = ? AND status = 'Pending'";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, supervisor_id);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Form f = new Form();
				f.setId(rs.getInt("ID"));
				f.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
				f.setDated(rs.getString("TIME"));
				f.setTime(rs.getString("TIME"));
				f.setLocation(rs.getString("LOCATION"));
				f.setDescription(rs.getString("DESCRIPTION"));
				f.setCost(rs.getDouble("COST"));
				f.setGrade_format(rs.getString("GRADE_FORMAT"));
				f.setType(rs.getString("TYPE"));
				f.setJustification(rs.getString("JUSTIFICATION"));
				f.setSupervisor_id(rs.getInt("SUPERVISOR_ID"));
				f.setSupervisor_approval(rs.getString("SUPERVISOR_APPROVAL"));
				f.setSupervisor_reason(rs.getString("SUPERVISOR_REASON"));
				f.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
				f.setDepartment_approval(rs.getString("DEPARTMENT_APPROVAL"));
				f.setDepartment_reason(rs.getString("DEPARTMENT_REASON"));
				f.setBenco_approval(rs.getString("BENCO_APPROVAL"));
				f.setBenco_reason(rs.getString("BENCO_REASON"));
				f.setStatus(rs.getString("STATUS"));
				forms.add(f);
			}
			return forms;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Form> getFormsByDeptID(int department_id) {
		List<Form> forms = new ArrayList<Form>();
		try {
			String sql = "SELECT * FROM forms WHERE department_id = ? AND status = 'Pending'";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, department_id);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Form f = new Form();
				f.setId(rs.getInt("ID"));
				f.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
				f.setDated(rs.getString("TIME"));
				f.setTime(rs.getString("TIME"));
				f.setLocation(rs.getString("LOCATION"));
				f.setDescription(rs.getString("DESCRIPTION"));
				f.setCost(rs.getDouble("COST"));
				f.setGrade_format(rs.getString("GRADE_FORMAT"));
				f.setType(rs.getString("TYPE"));
				f.setJustification(rs.getString("JUSTIFICATION"));
				f.setSupervisor_id(rs.getInt("SUPERVISOR_ID"));
				f.setSupervisor_approval(rs.getString("SUPERVISOR_APPROVAL"));
				f.setSupervisor_reason(rs.getString("SUPERVISOR_REASON"));
				f.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
				f.setDepartment_approval(rs.getString("DEPARTMENT_APPROVAL"));
				f.setDepartment_reason(rs.getString("DEPARTMENT_REASON"));
				f.setBenco_approval(rs.getString("BENCO_APPROVAL"));
				f.setBenco_reason(rs.getString("BENCO_REASON"));
				f.setStatus(rs.getString("STATUS"));
				forms.add(f);
			}
			return forms;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Form> getAllPendingForms() {
		List<Form> forms = new ArrayList<Form>();
		try {
			String sql = "SELECT * FROM forms WHERE status = 'Pending'";
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Form f = new Form();
				f.setId(rs.getInt("ID"));
				f.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
				f.setDated(rs.getString("TIME"));
				f.setTime(rs.getString("TIME"));
				f.setLocation(rs.getString("LOCATION"));
				f.setDescription(rs.getString("DESCRIPTION"));
				f.setCost(rs.getDouble("COST"));
				f.setGrade_format(rs.getString("GRADE_FORMAT"));
				f.setType(rs.getString("TYPE"));
				f.setJustification(rs.getString("JUSTIFICATION"));
				f.setSupervisor_id(rs.getInt("SUPERVISOR_ID"));
				f.setSupervisor_approval(rs.getString("SUPERVISOR_APPROVAL"));
				f.setSupervisor_reason(rs.getString("SUPERVISOR_REASON"));
				f.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
				f.setDepartment_approval(rs.getString("DEPARTMENT_APPROVAL"));
				f.setDepartment_reason(rs.getString("DEPARTMENT_REASON"));
				f.setBenco_approval(rs.getString("BENCO_APPROVAL"));
				f.setBenco_reason(rs.getString("BENCO_REASON"));
				f.setStatus(rs.getString("STATUS"));
				forms.add(f);
			}
			return forms;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean updateSupervisorForm(Form f) {
		try {
			String sql = "UPDATE forms SET supervisor_approval = ?, supervisor_reason = ? WHERE id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, f.getSupervisor_approval());
			ps.setString(2, f.getSupervisor_reason());
			ps.setInt(3, f.getId());

			boolean success = ps.execute();

			return success;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateDeptForm(Form f) {
		try {
			String sql = "UPDATE forms SET department_approval = ?, department_reason = ? WHERE id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, f.getSupervisor_approval());
			ps.setString(2, f.getSupervisor_reason());
			ps.setInt(3, f.getId());

			boolean success = ps.execute();

			return success;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateSuperAndDeptForm(Form f) {
		try {
			String sql = "UPDATE forms SET supervisor_approval = ?, supervisor_reason = ?, department_approval = ?, department_reason = ? WHERE id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, f.getSupervisor_approval());
			ps.setString(2, f.getSupervisor_reason());
			ps.setString(3, f.getSupervisor_approval());
			ps.setString(4, f.getSupervisor_reason());
			ps.setInt(5, f.getId());

			boolean success = ps.execute();

			return success;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateBencoForm(Form f) {
		try {
			String sql = "UPDATE forms SET benco_approval = ?, benco_reason = ? WHERE id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, f.getSupervisor_approval());
			ps.setString(2, f.getSupervisor_reason());
			ps.setInt(3, f.getId());

			boolean success = ps.execute();

			return success;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateStatus(Form f) {
		if (f.getBenco_approval() == "1" && f.getDepartment_approval() == "1" && f.getSupervisor_approval() == "1") {
			try {
				String sql = "UPDATE forms SET status = 'Approved' WHERE id = ?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, f.getId());

				boolean success = ps.execute();
				return success;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return false;
		} else if (f.getBenco_approval() == "2" || f.getDepartment_approval() == "2" || f.getSupervisor_approval() == "2") {
			try {
				String sql = "UPDATE * FROM forms SET status = 'Denied' WHERE id = ?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, f.getId());

				boolean success = ps.execute();
				return success;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return false;
		}
		return false;
	}
}
