package com.chihwancompany.exer4;

//public class SmartPhone extends Phone { //이랬더니 생성자를 정의햐야 한다고 에러. 그래서 퀵 픽스를 골랐더니 

public class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}
	
	public void internetSearch() {
		System.out.println("인터넷을 연결합니다..");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}
}
