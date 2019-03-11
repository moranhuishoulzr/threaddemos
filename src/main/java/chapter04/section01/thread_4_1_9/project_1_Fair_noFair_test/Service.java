package chapter04.section01.thread_4_1_9.project_1_Fair_noFair_test;
/**
 * 公平锁表示线程获取锁的顺序是按照线程加锁的顺序来分配的，即先来先得到锁。非公平锁是一种锁的线程抢占机制
 */

import java.util.concurrent.locks.ReentrantLock;

public class Service {

	private ReentrantLock lock;

	public Service(boolean isFair) {
		super();
		lock = new ReentrantLock(isFair);
	}

	public void serviceMethod() {
		try {
			lock.lock();
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ "获得锁定");
		} finally {
			lock.unlock();
		}
	}

}
