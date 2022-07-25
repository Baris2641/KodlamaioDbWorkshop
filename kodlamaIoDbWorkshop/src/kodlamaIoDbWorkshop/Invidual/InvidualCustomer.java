package kodlamaIoDbWorkshop.Invidual;

import kodlamaIoDbWorkshop.BaseClasses.Customer;

public class InvidualCustomer extends Customer {
	private String firstName;
	private String lastName;
	private String nationalityId;
	
	public InvidualCustomer() 
	{
		
	}

	public InvidualCustomer(String firstName, String lastName, String nationalityId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
	
}
