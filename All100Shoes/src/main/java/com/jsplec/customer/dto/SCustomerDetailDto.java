package com.jsplec.customer.dto;

public class SCustomerDetailDto {

	int productid;
	String productmodel;
	int productprice;
	String productsize;
	int productstock;
	
	public SCustomerDetailDto() {
		// TODO Auto-generated constructor stub
	}

	
	


//	productDetail2
	public SCustomerDetailDto(int productid, String productmodel, int productprice, String productsize,
			int productstock) {
		super();
		this.productid = productid;
		this.productmodel = productmodel;
		this.productprice = productprice;
		this.productsize = productsize;
		this.productstock = productstock;
	}






	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductsize() {
		return productsize;
	}

	public void setProductsize(String productsize) {
		this.productsize = productsize;
	}

	public int getProductstock() {
		return productstock;
	}

	public void setProductstock(int productstock) {
		this.productstock = productstock;
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