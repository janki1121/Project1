package dao;

import java.util.List;
import exception.ApplicationException;
import pojo.CustomerPojo;

public interface CustomerDao {
	//fetches all the customers
	List<CustomerPojo> getAllCustomers() throws ApplicationException;
		
	// adds a new customer
	CustomerPojo addCustomer(CustomerPojo customerPojo) throws ApplicationException;
		
	// updates an existing customer
	CustomerPojo updateCustomer(CustomerPojo customerPojo) throws ApplicationException;
		
	// deletes a customer
	void deleteCustomer(int customer_id) throws ApplicationException;
		
	//gets a customer
	CustomerPojo getACustomer(int customer_id) throws ApplicationException;
}
