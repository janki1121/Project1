package pojo;

import java.util.Objects;

public class EmployeePojo {

	private int employee_id;
	private String first_name;
	private String last_name;
	private String employee_username;
	private String employee_password;
	
	
	public EmployeePojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeePojo(int employee_id, String first_name, String last_name, String employee_username,
			String employee_password) {
		super();
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.employee_username = employee_username;
		this.employee_password = employee_password;
		
	}
	
	public int getEmployee_id() {
		return employee_id;
	}


	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
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


	public String getEmployee_username() {
		return employee_username;
	}


	public void setEmployee_username(String employee_username) {
		this.employee_username = employee_username;
	}


	public String getEmployee_password() {
		return employee_password;
	}


	public void setEmployee_password(String employee_password) {
		this.employee_password = employee_password;
	}


	@Override
	public String toString() {
		return "EmployeePojo [employee_id=" + employee_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", employee_username=" + employee_username + ", employee_password=" + employee_password + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(employee_id, employee_password, employee_username, first_name, last_name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		EmployeePojo other = (EmployeePojo) obj;
		return employee_id == other.employee_id && Objects.equals(employee_password, other.employee_password)
				&& Objects.equals(employee_username, other.employee_username)
				&& Objects.equals(first_name, other.first_name) && Objects.equals(last_name, other.last_name);
	}
	
	//if required place the equals() and hashcode()
	
	
}
