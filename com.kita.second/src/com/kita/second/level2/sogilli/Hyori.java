package com.kita.second.level2.sogilli;

public class Hyori {
	// public : 제한x
	// protected :
	// default : 본인 패키지 내부(기본값)
	// private : 자신 클래스 내부
	
	
	public String music;
	int follower;
	private boolean star = true;
	
	public Hyori(String music) {
	    this.music = music;
	    follower = 100;
	    star = true;
	}
	Hyori(int follower){
		sing();
		drinkTea();
		yoga();
	}//디폴트
	private Hyori(boolean star) {}
	
	//메소드
	public void sing () {}
	void drinkTea() {}
	private void yoga() {}

}
