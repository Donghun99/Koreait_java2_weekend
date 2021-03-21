package com.kita.second.level3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCollection {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<Dog> list2 = new LinkedList<Dog>();
		
		boolean result = list1.add("안녕");//삽입
		String result1 = list1.get(0);//뽑아오기
		list1.set(0, "하이");//수정
//		String result2 = list1.remove(0);//인덱스값
		boolean result2 = list1.remove("하이");//삭제
		int len = list1.size();//리스트 길이
		
		//list1에 좋아하는 음식 5개 입력
		//for문 사용 list1안의 값 출력
		//list1의 3번째 인덱스값을 싫어하는 음식으로 바꾸기
		//list1의 싫어하는 음식값을 삭제하기
	   
		 ArrayList<String> foods = new ArrayList<String>();
	        foods.add("피자");
	        foods.add("치킨");
	        foods.add("불고기");
	        foods.add("족발");
	        foods.add("곱창");
	        for(String food: foods) {
	            System.out.println(food);
	        }
	        
	       foods.set(3, "피망");
	       boolean result3 = foods.remove("피망");
	       for(String food: foods) {
	            System.out.println(food);
	        }
	       System.out.println(result3);
	       
	       
	       
	       Dog d1;//리스트가 도그타입
	       d1 = new Dog("누렁이");
	       Dog d2 = new Dog("흰둥이");
	       Dog d3 = new Dog("얼룩이");
	       
	       list2.add(d1);
	       list2.add(d2);
	       list2.add(new Dog("얼룩이"));
	       for (int i = 0; i < list2.size(); i++) {
	    	Dog d = list2.get(i);
	    	String name = d.name;
			System.out.println("댕댕이: "+name);
		}
	      for(Dog val : list2) {
	    	 Dog d = val;
		    String name = d.name;
			System.out.println("댕댕이: "+name);
	      }
	      list2.set(2,new Dog("까망이"));//수정
	      list2.remove(0);
	     
	    
	       
	}
	
	
}
