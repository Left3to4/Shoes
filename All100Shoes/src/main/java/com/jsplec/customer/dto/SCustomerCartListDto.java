package com.jsplec.customer.dto;

public class SCustomerCartListDto {

	int orderid;
	int productid;
	String productmodel;
	int productprice;
	String productcategory;
	String productsize;
	int orderquantity;
	
	public SCustomerCartListDto() {
		// TODO Auto-generated constructor stub
	}

	
	
	public SCustomerCartListDto(int orderid, int productid, String productmodel, int productprice, String productcategory,
			String productsize, int orderquantity) {
		super();
		this.orderid = orderid;
		this.productid = productid;
		this.productmodel = productmodel;
		this.productprice = productprice;
		this.productcategory = productcategory;
		this.productsize = productsize;
		this.orderquantity = orderquantity;
	}



	
	
	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
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

	public String getProductcategory() {
		return productcategory;
	}

	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}

	public String getProductsize() {
		return productsize;
	}

	public void setProductsize(String productsize) {
		this.productsize = productsize;
	}

	public int getOrderquantity() {
		return orderquantity;
	}

	public void setOrderquantity(int orderquantity) {
		this.orderquantity = orderquantity;
	}
	
	
	
}
