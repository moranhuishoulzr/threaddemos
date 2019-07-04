package chapter03.section01.therad_3_1_11.project_5_stack_2_new;

import java.util.ArrayList;
import java.util.List;
//一生产，多消费   notify会造成假死
public class MyStack {
	private List list = new ArrayList();

	synchronized public void push() {
		try {
			while (list.size() == 1) {
				this.wait();
			}
			list.add("anyString=" + Math.random());
			this.notify();//只能唤起一个线程，造成假死
			System.out.println("push=" + list.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public String pop() {
		String returnValue = "";
		try {
			while (list.size() == 0) {
				System.out.println("pop操作中的："
						+ Thread.currentThread().getName() + " 线程呈wait状态");
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
