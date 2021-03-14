package com.kita.second.level3.cafe;

public class Barista {
	public Coffee makeCoffe(MenuItem mi) {
		Coffee coffee = new Coffee(mi);
		return coffee;
	}

}
