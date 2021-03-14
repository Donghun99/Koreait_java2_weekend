package com.kita.second.level3;

import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		int[] arr = new int[2];
		try {
			//에러가 날 수 있는 코드
			System.out.println(arr[2]);
		} catch(NullPointerException e) {
			System.out.println("NullPointer 예외가 발생했습니다.");
		}
		catch(Exception e) {
			//예외 발생 시 처리 코드 
			System.out.println("예외가 발생했습니다.");
		} 
		finally {//에러와 상관없이 무조건 출력된다.
			System.out.println("예외처리구간끝");
		}
		System.out.println("다음코드");
		
		
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.print("숫자를 입력하시오.");
//		int num = scan.nextInt();
//		
//		String strNum = scan.next();
//		num = Integer.parseInt(strNum);
		
		String strNum = scan.next();
		
		
		try {
			num = Integer.parseInt(strNum);
			arr[2] = num;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBounds 예외가 발생했습니다.");
		}catch(NumberFormatException e) {
			System.out.println("NumberFormat 예외가 발생했습니다.");
		}
		catch(Exception e) {
			System.out.println("예외가 발생했습니다.");
		}
		}

}
