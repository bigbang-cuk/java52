package com.oracle;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Scanner;

import com.util.DBConnectionMgr;

public class EmpJDBC {
	Connection 			con = null;//연결통로확보
	CallableStatement 	cstmt = null;//프로시저를 호출,요청
	public void getProc_deptnoUpdate() {
		String msg = null;//프로시저의 out속성값 받아서 저장할 변수
		//외부클래스의 객체를 주입받기 위해서 작성
		//직접 인스턴스화 하지 않았다.
		DBConnectionMgr dbMgr = DBConnectionMgr.getInstance();
		try {
			//물리적으로 떨어져 있는 오라클 서버의 연결통로 확보
			con = dbMgr.getConnection();
			cstmt = con.prepareCall("{call proc_empnoUpdate(?,?)}");
			System.out.println("부서번호를 입력하세요.");
			Scanner scan = new Scanner(System.in);
			int u_deptno = scan.nextInt();//사용자가 입력한 부서번호 받아오기	
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public String getProc_empnoUpdate() {
		String msg = null;
		DBConnectionMgr dbMgr = DBConnectionMgr.getInstance();
		try {
			con = dbMgr.getConnection();
			cstmt = con.prepareCall("{call proc_empnoUpdate(?,?)}");
			System.out.println("사원번호를 입력하세요.");
			Scanner scan = new Scanner(System.in);
			int u_empno = scan.nextInt();//사용자가 입력한 사원번호 받아오기
			cstmt.setInt(1, u_empno);
			cstmt.registerOutParameter(2, java.sql.Types.VARCHAR);
			//오라클서버에서 처리요청
			int result = cstmt.executeUpdate();
			msg = cstmt.getString(2);
			System.out.println(msg);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return msg;
	}
	public static void main(String[] args) {
		//insert here
		
	}

}
