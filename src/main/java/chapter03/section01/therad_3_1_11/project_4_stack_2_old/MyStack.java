package chapter03.section01.therad_3_1_11.project_4_stack_2_old;

import java.util.ArrayList;
import java.util.List;

/**
 * if������쳣����Ϊwait״̬�����ѣ��̶�����ִ��������룬�����Ѳ�����������while��������ִ�м��������
 */
public class MyStack {
	private List list = new ArrayList();

	synchronized public void push() {
		try {
			if (list.size() == 1) {//if����������ݣ�while����
				this.wait();//wait���ͷ����������������߳�Ҳ���Խ������������
			}
			list.add("anyString=" + Math.random());
			this.notify();
			System.out.println("push=" + list.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public String pop() {
		String returnValue = "";
		try {
			if (list.size() == 0) {
				System.out.println("pop�����еģ�"
						+ Thread.currentThread().getName() + " �̳߳�wait״̬");
				this.wait();
			}
			returnValue = "" + list.get(0);
			list.remove(0);
			this.notify();
			System.out.println("pop=" + list.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return returnValue;
	}
}
