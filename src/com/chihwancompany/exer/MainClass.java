package com.chihwancompany.exer;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat = new Cat(); // 자식 객체인 cat 객체 선언. 
		
		Animal animal = new Animal(); // 부모객체인 animal 객체 선언
		
		int a=1;
		byte b=10;
		a = b; // a에 b를 넣는 것이 에러가 안남. 반대로 하면 에러 발생. 왜냐하면 a는 정수라 4바이트로 b보다 크기 때문.
		//b=a; // 에러 발생.
		double c=1.5;
		int d =10;
		// 파이썬 식으로 하면  d = (int)c; 정수로 변환해서 하면 들어감. 
		
		animal = cat; //*업캐스팅(자식클래스의 객체가 부모클래스 타입으로 형변환된느 것을 업캐스팅. 부모계층으로 한칸 올라가니까.)
		//업캐스팅을 매우 많이 활용한다고.
		//cat = animal; //이렇게 하면 에러가 남. 왜냐하면 서열이 낮은 자식 cat에 부모인animal을 대입하려 하기 때문.
		// 크기상으로 치면 자식은 부모를 상속해서 2층집이니까 자식이 부모보다 크기는 더 크다. 하지만 자식은 부모에게 들어가지만 부모는 자식에게 못들어감.
		// 그 이유는 =이 저장한다의 의미가 아니라 대입연산자인 것.
		//cat = (Cat) animal; // 다운캐스팅(부모클래스의 객체가 자식클래스 타입으로 형변환되는 것) 
		// 원래는 안 되지만 임시형변환으로 그 줄에서만 형편환을 하면 자식이 부모를 받아도 에러가 난남.
		// 이상이 형변환. 
		
//		Dog dog = new Dog();
//		Tiger tiger = new Tiger();
//		Cat cat1 = new Cat();
//		
//		Animal animal2 = new Dog(); // 이것이 가능하게 됨. 왜냐하면 부모는 자식의 모든 것을 받아주니까. 업캐스팅이 일어난 것.
//		Animal animal1 = new Animal();
//		
//		animal1 = new Dog();
//		animal1 = new Tiger();
//		animal1 = new Cat(); // 객체는 하나만 만들어 놓고. 업캐스팅이 가능하기 때문에. 필요할 때마다 자식객체를 대입받아 사용가능.
		// 필드를 다 다르게 만들면 필드의 다형성이 발생.
	}

}
