package service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import exception.ApplicationException;
import dao.CustomerDao;
import dao.CustomerDaoJdbcImpl;
import pojo.CustomerPojo;
import pojo.TransactionPojo;

public class CustomerServiceImpl implements CustomerService{
	
	//Logging Step 1 - obtain an instance of Logger
	private static final Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);
	
	//fill in the code later for each methods
	//will fill in after the dao layer is done
	
	//CustomerDao interface reference variable
	CustomerDao customerDao; // this is the preferred way as the class is abstracted through the interface reference variable
	
	//CustomerDaoArrayImpl customerDao // is highly not recommended as we need to abstract the class
	
	public CustomerServiceImpl() {
		customerDao = new CustomerDaoJdbcImpl();
	}
	//the methods in my service layer don't do anything much, they just call the respective dao methods
	public List<CustomerPojo> getAllCustomers() throws ApplicationException {
		logger.info("Entered getAllCustomers() in service layer...");
		return customerDao.getAllCustomers();
	}
	
	@Override
	public CustomerPojo addCustomer(CustomerPojo customerPojo) throws ApplicationException {
		logger.info("Entered addCustomer() in service layer...");
		return customerDao.addCustomer(customerPojo);
	}
	
	@Override
	public CustomerPojo updateCustomer(CustomerPojo customerPojo) throws ApplicationException {
		logger.info("Entered updateCustomer() in service layer...");
		return customerDao.updateCustomer(customerPojo);
	}
	@Override
	public void deleteCustomer(int customer_id) throws ApplicationException {
		logger.info("Entered deleteCustomer() in service layer");
		customerDao.deleteCustomer(customer_id);

	}
	
	@Override
	public CustomerPojo getACustomer(int customer_id) throws ApplicationException {
		logger.info("Entered getACustomer() in service layer...");
		return customerDao.getACustomer(customer_id);
	
	}
	@Override
	public TransactionPojo getAllTransactions() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
