package com.kita.second.level3.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
	private List<Card> arr = new ArrayList<Card>();
	
	public CardDeck() {
		init();
	}
	
	private void init() {
		//반복문 사용하여 CardDeck인 arr안에 중복되지 않게 Card타입 인스턴스 생성하여 집어넣기
		for(int i=0; i<Card.PATTARNS.size(); i++) {
			for(int z=1; z<=13; z++) {
			
		}
	}
	
	private String getDeno(int num) {
		switch(num) {
		//1이면A
		//11이면 J
		//12이면 Q
		//13이면 K
		//나머지 숫자값 그대로 리턴
		case 1: return"A";
		case 11: return"J";
		case 12: return"Q";
		case 13: return"K";
		default: return String.valueOf(num);  
		}
	}
	
	public Card getCard() {
		//0~list의 크기보다 1작은
		//값까지 중 한 값을 랜덤으로 뽑아서
		//list는 삭제
		//return 
	}
	
	@Override
	public String toString() {
		String str = "";
		for(Card c : arr) {
			str += (c + "\n");
		}
		return str;
	}

}
