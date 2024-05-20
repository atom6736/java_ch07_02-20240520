package com.chihwancompany.exer4;

public class Truck extends Car {
	
	
	//****매우 중요
	// 부모클래스의 추상메소드는 반드시 오버라이딩해서 자식클래서에서 사용해야 함.!!
	// 내용이 없더라도 오버라이딩해서 사용해야 할 의무가 생김. 안 하면 에러 발생.
	//보모클래스에서 이름만 선언해놓고 자식클래스에서 그 추상메소드는 반드시 오버라이딩해서 써야 하는 메소드.
	public void drive() { // Car클래스에 추상메소드인 drive메소드를 오버라이딩 함.
		System.out.println("트럭운전"); 
	}

}
