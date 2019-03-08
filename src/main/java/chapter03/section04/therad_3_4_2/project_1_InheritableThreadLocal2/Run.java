package chapter03.section04.therad_3_4_2.project_1_InheritableThreadLocal2;

/**
 * 子线程在获取值得时候，main线程如果更改，则子线程获取的仍旧是旧值
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
