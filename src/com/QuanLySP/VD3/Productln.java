package com.QuanLySP.VD3;

import java.util.Scanner;

public class Productln extends Product {
private long extraln;
public Productln(){
	super();
	this.extraln = 0;
}

	public Productln(int id, String name, TypeProduct type, long price, long extraln) {
	super(id, name, type, price);
	this.extraln = extraln;
}
	
	public long getExtraln() {
		return extraln;
	}

	public void setExtraln(long extraln) {
		this.extraln = extraln;
	}

	@Override
	public String toString() {
		return "Productln [extraln=" + extraln + "]";
	}
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("extraln: ");
		this.extraln = sc.nextLong();
	}
	@Override
	public long priceForSale() {
		// TODO Auto-generated method stub
		return super.getPrice() + extraln;
	}

}
