package com.kita.second.level1;

public class Test {
	public static void main(String[] args) {
//		Korean yj = new Korean("대한민국");
//		System.out.println(yj.nation);
//		yj.nation = "미국"
		
//		Korean ms = new Korean("미국");
//		System.out.println(ms.nation);
//		ms.nation = "한국";
		
		
		ClassEx cl = new ClassEx(); //new는 만들어진 구조를 찍어내는 역할,하나의 물건이 생겼다고 이해
		//int result = ClassEx.sum(3,8,4,1,2); //ClassEx의 sum앞에 static이 붙어있을 경우만 가능
		int result = cl.sum(3,8,4,1,2);
		System.out.println("result: " + result);
		int result2 = cl.sum(4,5,9,5,6,4,3);
		System.out.println("result2: " + result2);
	}

}
