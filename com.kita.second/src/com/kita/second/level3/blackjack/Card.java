package com.kita.second.level3.blackjack;

public class Card {
	public final String[] PATTARNS = {"스페이드","하트","클로버","다이아"};
	private final String pattern;
	private final String denomination;
	private final int point;
	
	//Card 생성자로 pattern, denonination, point 값 매개변수 받아 넣기
	public Card(String pattern, String denomination, int point) { 
		this.pattern = pattern;
		this.denomination = denomination;
		this.point = point;
	}
	
	//pattern, demonination, point 각각 getter메소드 만들기

	public String getPattern() {
		return pattern;
	}
	
	public String getDenomination() {
		return denomination;
	}
	
	public int getPoint() {
		return point;
	}
	
	
		
	

}
