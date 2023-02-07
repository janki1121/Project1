package service;

import java.util.List;

import exception.ApplicationException;
import pojo.EmployeePojo;


public interface EmployeeService {
	// C - Create
	// R - Read
	// U - Update
	// D - Delete
	
	// fetches all the employees - Read
	List<EmployeePojo> getAllEmployees() throws ApplicationException;
		
	

	// adds a new employee - Create
//	EmployeePojo addEmployee(EmployeePojo employeePojo);
	
	// updates an employee - Update
//	EmployeePojo updateEmployee(EmployeePojo employeePojo);
	
	// deletes an employee - Delete
//	void deleteEmployee(int emp_id);
	
	//fetches an employee - Read
	EmployeePojo getAEmployee(int emp_id) throws ApplicationException;

	EmployeePojo getEmployee_username(String fetchEmployee_username);

	EmployeePojo getEmployee_password(String fetchEmployee_password);
}
