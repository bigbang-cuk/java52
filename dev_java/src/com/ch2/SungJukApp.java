package com.ch2;
/*
 *  메소드의 리턴 타입이 필요한 경우 - void를 쓰면 안된다.
 *  왜냐하면 유지되지 않으니까
 *  왜냐하면 stack영역에 사는 변수라서 자동으로 소멸되니까
 *  필요없을 때 - 그 메소드의 실행결과가 다른 메소드에 사용될 필요가 없으면 void
 * 
 */
public class SungJukApp {
	void total() {
		//return 85;
		System.out.println("total메소드 호출 성공"+);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SungJukApp sjApp = new SungJukApp();
		sjApp.total();
		//System.out.println(sjApp.total());//85
	}

}
