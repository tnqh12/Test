package javabasic.oop;


//입금 쓰레드
public class DepositThread extends Thread {
	
	Account account;
	int amount;
	
	DepositThread(Account account, int amount) {
		this.account = account;
		this.amount = amount; 
	}
	
	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			this.account.deposite(this.amount);
			System.out.println(this.amount+"원 입금 되었습니다");
			System.out.println(account);
			try {
				Thread.sleep(2000);
			}catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		
	}
	
}
