package com.QuanLySP.VD3;

import java.util.ArrayList;

public class ProductManager implements IManager<Product>, ISort, ISortPrice {
	private ArrayList<Product> products;
	public ProductManager(){
		
	}
	public ProductManager(ArrayList<Product> products) {
		
		this.products = products;
	}

	@Override
	public void sortByPrice() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortByPrice(boolean reverse) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortById() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortById(boolean reverse) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(Product t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product search(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Product> search(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		
	}

}
