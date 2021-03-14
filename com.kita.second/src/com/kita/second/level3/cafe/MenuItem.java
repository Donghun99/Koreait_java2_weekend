package com.kita.second.level3.cafe;

public class MenuItem {
	private String name;
	private int price;
	
	public MenuItem(String name,int price) {
//		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getprice() {
		return price;
	}
	
	@Override
	public String toString() {
		return String.format("%s\t\t%,d원", name, price); 
	}// %,d는 100단위로 콤마를 찍어준다(,)

	// \n \' \" \\
}
