package service;
import java.util.List;

import exception.ApplicationException;
import pojo.CustomerPojo;
import pojo.TransactionPojo;

public interface CustomerService {
		// C - Create
		// R - Read
		// U - Update
		// D - Delete
		
		


		// fetches all the customers -Read
		 List<CustomerPojo>getAllCustomers() throws ApplicationException;
			
			
	
		
		
		// updates a customer - Update
		CustomerPojo updateCustomer(CustomerPojo customerPojo) throws ApplicationException;
		
		// deletes a customer - Delete
		void deleteCustomer(int customer_id) throws ApplicationException;
		
		// fetches a customer - Read
		CustomerPojo getACustomer(int customer_id) throws ApplicationException;

		
		CustomerPojo addCustomer(CustomerPojo customerPojo) throws ApplicationException;





		TransactionPojo getAllTransactions();

		
	}


