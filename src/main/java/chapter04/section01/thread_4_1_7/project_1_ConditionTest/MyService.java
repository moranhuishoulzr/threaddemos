package chapter04.section01.thread_4_1_7.project_1_ConditionTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
//���������ٶ��ᷢ��������ͻ������һ�п���Υ�����������ԵĲ�����
//��ռ����һ�ֱ�������synchronized����һ�ֶ�ռ��.synchronized����һ�ֶ�ռ����������������������ֻ����ȷ�������̲߳�����ɸ��ŵ������ִ�У�
// �ᵼ������������Ҫ�����̹߳��𣬵ȴ����������߳��ͷ�����
//���Ծ������ֹ����ĸ�����ĺ���˼·���ǣ�ÿ�β��������Ǽ���û�г�ͻ��ȥ���ĳ������������Ϊ��ͻʧ�ܾ����ԣ�ֱ���ɹ�Ϊֹ��������������У�
// ĳ���߳̿��Բ��ó�cpu,����һֱwhileѭ�������ʧ�ܾ����ԣ�ֱ���ɹ�Ϊֹ�����ԣ����������ò�����ʱ���ֹ���Ч�����á�����CAS����һ���ֹ���˼���Ӧ�á�
//�ֹ������ܽ����������⡣
public class MyService {

	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	private boolean hasValue = false;

	public void set() {
		try {
			lock.lock();
			while (hasValue == true) {
				condition.await();
			}
			System.out.println("��ӡ��");
			hasValue = true;
			condition.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void get() {
		try {
			lock.lock();
			while (hasValue == false) {
				condition.await();
			}
			System.out.println("��ӡ��");
			hasValue = false;
			condition.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

}
