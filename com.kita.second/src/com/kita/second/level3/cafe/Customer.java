package com.kita.second.level3.cafe;

import java.util.Scanner;

public class Customer {
	public MenuItem order(Menu m) {
		m.showMenus();
		Scanner scan = new Scanner(System.in);
		MenuItem mi = null; //고객선택메뉴
		while(mi == null) {
			System.out.print("메뉴 번호를 입력해 주세요 : ");
			String strNum = scan.next();
			int menuNum;
			try {
				menuNum = Integer.parseInt(strNum);
			    mi = m.choose(menuNum -1);//인덱스 값을 보내주기 위해서
			} catch(NumberFormatException e) {
				System.out.println("숫자만 입력해 주세요.");
			} catch(Exception e) {
				System.out.println("메뉴를 잘못 선택하셨습니다.");//메뉴판에 없는 숫자인 경우
			}
		}
		scan.close();
		return mi;
	}
	
	public void drinkCoffee(Coffee coffee) {
		System.out.printf("%s를 마신다.", coffee.getName());
	}
	}

