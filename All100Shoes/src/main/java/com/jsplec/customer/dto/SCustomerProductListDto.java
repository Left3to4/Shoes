package com.jsplec.customer.dto;

public class SCustomerProductListDto {

	// Field

	String productmodel;
	int productprice;

	// Constructor

	public SCustomerProductListDto() {
		// TODO Auto-generated constructor stub
	}

	public SCustomerProductListDto(String productmodel, int productprice) {
		super();
		this.productmodel = productmodel;
		this.productprice = productprice;
	}

	public String getProductmodel() {
		return productmodel;
	}

	public void setProductmodel(String productmodel) {
		this.productmodel = productmodel;
	}

	public int getProductprice() {
		return productprice;
	}

	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}

}
