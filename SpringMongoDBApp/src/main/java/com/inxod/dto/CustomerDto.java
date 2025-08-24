package com.inxod.dto;

public class CustomerDto {

	
    private String customerId;
	
	private String customerName;
	
	private String customerCity;
	private Integer customerNumber;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public Integer getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(Integer customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public CustomerDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerDto(String objId ,Integer customerNumber, String customerName, String customerCity) {
		super();
		
		this.customerId = objId;
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.customerCity = customerCity;
	}
}
