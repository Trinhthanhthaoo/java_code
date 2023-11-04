package com.QuanLySP.VD3;

import java.util.ArrayList;

public class TypeProductManager implements IManager<TypeProduct>, ISort{
	private ArrayList<TypeProduct> typeProducts;
	public TypeProductManager(){
		typeProducts = new ArrayList<>();
	}
	
	public TypeProductManager(ArrayList<TypeProduct> typeProducts) {
		this.typeProducts = typeProducts;
	}

	@Override
	public void add(TypeProduct t) {
		// TODO Auto-generated method stub
		ArrayList<TypeProduct> typeProducts = null;
		typeProducts.add(t);
	}

	@Override
	public TypeProduct search(int id) {
		// TODO Auto-generated method stub
		for (TypeProduct t : typeProducts);
		if(t.get)
		return null;
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<TypeProduct> search(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<TypeProduct> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void displayAll() {
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
	
	
	
	}
