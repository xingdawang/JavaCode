package test;

class X implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread());
		Thread.yield();// It Causes the currently executing thread to
						// temporarily pause and allow other threads to execute.
		System.out.println(Thread.currentThread());
	}
}

public class Yield {
	public static void main(String[] args) {
		X obj = new X();
		Thread t1 = new Thread(obj,"1st");
		t1.start();
		X obj1 = new X();
		Thread t2 = new Thread(obj,"2st");
		t2.start();
	}
}
