package com.QuanLySP.VD3;

import java.util.Scanner;

public class ProductOut extends Product {
	private long extraOut;
	public ProductOut(){
		super();
		this.extraOut = 0;
	}
	
	public ProductOut(long extraOut) {
		super();
		this.extraOut = extraOut;
	}
	
	public long getExtraOut() {
		return extraOut;
	}

	public void setExtraOut(long extraOut) {
		this.extraOut = extraOut;
	}

	@Override
	public String toString() {
		return "ProductOut [extraOut=" + extraOut + "]";
	}
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("extraOut: ");
		this.extraOut = sc.nextLong();
	}
	@Override
	public long priceForSale() {
		// TODO Auto-generated method stub
		return (long) (super.getPrice() + extraOut + 0.1 * extraOut);
	}

}
