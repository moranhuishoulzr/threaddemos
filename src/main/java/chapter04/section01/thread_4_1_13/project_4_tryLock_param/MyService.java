package chapter04.section01.thread_4_1_13.project_4_tryLock_param;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	public ReentrantLock lock = new ReentrantLock();

	public void waitMethod() {
		try {
			if (lock.tryLock(11, TimeUnit.SECONDS)) {//如果锁在给定等待时间内没有被另一个线程保持，且当前线程未被中断，则获取该锁定
				System.out.println("      " + Thread.currentThread().getName()
						+ "获得锁的时间：" + System.currentTimeMillis());
				Thread.sleep(10000);
			} else {
				System.out.println("      " + Thread.currentThread().getName()
						+ "没有获得锁");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			if (lock.isHeldByCurrentThread()) {
				lock.unlock();
			}
		}
	}
}

