package com.quiz0510;

public class B {

	public static void main(String[] args) {
		String s = new String("hello");
		String s2 = new String("hello");
		if(s.equals(s2)) {
			System.out.println("s가 가진 문자열 hello와 s2가 가진 문자열  hello가 같니?");
		}
		if(s==s2) {
			System.out.println("s==s2가 같니 라고 묻는건 문자열을 비교하는게 아니고 주소번지가 같은지?");
		}
		else {
			System.out.println("s의 주소번지값과 s2의 주소번지값이 다르다.");
		}

	}

}
