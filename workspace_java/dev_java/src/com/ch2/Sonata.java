package com.ch2;

public class Sonata {
	int wheelNum = 4;
	int speed = 0;
	String carColor = "빨강";
	void move(int i) {//지역변수
		speed = speed+1;
		System.out.println("지역변수 i는 "+i);
	}
	public static void main(String[] args) {
		//insert here - move메소드 호출하기
		Sonata gnomCar = new Sonata();
		//너 바퀴수가 몇개니?
		System.out.println(gnomCar.wheelNum);
	}

}
