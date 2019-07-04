package chapter04.section01.thread_4_1_3.project_1_UseConditionWaitNotifyError;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
//可以选择通知线程，notify只是JVM随机通知线程
public class MyService {

	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public void await() {
		try {
			//和wait notify必须放在同步快中一样，await之前必须上锁，不然会造成提前唤醒等疑难场景
			condition.await();//condition.await();调用之前必须有lock.lock()
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}