package com.kita.second.level2.sogilli;

public class Sangsun {
	void method() {
		Hyori hr = new Hyori("유고걸");
		String music = hr.music;
		int follower = hr.follower;
//		boolean star = hr.star;
		hr.sing();
		hr.drinkTea();
//		hr.yoga();
		
		Hyori hr2 = new Hyori(1000);//디폴트 생성자
		
//		Hyori hr3 = new Hyori(true);//프라이빗 생성자
		
		
	}

}
