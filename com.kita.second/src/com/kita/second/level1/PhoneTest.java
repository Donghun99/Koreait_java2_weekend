package com.kita.second.level1;

import java.util.Scanner;

public class PhoneTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Phone myphone = new Phone();
//		myphone.call("엄마");
//		myphone.color = "파랑";
//		myphone.phoneName ="아이폰10";
//		myphone.owner ="이동훈";
//		myphone.memory = 512;
		
		Phone p1 =new Phone("갤럭시 s20", "빨강", 256);
		p1.setOwner("박연진");
		String p1Owner = p1.getOwner();
		System.out.println("p1의 주인은"+p1Owner);
		
		int p1Memory = p1.getMemory();
		System.out.println("p1의 메모리는" +p1Memory );
		p1.setMemory(512);
		p1Memory = p1.getMemory();
		System.out.println("p1의 메모리는"+p1Memory);
		//Phone.getMemory(); 이렇게하면 오류
		
		myphone.call("엄마");
		
		Phone yourPhone = new Phone();
		
		
		
	}

}
