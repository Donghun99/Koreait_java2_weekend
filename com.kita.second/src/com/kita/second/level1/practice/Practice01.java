package com.kita.second.level1.practice;

public class Practice01 {
	// 2단 구구단 찍기 메소드
	// 2 * 1 = 2..
	public static void main(String[] args) {
//		printGugudan();
//		System.out.println();
//		printGugudan(3);
		printStars(3,4);
		
		int result = sum(1,2);
		int result2 = sum(result, 3);
	}
	public static int sum(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
     public static void printGugudan() {
    	  for(int i=1;i<10;i++) {
    		  System.out.printf("2 * %d = %d\n",i,(2*i));
    	  }
      }
     
     //오버로딩(Overloading)
     //매개변수의 개수,타입,위치가 다르면 오버로딩가능!!
     public static void printGugudan(int dan) {
   	  for(int i=1;i<10;i++) {
   		  System.out.printf("%d * %d = %d\n",dan,i,(dan*i));
   	  }
     }
   	  
   	 public static void printGugudan(int dan, int max) {
      	  for(int i=1;i<10;i++) {
      		  System.out.printf("%d * %d = %d\n",dan,i,(dan*i));
      	  }
   	 }
   

   	 
   	 //별찍기 메소드
   	 //내가 입력하는 값에 따라 line(줄)과 star(별 개수)가 달라지도록
   	 
   	 public static void printStars(int line, int star) {
   		for(int i=0;i<line;i++) {
   			for(int z=0;z<star;z++) {
   			System.out.print("*");
   			}
   			System.out.println();
   		}
   		
   		
   	 }
   
}
