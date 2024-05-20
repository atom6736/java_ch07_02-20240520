package com.chihwancompany.exer4;

public abstract class Phone {

		public String owner;

		public Phone(String owner) {
			super();
			this.owner = owner;
		}
		public abstract void turnOn();  //추상메소드
		
		public abstract void turnOff();
}
