package pojo;

//import java.util.Objects;

public class CustomerPojo {

	private int customer_id;
	private String first_name;
	private String last_name;
	private String customer_username;
	private String customer_password;
	private int acc_balance;
	//private int deposit_amount;
	public CustomerPojo() {
		super();
	}
	//class constructor
	public CustomerPojo(int customer_id, String first_name, String last_name, String customer_username, String customer_password, int acc_balance) {
		super();
		this.customer_id = customer_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.customer_username = customer_username;
		this.customer_password = customer_password;
		this.acc_balance = acc_balance;
	}

	

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getCustomer_username() {
		return customer_username;
	}

	public void setCustomer_username(String customer_username) {
		this.customer_username = customer_username;
	}

	public String getCustomer_password() {
		return customer_password;
	}

	public void setCustomer_password(String customer_password) {
		this.customer_password = customer_password;
	}

	public int getAcc_balance() {
		return acc_balance;
	}

	public void setAcc_balance(int acc_balance) {
		this.acc_balance = acc_balance;
	}

	@Override
	public String toString() {
		return "CustomerPojo [customer_id=" + customer_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", customer_username=" + customer_username + ", customer_password=" + customer_password
				+ ", acc_balance=" + acc_balance + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + acc_balance;
		result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
		result = prime * result + customer_id;
		result = prime * result + ((customer_username == null) ? 0 : customer_username.hashCode());
		result = prime * result + ((customer_password == null) ? 0 : customer_password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		CustomerPojo other = (CustomerPojo) obj;
		if(customer_id != other.customer_id)
			return false;
		if(first_name == null) {
			if(other.first_name != null)
			return false;
		} else if(!first_name.equals(other.first_name))
			return false;
		if(last_name == null) {
			if(other.last_name != null)
			return false;	
		} else if(!last_name.equals(other.last_name))
			return false;
		if(customer_username == null) {
			if(other.customer_username != null)
			return false;
		} else if(!customer_username.equals(other.customer_username))
			return false;
		if(customer_password == null) {
			if(other.customer_password != null)
			return false;
		} else if(!customer_password.equals(other.customer_password))
			return false;
		if(acc_balance != other.acc_balance)
			return false;
		return true;
			
		}
	}

	
	
