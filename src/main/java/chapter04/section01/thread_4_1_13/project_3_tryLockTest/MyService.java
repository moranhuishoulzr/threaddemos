package chapter04.section01.thread_4_1_13.project_3_tryLockTest;

import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	public ReentrantLock lock = new ReentrantLock();

	public void waitMethod() {
		if (lock.tryLock()) {//仅在调用时锁定未被另一个线程保持的情况下，才获取该锁定
			System.out.println(Thread.currentThread().getName() + "获得锁");
		} else {
			System.out.println(Thread.currentThread().getName() + "没有获得锁");
		}
	}
}
