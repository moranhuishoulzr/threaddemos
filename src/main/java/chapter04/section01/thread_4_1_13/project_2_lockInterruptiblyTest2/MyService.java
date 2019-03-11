package chapter04.section01.thread_4_1_13.project_2_lockInterruptiblyTest2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	public ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public void waitMethod() {
		try {
			lock.lockInterruptibly();//当前线程未被中断则获得锁定，否则抛出异常
			System.out.println("lock " + Thread.currentThread().getName());
			for (int i = 0; i < Integer.MAX_VALUE / 10; i++) {
				String newString = new String();
				Math.random();
			}
		} catch (InterruptedException e) {
			System.out.println("线程"+Thread.currentThread().getName()+"进入catch~!");
			e.printStackTrace();
		} finally {
			if (lock.isHeldByCurrentThread()) {
				lock.unlock();
			}
		}
	}
}
