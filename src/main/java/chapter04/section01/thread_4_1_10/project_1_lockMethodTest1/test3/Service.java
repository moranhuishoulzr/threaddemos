package chapter04.section01.thread_4_1_10.project_1_lockMethodTest1.test3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {

	private ReentrantLock lock = new ReentrantLock();
	private Condition newCondition = lock.newCondition();
//lock在一个方法内是同步互斥           在两个方法在不构成同步互斥
	public void waitMethod() {
		try {
			lock.lock();
			newCondition.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void notityMethod() {
		try {
			lock.lock();
			System.out.println("有" + lock.getWaitQueueLength(newCondition)//也就是多少个线程进入等待池，等待被唤醒
					+ "个线程正在等待newCondition");//返回等待此锁定给定相关的给定条件Condition的线程估计数。
			newCondition.signal();
		} finally {
			lock.unlock();
		}
	}

}
