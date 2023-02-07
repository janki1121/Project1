package service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import exception.ApplicationException;
import dao.EmployeeDao;
import dao.EmployeeDaoJdbcImpl;
import pojo.EmployeePojo;

public class EmployeeServiceImpl implements EmployeeService {
	
	//Logging step 1 - obtain an instance of Logger
	private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);
	//fill in the code later for each methods
	// will fill in after the dao layer is done
	
	// EmployeeDao interface reference variable
	EmployeeDao employeeDao; 
	
	
	public EmployeeServiceImpl() {
		employeeDao = new EmployeeDaoJdbcImpl();
	}
	
	// the methods in my service layer don't do anything much, they just call the respective dao methods
	public List<EmployeePojo> getAllEmployees() throws ApplicationException {
		logger.info("Entered getAllEmployees() in service layer...");
		return employeeDao.getAllEmployees();
	}
	
	//@Override
	//public EmployeePojo addEmployee(EmployeePojo employeePojo) {
		//return employeeDao.addEmployee(employeePojo);
	//}
	
	//@Override
	//public EmployeePojo updateEmployee(EmployeePojo employeePojo) {
		//return employeeDao.updateEmployee(employeePojo);
	//}
	
	//@Override
	//public void deleteEmployee(int employee_id) {
		//employeeDao.deleteEmployee(employee_id);
	//}
	
	@Override
	public EmployeePojo getAEmployee(int employee_id) throws ApplicationException {
		logger.info("Entered getAEmployee() in service layer...");
		return employeeDao.getAEmployee(employee_id);
	}

	@Override
	public EmployeePojo getEmployee_username(String fetchEmployee_username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeePojo getEmployee_password(String fetchEmployee_password) {
		// TODO Auto-generated method stub
		return null;
	}




	
	
}