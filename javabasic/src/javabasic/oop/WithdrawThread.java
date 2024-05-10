package javabasic.oop;

//출금 쓰레드
public class WithdrawThread extends Thread {

	Account account;
	int amount;
	
	
	WithdrawThread(Account account, int amount) {
		this.account = account;
		this.amount = amount; 
	}
	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			if(this.account.getMoney()>=amount) {
			this.account.withdraw(this.amount);
			System.out.println(amount+"원 출금 되었습니다");
			System.out.println(account);
			try {
				Thread.sleep(2000);
			}catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			}
		
		}
	}
}
