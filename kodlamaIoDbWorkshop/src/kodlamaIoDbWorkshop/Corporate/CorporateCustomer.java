package kodlamaIoDbWorkshop.Corporate;

import kodlamaIoDbWorkshop.BaseClasses.Canal;
import kodlamaIoDbWorkshop.BaseClasses.Customer;

public class CorporateCustomer extends Customer {
	private String title;
	private String taxNo;
	
	public CorporateCustomer() 
	{
		
	}

	public CorporateCustomer(int id, String customerNo, Canal canal) {
		super(id, customerNo, canal);
		this.title=title;
		this.taxNo=taxNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTaxNo() {
		return taxNo;
	}

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}
	
}
