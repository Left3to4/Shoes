package com.jsplec.manager.dto;

public class MProductDto {

	// F
	int shoesid;
	String productbrand;
	String productmodel;
	String productsize;
	int productprice;
	int productstock;
	String productstatus;
	
	// C
	public MProductDto() {
		// TODO Auto-generated constructor stub
	}

	public MProductDto(int shoesid, String productbrand, String productmodel, String productsize, int productprice,
			int productstock, String productstatus) {
		super();
		this.shoesid = shoesid;
		this.productbrand = productbrand;
		this.productmodel = productmodel;
		this.productsize = productsize;
		this.productprice = productprice;
		this.productstock = productstock;
		this.productstatus = productstatus;
	}

	// M
	public int getShoesid() {
		return shoesid;
	}

	public void setShoesid(int shoesid) {
		this.shoesid = shoesid;
	}

	public String getProductbrand() {
		return productbrand;
	}

	public void setProductbrand(String productbrand) {
		this.productbrand = productbrand;
	}

	public String getProductmodel() {
		return productmodel;
	}

	public void setProductmodel(String productmodel) {
		this.productmodel = productmodel;
	}

	public String getProductsize() {
		return productsize;
	}

	public void setProductsize(String productsize) {
		this.productsize = productsize;
	}

	public int getProductprice() {
		return productprice;
	}

	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}

	public int getProductstock() {
		return productstock;
	}

	public void setProductstock(int productstock) {
		this.productstock = productstock;
	}

	public String getProductstatus() {
		return productstatus;
	}

	public void setProductstatus(String productstatus) {
		this.productstatus = productstatus;
	}
	
	
	
}
