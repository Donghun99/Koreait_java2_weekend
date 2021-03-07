package com.kita.second.level2;

public class Magician extends Adventurer {
	//Adventurer 클래스를 상속받아서
	//mp 필드 추가
	//attack 메소드를 "마법공격"으로 재정의
	//teleport 메소드를 추가
	
	int mp;
	

	public Magician(int strength, int intellegence
			, int dexterity, int luck,int hp, int mp) {
		super();
		this.mp = mp;	
	}

	@Override
	void attack() {
		System.out.println("마법공격을 한다.");
	}
	

	
	void teleport() {
		System.out.println("텔레포트를 한다.");
	}
	

}
