package com.kita.second.level1.practice;

public class Tv {
	//전원(isPowerOn) 채널 볼륨
	//기본값 전원 false, 채널1, 볼륨0
	//전원켜기, 전원끄기
	//채널올리기,채널 내리기
	//볼륨높이기,볼륨 낮추기
	
	//필드
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	//생성자
	public Tv() {
		isPowerOn = false;
		channel = 1;
		volume = 0;
		
	}
	
	//메소드
	void powerOn(){
		if(isPowerOn) {
			System.out.println("전원이 이미 켜져있습니다.");
			return;//메소드끝이남
		}
		  System.out.println("전원을 낀다");
		}
	void powerOff(){
		  System.out.println("전원을 끈다");  
		}
	void channelUp(){
		  channel++;
		  System.out.println("채널을 올린다"); 
		} 
	void channelDown(){
		 if(channel<2) {
			 System.out.println("최소채널입니다.");
			 return;
		 }
		  channel--;
		  System.out.println("채널을 내린다");  
		}
	void volumnUp() {
		 System.out.println("볼륨을 올린다");  
	}
	void volumnDown() {
		System.out.println("볼륨을 내린다");
	}

}
