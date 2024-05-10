package javabasic.oop;

public class Account {
	
	private String name;
	private int money;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public Account(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	
	@Override
	public String toString() {
		return name+ "님의 계좌 잔액"+ this.money;
	}
	
//	public synchronized void deposite(int money) {
//		money += money;
//	}
//	
//	
//	public synchronized void withdraw(int money) {
//		money -= money;
//	}
	
	public void deposite(int money) {
		synchronized(this) {
			money += money;			
		}
	}
	
	public void withdraw(int money) {
		synchronized(this) {
			money -= money;			
		}
	}
	
	
	
	
}
