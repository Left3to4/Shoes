package com.jsplec.customer.dto;

public class SCustomerProductListDto {

	// Field

	int productid;
	String productmodel;
	int productprice;
	String productbrand;
	String productcategory;

	// Constructor

	public SCustomerProductListDto() {
		// TODO Auto-generated constructor stub
	}

	public SCustomerProductListDto(int productid, String productmodel, int productprice, String productbrand,
			String productcategory) {
		super();
		this.productid = productid;
		this.productmodel = productmodel;
		this.productprice = productprice;
		this.productbrand = productbrand;
		this.productcategory = productcategory;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
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

	public String getProductbrand() {
		return productbrand;
	}

	public void setProductbrand(String productbrand) {
		this.productbrand = productbrand;
	}

	public String getProductcategory() {
		return productcategory;
	}

	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}

}
