package com.chihwancompany.exer4;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car car = new Car(); //왼쪽 코딩은 에러 발생. 즉 추상클래스는 객체를 생성할 수 없다!
		// 클래스는 설계도인데, 그 클래스로 객체를 선언해야 메모리에 인스턴스가 만들어지고 그 인스턴스를 활용하는 것인데
		//객체를 못 만든다는 것은. 추상클래스는 진짜 설계도 역할만 하는 것. 즉 상속용도로만 쓰이는 것.
		// 즉 객체의 기본설계도 역할만 하는 것. 상속용도로만 쓰는 클래스로 기능하는 것. 
		// 실제 클래스에 꼭 들어가야 할 필드(필수요소)와 메소드를 선언하고, 그것을 상속받아 사용하게 하는 것.
		
		//Phone phone = new Phone(; // 추상클래스는 객체를 선언할 수 없다. 그래서 상속받은 자식 객체를 사용해야 한다.아래 참조
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.turnOff();
		smartPhone.internetSearch();
		
		// 필수적으로 들어가야 할 기능들을 따로 안 만들언호고 상속받아 쓸 수 있게 하는 것. 강제성, 통일성 등
		// 1. 설계도용이니까 객체 생성 불가
		// 2. 상속받는 클래스들은 추상클래스의 기본기능들은 갖고 나머지 자신들이 필요로 하는 기능들을 추가해 사용한다.
	}
// 추상메소드는 추상클래스에서만 사용 가능. 왜냐하면 메소드에 내용이 없으니까 메모리에 만들 수 없는 것.
}
