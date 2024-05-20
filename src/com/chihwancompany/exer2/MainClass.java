package com.chihwancompany.exer2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company company = new Company();
		company.name = "홍길동";
				
		//company.human = new Human();  // human으로 만든 객체이므로 왼쪽과 같이 코딩해야 초기화가 가능.
		//company.human = new Student(); // 왼족 코딩도 가능한 것.
		company.human1 = new Student(); // 이상은 모두 업캐스팅.
		company.human2 = new Worker();
		company.human3 = new Soldier();
		
		
		
	}

}
