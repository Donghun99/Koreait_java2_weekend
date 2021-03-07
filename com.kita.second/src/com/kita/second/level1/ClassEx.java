package com.kita.second.level1;

public class ClassEx {
	//필드- 내가 만들어 내고자 하는 부품의 상태/속성을 나타냄
	int field1;
	String field2;
	int[] field3;//인스턴스
	
	int field4;
	static int field5;
	
	void method4() {}
	static void method5() {}
	
	static void methodTest() {//스테틱이 붙으면 만들어지지 않은 인스턴스에는 접근 불가
//		this.field4 =10; 불가능
//		this.method4();  불가능
		
		field5 = 10;//스테틱 붙은 것들 끼리는 가능
		method5();
	}
	
	//생성자 -필드를 초기화시키는 역할,생성자 안에 메소드 넣을 수 있다,매개변수는 있어도 되고 없어도 됨
	public ClassEx() {
		
	}
	
	public ClassEx(int field1) {
		this.field1 = field1;
	}
	
	public ClassEx(int field1, String field2) {
		this(field1);//ClassEx(field1);
		this.field2 = field2;
	}
	
	public ClassEx(int field1, String field2, int[] field3) {
		this(field1, field2);//중복을 반복을 피하지 위함, 첫줄에서만 가능
		this.field3 = field3;
	}
	
	
	//메소드-동작
	public int sum(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	public int sum(int n1, int n2,int n3) {
		int result = sum(sum(n1 , n2) + n3);
		//int result = sum(n1 , n2) + n3;
		//int result = n1 + n2 + n3; 
		return n1 + n2 + n3;
	}
	
	//int sum(int[] arr)
	int sum(int...arr) {//정수배열로 만들어 준다
		//int[] arr
		int total = 0;
		//실행코드
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		
		return total;//int 기본값0,String 기본값null
	}
	
	//오버로딩 :매개변수의 타입,개수,위치 

}
