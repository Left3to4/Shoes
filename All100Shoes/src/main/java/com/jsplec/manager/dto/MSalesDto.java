package com.jsplec.manager.dto;

import java.sql.Timestamp;

public class MSalesDto {

	// F
	int seq;
	int sales;
	Timestamp orderdate;
	
	
	// C
	public MSalesDto() {
		// TODO Auto-generated constructor stub
	}
	
	public MSalesDto(int seq, int sales, Timestamp orderdate) {
		super();
		this.seq = seq;
		this.sales = sales;
		this.orderdate = orderdate;
	}

	// M
	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}
	
	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public Timestamp getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Timestamp orderdate) {
		this.orderdate = orderdate;
	}
	
	
	
} // End
