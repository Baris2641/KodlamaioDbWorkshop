package kodlamaIoDbWorkshop.BaseClasses;

import java.sql.Date;

public class Funds {
	private int id;
	private int customerId;
	private Date date;
	private double quantity;
	
	public Funds() 
	{
		
	}

	public Funds(int id, int customerId, Date date, double quantity) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.date = date;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	
	
}
