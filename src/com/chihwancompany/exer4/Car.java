package com.chihwancompany.exer4;// 추상클래스 연습

public abstract class Car { // 내용물은 일반 클래스와 비슷한데 상속받을 때 다른게 생김.abstract 추상클래스
	String model;
	String color;
	int carAge;
	
	public abstract void drive();
	
	public void horn() { // 경적
		System.out.println("빵빵");
		
	}
}
