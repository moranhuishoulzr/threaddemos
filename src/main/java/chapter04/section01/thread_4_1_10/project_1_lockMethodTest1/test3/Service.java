package chapter04.section01.thread_4_1_10.project_1_lockMethodTest1.test3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {

	private ReentrantLock lock = new ReentrantLock();
	private Condition newCondition = lock.newCondition();
//lock��һ����������ͬ������           �����������ڲ�����ͬ������
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
			System.out.println("��" + lock.getWaitQueueLength(newCondition)//Ҳ���Ƕ��ٸ��߳̽���ȴ��أ��ȴ�������
					+ "���߳����ڵȴ�newCondition");//���صȴ�������������صĸ�������Condition���̹߳�������
			newCondition.signal();
		} finally {
			lock.unlock();
		}
	}

}
