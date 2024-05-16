package javabasic.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonMain {
	public static void main(String[] args) {
		
		//커넥션 생성
		Connection conn = ConnectionUtil.getConnection();
		
		//데이터입력
		/*
		Person person =new Person("홍길동",20);
		Statement stmt=null;
		
		//SQL : Structurend Quuery Language (데이터 베이스에 보내는 문장)
			String spl = " insert into person(pname, page) values('"+person.getPname()+"', "+ person.getPage() +" ) ";
			try {
				stmt = conn.createStatement();
				stmt.execute(spl);
				} catch (SQLException e) {
				e.printStackTrace();
				}finally {
				try {
					stmt.close();
					} catch (SQLException e2) {
						e2.printStackTrace();
						}
				}
				*/
		//데이터 조회
		/*
		String selectSql ="select pname, page from person";
		Statement stmt=null;
		//결과 집행의 각 행을 가르키는 커서(Cursor)
		ResultSet rs = null;
		try {
			conn = ConnectionUtil.getConnection();
			stmt = conn.createStatement();
			//select 구문을 수행하고 결과를 커서로 변환
			rs = stmt.executeQuery(selectSql);
			//행이 있는 동안 반복해서 컬럼의 값들을 타입에 맞춰서 출력
			while(rs.next()) {
				System.out.println(rs.getString(1)+ ", "+rs.getInt(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				ConnectionUtil.closeConnection(conn);
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		*/
		
		/*데이터 수정
		//수정 데이터 객체 생성
		Person person =new Person("강감찬",30);
		Statement stmt=null;
		
		//SQL : Structurend Quuery Language (데이터 베이스에 보내는 문장)
			String spl = " Update person set pname='"+person.getPname()+"', page= "+person.getPage()+" ";
			try {
				stmt = conn.createStatement();
				stmt.execute(spl);
				} catch (SQLException e) {
				e.printStackTrace();
				}finally {
				try {
					stmt.close();
					} catch (SQLException e2) {
						e2.printStackTrace();
						}
				}
				*/
		
		/*데이터 삭제*/
		Statement stmt=null;
		
		//SQL : Structurend Quuery Language (데이터 베이스에 보내는 문장)
			String spl = " delete person ";
			try {
				stmt = conn.createStatement();
				stmt.execute(spl);
				} catch (SQLException e) {
				e.printStackTrace();
				}finally {
				try {
					stmt.close();
					} catch (SQLException e2) {
						e2.printStackTrace();
						}
				}
		
		
		
		
		
		
	}//main

}//class
