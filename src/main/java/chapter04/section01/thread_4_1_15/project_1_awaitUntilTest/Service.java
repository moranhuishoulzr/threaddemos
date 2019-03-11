package chapter04.section01.thread_4_1_15.project_1_awaitUntilTest;

import java.util.Calendar;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * condition.awaitUntil(Date deadline)在等待时间之内可以被其它线程唤醒，等待时间一过该线程会自动唤醒，和别的线程争抢锁资源
 */
public class Service {

	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public void waitMethod() {
		try {
			Calendar calendarRef = Calendar.getInstance();
			calendarRef.add(Calendar.SECOND, 10);
			lock.lock();
			System.out
					.println("wait begin timer=" + System.currentTimeMillis());
			condition.awaitUntil(calendarRef.getTime());//等待过程中会释放锁
			System.out
					.println("wait   end timer=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}

	}

	public void notifyMethod() {
		try {
			Calendar calendarRef = Calendar.getInstance();
			calendarRef.add(Calendar.SECOND, 10);
			lock.lock();
			System.out
					.println("notify begin timer=" + System.currentTimeMillis());
			condition.signalAll();
			System.out
					.println("notify   end timer=" + System.currentTimeMillis());
		} finally {
			lock.unlock();
		}

	}
}
