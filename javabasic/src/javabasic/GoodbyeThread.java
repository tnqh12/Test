package javabasic;

public class GoodbyeThread extends Thread {

	@Override
	public void run() {
		while (true) {
			System.out.println("Goodbye");
			try {
				Thread.sleep(5000);
			}catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
	
}
