package chapter03.section04.therad_3_4_2.project_1_InheritableThreadLocal2;

/**
 * ���߳��ڻ�ȡֵ��ʱ��main�߳�������ģ������̻߳�ȡ���Ծ��Ǿ�ֵ
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
