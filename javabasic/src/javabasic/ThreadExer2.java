package javabasic;

public class ThreadExer2 {
	public static void main(String[] args) {
	
		Thread ht = new HelloThread();
		Thread gt = new GoodbyeThread();
		
		
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread());
		System.out.println(ht.getId());
		ht.setName("Hello Thread");
		System.out.println(ht.getName());
		gt.setName("Goodbye Thread");
		System.out.println(gt.getName());
		ht.setPriority(10);
		gt.setPriority(1);
		System.out.println(ht.getPriority());
		System.out.println(ht.getState());
	}
}
