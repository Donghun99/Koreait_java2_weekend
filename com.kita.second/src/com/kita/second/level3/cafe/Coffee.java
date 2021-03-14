package com.kita.second.level3.cafe;

public class Coffee {
	private String name;
	private int price;
	
	public Coffee(MenuItem mi) {
		name = mi.getName();
		price = mi.getprice();

	}
	
	public String getName() {
		return name;
	}
	
	public int getprice() {
		return price;
	}

}
