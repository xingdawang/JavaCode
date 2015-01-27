package Algorithm;

public class DeadLock {
	
	//resource
	private static Object Lock1 = new Object();
	private static Object Lock2 = new Object();
	
	public static void main(String[] args) throws InterruptedException {
		ThreadDemo1 threadDemo1 = new ThreadDemo1();
		ThreadDemo2 threadDemo2 = new ThreadDemo2();
		threadDemo1.start();
//		Solution 1
//		threadDemo1.join();
//		threadDemo1 = null;
//		Solution 2
//		Change the Order of threadDemo2 synchronized bar as Lock1, Lock2 as threadDemo1
		threadDemo2.start();
	}
	
	private static class ThreadDemo1 extends Thread {
		public void run() {
			synchronized (Lock1) {
				System.out.println("Thread1: Holding Lock1");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				System.out.println("Thread1: Waiting for Lock2");
				synchronized (Lock2) {
					System.out.println("Thread1: Holding Lock1 & 2");
				}
			}
		}
	}
	
	private static class ThreadDemo2 extends Thread {
		public void run() {
			synchronized (Lock2) {
				System.out.println("Thread2: Holding Lock2");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				System.out.println("Thread2: Waiting for Lock1");
				synchronized (Lock1) {
					System.out.println("Thread2: Holding Lock 2 & 1");
				}
			}
		}
	}
}
