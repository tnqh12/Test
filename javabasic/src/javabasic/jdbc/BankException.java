package javabasic.jdbc;

public class BankException extends Exception{
	
	@Override
	public String getMessage() {
		return "잔액이 부족해서 출금 불가";
	}

}
