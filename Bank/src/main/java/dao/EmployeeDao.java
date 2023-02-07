package dao;
import java.util.List;
import exception.ApplicationException;
import pojo.EmployeePojo;

public interface EmployeeDao {

	//gets all employees
	List<EmployeePojo> getAllEmployees() throws ApplicationException;
	
	//adds a new employee
	//EmployeePojo addEmployee(EmployeePojo employeePojo);
	
	//updates an existing employee
	//EmployeePojo updateEmployee(EmployeePojo employeePojo);
	
	//deletes an existing employee
	//void deleteEmployee(int employee_id);
	
	//fetches an employee
	EmployeePojo getAEmployee(int employee_id) throws ApplicationException;
	
}
