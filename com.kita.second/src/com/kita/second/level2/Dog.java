package com.kita.second.level2;

public class Dog extends Animal {
	boolean cutiness;
	
	public Dog(String name) {
		super(name); //Animal(name);
//		super.age =1;
		this.cutiness = true;
//		super.type ="";
//		super.method();
		
	}
	
	void barking() {
		System.out.println("개가 짖는다.");
	}
	
	

}
