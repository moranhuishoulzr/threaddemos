package chapter03.section01.therad_3_1_11.project_4_stack_2_old;

import java.util.ArrayList;
import java.util.List;

/**
 * if会出现异常，因为wait状态被唤醒，继而继续执行下面代码，但是已不满足条件；while可以重新执行检查条件。
 */
public class MyStack {
	private List list = new ArrayList();

	synchronized public void push() {
		try {
			if (list.size() == 1) {//if会造成脏数据，while不会
				this.wait();//wait会释放锁，所以其他的线程也可以进到这个方法来
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
