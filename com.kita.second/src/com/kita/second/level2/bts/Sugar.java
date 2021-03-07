package com.kita.second.level2.bts;

import com.kita.second.level2.sogilli.*;//컨+쉬+o, *붙이면 하위 클래스 전부 접근가능
//import com.kita.second.level2.sogilli.Sangsun;

public class Sugar {
	void method() {
	Hyori hr = new Hyori("유고걸");
	String music = hr.music;
//	int follower = hr.follower;
//	boolean star = hr.star;
	Sangsun ss = new Sangsun();
	
	hr.sing();
//	hr.drinkTea();
//	hr.yoga();
	
//	Hyori hr2 = new Hyori(1000);//디폴트 생성자
	
//	Hyori hr3 = new Hyori(true);//프라이빗 생성자
	}
}
