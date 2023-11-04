package com.QuanLySP.VD3;
import java.util.Scanner;
public class TypeProduct{
	private int id;
	private  String name;
	private String description;
	public TypeProduct(){
		this.description = "";
		this.id = 0;
		this.name = "";
		
	}
	public TypeProduct(int id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "TypeProduct [id=" + id + ", name=" + name + ", description="
				+ description + "]";
	}
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("id: ");
		this.id = sc.nextInt();
		System.out.println("name: ");
		this.name = sc.nextLine();
		System.out.println("description: ");
		this.description = sc.nextLine();
	}
}
