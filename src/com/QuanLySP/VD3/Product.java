package com.QuanLySP.VD3;
import java.util.Scanner;
public abstract class Product {
	private int id;
	private String name;
	private TypeProduct type;
	private long price;
	public Product(){
		this.id = 0;
		this.name = " ";
		this.price = 0;
		this.type = new TypeProduct();
	}
	public Product(int id, String name, TypeProduct type, long price){
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TypeProduct getType() {
		return type;
	}
	public void setType(TypeProduct type) {
		this.type = type;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", type=" + type
				+ ", price=" + price + "]";
	}
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("id: ");
		this.id = sc.nextInt();
		System.out.println("name: ");
		this.name = sc.nextLine();
		System.out.println("type: ");
		System.out.println("price: ");
		this.price = sc.nextLong();
		System.out.println("type: ");
		this.type.input();
	}
	public abstract long priceForSale();
}
