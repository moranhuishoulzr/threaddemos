package chapter04.section01.thread_4_1_5.project_1_MustUseMoreCondition_Error;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
//lock控制的不是同一把锁吗？为什么两个方法可以同时进入？？？？？？？？？？？？？
public class MyService {

	private Lock lock = new ReentrantLock();
	public Condition condition = lock.newCondition();

	public void awaitA() {
		try {
			lock.lock();
			System.out.println("begin awaitA时间为" + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
			condition.await();
			System.out.println("  end awaitA时间为" + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void awaitB() {
		try {
			lock.lock();
			System.out.println("begin awaitB时间为" + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
			condition.await();
			System.out.println("  end awaitB时间为" + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void signalAll() {
		try {
			lock.lock();
			System.out.println("  signalAll时间为" + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
			condition.signalAll();
		} finally {
			lock.unlock();
		}
	}
}

