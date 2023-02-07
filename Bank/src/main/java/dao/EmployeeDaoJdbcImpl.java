package dao;

import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import exception.ApplicationException;
import pojo.EmployeePojo;

public class EmployeeDaoJdbcImpl implements EmployeeDao {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeDaoJdbcImpl.class);
	
	@Override
	public List<EmployeePojo> getAllEmployees() throws ApplicationException {
		logger.info("Entered getAllEmployees() of dao layer ");
		
		Connection connection = DBUtil.makeConnection();
		List<EmployeePojo> allEmployees = new ArrayList<EmployeePojo>();
		try {
			Statement stmt = connection.createStatement();
			String query = "SELECT * FROM employee_acc_details";
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				//creating a employee pojo and copying each record from the result set into
				// the employee pojo
			EmployeePojo employeePojo = new EmployeePojo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			
			allEmployees.add(employeePojo);
			}
		} catch (SQLException e) {
			throw new ApplicationException();
		}
		
		return allEmployees;
	}

	@Override
	public EmployeePojo getAEmployee(int employee_id) throws ApplicationException {
		logger.info("Entered getAEmployee() of dao layer...");
		
		Connection connection = DBUtil.makeConnection();
		Statement stmt = null;
		EmployeePojo employeePojo = null;
		try {
			stmt = connection.createStatement();
			String query = "SELECT * FROM employee_acc_details WHERE employee_id=" + employee_id;
			ResultSet rs = stmt.executeQuery(query);
			//traverse the rs
			//as i traverse i would copy the contents into a employee pojo object
			while(rs.next()) {
				employeePojo = new EmployeePojo();
				employeePojo.setEmployee_id(rs.getInt(1));
				employeePojo.setFirst_name(rs.getString(2));
				employeePojo.setLast_name(rs.getString(3));
				employeePojo.setEmployee_username(rs.getString(4));
				employeePojo.setEmployee_password(rs.getString(5));
			}
		} catch (SQLException e) {
			throw new ApplicationException();
		}
		return employeePojo;
	}

}
