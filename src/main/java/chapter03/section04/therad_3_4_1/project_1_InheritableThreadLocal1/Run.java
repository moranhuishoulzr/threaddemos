package chapter03.section04.therad_3_4_1.project_1_InheritableThreadLocal1;

/**
 * main���߳���A�ĸ��̣߳�InheritableThreadLocal������ȡ���߳��е�ֵ
 * ThreadLocal���̺߳����̸߳��и���ֵ
 * InheritableThreadLocal�����̻߳�ȡ���̵߳�ֵ
 */
public class Run {

	public static void main(String[] args) {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("       ��Main�߳���ȡֵ=" + Tools.tl.get());
				Thread.sleep(100);
			}
			Thread.sleep(5000);
			ThreadA a = new ThreadA();
			a.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
