package chapter04.section01.thread_4_1_10.project_1_lockMethodTest1.test2;

import java.util.concurrent.locks.ReentrantLock;

public class Service {

	public ReentrantLock lock = new ReentrantLock();//默认非公平锁

	public void serviceMethod1() {
		try {
			lock.lock();
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ "进入方法！");
			Thread.sleep(Integer.MAX_VALUE);//睡眠不释放锁，其他线程等待此锁
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

}
