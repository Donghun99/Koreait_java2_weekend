package com.kita.second.level1;

public class Phone {
	// 필드(속성)
	private String phoneName; //이 클래스 외부에서 값을 함부로 수정할수 없도록 private를 쓴다
	private String owner;
	private String color;
	private int memory;
	private String phoneNumber;
	
	void setOwner(String owner) {
		this.owner = owner;
	}
	
	String getOwner() {
		return owner;
	}//private가 있어도 겟터 셋터로 값을 바꾸고 리턴가능
	
	void setColor(String color) {
		this.color = color;
	}
	
	String getColor() {
		return color;
	}
	
	void setMemory(int memory) {
		this.memory = memory;
	}
	
	int getMemory() {
		return memory;
	}
	
	//생성자
	//생성자가 정의되지 않았을때만! 컴파일러가 기본 생성자 넣어줌
	//리턴타입이 없고, 클래스이름이랑 같은 이름을 받는다
	public Phone(){
		super();
	}
	
	public Phone(String phoneName, String color, int memory){
		//phonName = name ; 도 가능
		this.phoneName =phoneName;
		this.color = color;
		this.memory =memory;
	}
	
	//Phone의 모든 필드에 초기값을 넣어주는 생성자 만들기
	public Phone(String phoneName, String owner,String color,int memory,String phoneNumber) {
		this.phoneName =phoneName;
		this.owner = owner;
		this.color = color;
		this.memory =memory;
		this.phoneNumber = phoneNumber;//0으로 시작하는 숫자는 String으로 한다.
	}
	
	
	//메소드(동작)
	// call(타입 person)
	//person에게 전화를 건다.
	void call(String person) {
		System.out.println(person + "에게 전화를 건다.");
	}
	
	//message(String person){}
	//person에게 owner가 문자를 보낸다.
	void message(String person) {
		System.out.printf("%s에게%s가 문자를 보낸다\n",person,owner);
	}
	
	// void or 리턴타입 메소드명(매개변수) {}
}

class Computer { //public을 붙이면 에러가남 퍼블릭은 한파일에 파일이름과 같은 이름 클래스에만 붙음
	//하나의 파일에 여러개의 클래스가 가능하지만 되도록이면 하나만
}
