import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import dao.CustomerDaoJdbcImpl;
import dao.EmployeeDaoJdbcImpl;
import exception.ApplicationException;
import pojo.CustomerPojo;
import pojo.EmployeePojo;
import pojo.TransactionPojo;
import service.CustomerService;
import service.CustomerServiceImpl;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class Demo {

	// Logging Step 1 - obtain an instance of Logger
	private static final Logger logger = LoggerFactory.getLogger(Demo.class);
	
	public static void main(String[] args) {

		// here we will have the input and the outputs
		// the menus are displayed here
		
		// presentation layers calls the methods of the service layer
		// so i need an object of BookServiceImpl
		CustomerService customerService = new CustomerServiceImpl(); // always the interface reference variable should point to the object of the implementation class
		EmployeeService employeeService = new EmployeeServiceImpl();
		try (Scanner scan = new Scanner(System.in)) {
			char continueApp = 'y';

			while (continueApp == 'y' || continueApp == 'Y') {

				System.out.println("*************************************************");
				System.out.println("\t\tBANK MANAGEMENT SYSTEM");
				System.out.println("*************************************************");
				System.out.println("MAIN MENU");
				System.out.println("*************************************************");
				System.out.println("1. View Employees: ");
				System.out.println("2. View Customers: ");
				System.out.println("3. Create new customer: ");
				System.out.println("4. View transaction history: ");
				System.out.println("5. Deposit money: ");
				System.out.println("6. Transfer money: ");
				System.out.println("7. Log out");
				System.out.println("*************************************************");
				System.out.println("Please enter an option : ");
				int option = scan.nextInt();
				System.out.println("*************************************************");
				switch (option) {
				case 1:
					// will remove this statement later an dput the actual code here
					// System.out.println("Listing all the books....");
					
					List<EmployeePojo> fetchedAllEmployees;
					try {
						fetchedAllEmployees = employeeService.getAllEmployees();
					} catch (ApplicationException e) {
						// Logging Step 2 - log the exception in each catch black
						logger.error("Exception occurred : " + e.getMessage());
						System.out.println(e.getMessage()); // print the exception message on the console
						break; // there is no point in continuing the case, so break out of it
					}
					System.out.println("=============================================================================");
					System.out.println("ID\tFirst_name\tLast_name\tUsername\tPassword");
					System.out.println("=============================================================================");
					
					for(int i=0;i<fetchedAllEmployees.size();i++) {
						//System.out.println("Employee ID : " + ((EmployeePojo) fetchedAllEmployees).getEmployee_id());
						//System.out.println("First Name : " + ((EmployeePojo) fetchedAllEmployees).getFirst_name());
						//System.out.println("Last Name : " + ((EmployeePojo) fetchedAllEmployees).getLast_name());
						//System.out.println("Account Balance : " + ((EmployeePojo) fetchedAllEmployees).getEmployee_username());
						System.out.println(fetchedAllEmployees.get(i).getEmployee_id() + "\t" + fetchedAllEmployees.get(i).getFirst_name() + "\t" + fetchedAllEmployees.get(i).getLast_name() + "\t" + fetchedAllEmployees.get(i).getEmployee_username() + "\t" + fetchedAllEmployees.get(i).getEmployee_password());
					}
					System.out.println("=============================================================================");
					break;
				case 2:
					List<CustomerPojo> fetchedAllCustomers;
					try {
						fetchedAllCustomers = customerService.getAllCustomers();
					} catch (ApplicationException e) {
						// Logging Step 2 - log the exception in each catch black
						logger.error("Exception occurred : " + e.getMessage());
						System.out.println(e.getMessage()); // print the exception message on the console
						break; // there is no point in continuing the case, so break out of it
					}
					//System.out.println("=============================================================================");
					//System.out.println("ID\tFirst_name Last_name \tUsername  \tPassword  \tAcc_balance");
					//System.out.println("=============================================================================");
					for(int i=0;i<fetchedAllCustomers.size();i++) {
						System.out.println("ID : " + fetchedAllCustomers.get(i).getCustomer_id() + "\nFirst Name : " + fetchedAllCustomers.get(i).getFirst_name() + "\nLast Name : " + fetchedAllCustomers.get(i).getLast_name() + "\nUserName : " + fetchedAllCustomers.get(i).getCustomer_username() + "\nPass : " + fetchedAllCustomers.get(i).getCustomer_password() +  "\nAccount Balance : " +fetchedAllCustomers.get(i).getAcc_balance());
					}
					System.out.println("=============================================================================");
					break;
				case 3: 
					System.out.println("Enter new customer's account details: ");
					System.out.println("*****************************************************");
					//System.out.println("Customer id: ");
					//System.out.println("*****************************************************");
					//option = Integer.parseInt(scan.nextLine()); //do I need to use just scan.nextInt? or not option?
					//int customer_id = scan.nextInt();
					System.out.println("*****************************************************");
					System.out.println("Customer first name: ");
					System.out.println("*****************************************************");
					scan.nextLine();
					String first_name = scan.nextLine();
					System.out.println("*****************************************************");
					System.out.println("Customer last name: ");
					System.out.println("*****************************************************");
					//scan.nextLine();
					String last_name = scan.nextLine();
					System.out.println("*****************************************************");
					System.out.println("Customer username: ");
					System.out.println("*****************************************************");
					//scan.nextLine();
					String customer_username = scan.nextLine();
					System.out.println("*****************************************************");
					System.out.println("Customer password: ");
					System.out.println("*****************************************************");
					//scan.nextLine();
					String customer_password = scan.nextLine();
					System.out.println("*****************************************************");
					System.out.println("Initial deposit amount: ");
					System.out.println("*****************************************************");
					//option = Integer.parseInt(scan.nextLine());
					int acc_balance = Integer.parseInt(scan.nextLine());
					
					//now create a customer pojo object and set these values into it
					CustomerPojo newCustomer = new CustomerPojo();
					//newCustomer.setCustomer_id(customer_id);
					newCustomer.setFirst_name(first_name);
					newCustomer.setLast_name(last_name);
					newCustomer.setCustomer_username(customer_username);
					newCustomer.setCustomer_password(customer_password);
					newCustomer.setAcc_balance(acc_balance);
					
					CustomerPojo newCustomerPojoWithId;
					System.out.println(newCustomer.getAcc_balance());
					try {
						newCustomerPojoWithId = customerService.addCustomer(newCustomer);
						
					} catch (ApplicationException e) {
						//Logging step 2 - log the exception in each catch block
						logger.error("Exception occurred : "+ e.getMessage());
						
						System.out.println(e.getMessage());
						break;
					}
					
					System.out.println("*****************************************************");
					System.out.println("New customer with ID " + newCustomerPojoWithId.getCustomer_id() + " is added!! ");
					
					break;
				case 4:
					//List<TransactionPojo> fetchedAllTransactions;
					//fetchedAllTransactions = customerService.getAllTransactions();
					

					
					break;
				case 5:
					System.out.println("Please enter Customer ID");
					int customer_id = scan.nextInt();
					//int customer_id = Integer.parseInt(scan.nextLine());
					CustomerPojo fetchedCustomerPojo;
					try {
						fetchedCustomerPojo = customerService.getACustomer(customer_id);
					} catch (ApplicationException e) {
						//Logging Step 2 - log the exception in each catch block
						logger.error("Exception occurred : " + e.getMessage());
						
						System.out.println(e.getMessage()); // print the exception message on the console
						break;
					}
					if(fetchedCustomerPojo == null) {
						System.out.println("Customer with ID " + customer_id + " does not exist!!");
					} else {
						// the customer with the id has been found so display the customer information
						System.out.println("=============================");
						System.out.println("Customer ID : " + fetchedCustomerPojo.getCustomer_id());
						System.out.println("First Name : " + fetchedCustomerPojo.getFirst_name());
						System.out.println("Last Name : " + fetchedCustomerPojo.getLast_name());
						System.out.println("Account Balance : " + fetchedCustomerPojo.getAcc_balance());
						System.out.println("=============================");
						System.out.println("Enter deposit amount: ");
						int deposit_amount = scan.nextInt();
						//int deposit_amount = Integer.parseInt(scan.nextLine());
						int new_acc_balance = fetchedCustomerPojo.getAcc_balance() + deposit_amount;
						//fetchedCustomerPojo.setAcc_balance(new_acc_balance);
						
						try {
							
							fetchedCustomerPojo.setAcc_balance(new_acc_balance);
							CustomerPojo updatedCustomerPojo = customerService.updateCustomer(fetchedCustomerPojo);
						} catch (ApplicationException e) {
							logger.error("Exception occured : " + e.getMessage());
							break;
						}
						System.out.println("*****************************************************");
						System.out.println("Amount deposited sucessfully!! You new account balance is " + new_acc_balance);
					}
					
					break;
				case 6:
					System.out.println("Transfer amount $: ");
					int transferAmount = scan.nextInt();
					//option = Integer.parseInt(scan.nextLine());
					System.out.println("Who would you like to transfer money to?\nEnter account customer's id: ");
					int toCustomer_id = scan.nextInt();
					CustomerPojo updateCustomerPojo;
					try {
						updateCustomerPojo = customerService.getACustomer(toCustomer_id);
					} catch (ApplicationException e) {
						logger.error("Exception occurred : " + e.getMessage());
						System.out.println(e.getMessage());
						break;
					}
					if(updateCustomerPojo == null) {
						System.out.println("Transfer to " + toCustomer_id + "was unsucessful!!");
					} else {
						System.out.println("Your account balance is : " + updateCustomerPojo.getAcc_balance());
						
					}
					//customer_id = Integer.parseInt(scan.nextLine());
					
					break;
				case 7:
					System.out.println("*************************************************");
					System.out.println("THANK YOU FOR USING BANK MANAGEMENT SYSTEM!!");
					System.out.println("*************************************************");
					System.exit(0);
					break;
				default:
					System.out.println("Please enter a valid option!!");

				}
				System.out.println("*************************************************");
				System.out.println("Do you want to continue(y/n) ?");
				continueApp = scan.next().charAt(0); // taking out the first character of the string that was given as input
				// here
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("*************************************************");
		System.out.println("THANK YOU FOR USING BANK MANAGEMENT SYSTEM!!");
		System.out.println("*************************************************");

	}

	private static int IntegerparseInt(String nextLine) {
		// TODO Auto-generated method stub
		return 0;
	}

}
