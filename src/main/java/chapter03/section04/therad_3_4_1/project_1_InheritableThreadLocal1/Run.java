package chapter03.section04.therad_3_4_1.project_1_InheritableThreadLocal1;

/**
 * main主线程是A的父线程；InheritableThreadLocal用来获取父线程中的值
 * ThreadLocal子线程和主线程各有各的值
 * InheritableThreadLocal是子线程获取父线程的值
 */
public class Run {

	public static void main(String[] args) {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("       在Main线程中取值=" + Tools.tl.get());
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
