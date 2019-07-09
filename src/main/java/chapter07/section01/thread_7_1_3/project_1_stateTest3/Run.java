package chapter07.section01.thread_7_1_3.project_1_stateTest3;

public class Run {
	// NEW,
	// RUNNABLE,
	// TERMINATED,
	// BLOCKED,等待锁的状态
	// WAITING,wait()时的状态
	// TIMED_WAITING,睡觉时的状态

	public static void main(String[] args) throws InterruptedException {
		MyThread1 t1 = new MyThread1();
		t1.setName("a");
		t1.start();
		Thread.sleep(2000);
		MyThread2 t2 = new MyThread2();
		t2.setName("b");
		t2.start();
		Thread.sleep(1000);
		System.out.println("main方法中的t2状态：" + t2.getState());

	}
}
