package com.quiz0510;

public class A {

	public static void main(String[] args) {
		Integer a = new Integer(10);
		Integer b = new Integer(10);
		Integer c = a;
		if(a==10) {
			System.out.println("주소번지가 가리키는 값과 10이 같니?");
		}
		//Integer c = new Integer(10);
		if(a==c) {
			System.out.println("주소번지가 같다");
		}
		else {
			System.out.println
			("변수 a의 주소번지와 b의 주소번지가 다르다");
			System.out.println
			("변수 a가 가리키는 값과 변수 b가 가리키는 값을 비교하는게 아니다.");
		}

	}

}
