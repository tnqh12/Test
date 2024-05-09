package javabasic;

public class ContException extends Exception{
	@Override
	public String getMessage() {
		return "보험자 가입자와 전화 상담";
	}
}
