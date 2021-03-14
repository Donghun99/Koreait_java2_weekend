package com.kita.second.level3;

public class MusicPlayer implements IUAlbum, BTSAlbum {//다중상속가능(인터페이스)
	public void playIUAlbum() {//부모가 public이면 그 이하 접근제어자 사용불가
		System.out.println("아이유 앨범을 재생한다.");
	}
	
	public void playBTSAlbum() {
		System.out.println("BTS 앨범을 재생한다.");
	}

}
