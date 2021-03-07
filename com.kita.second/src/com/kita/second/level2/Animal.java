package com.kita.second.level2;

public class Animal {
	String name;
	int age;
	private String type;
	
	public Animal(String name) {
		this.name = name;
	}
	
	 void cry(){
		System.out.println("동물이 운다.");
	}//final이 붙으면 자식클래스에서 오버라이딩(재정의)불가함,필드,클래스,메소드에 final붙일수있다.
	
	private void method() {}

}
