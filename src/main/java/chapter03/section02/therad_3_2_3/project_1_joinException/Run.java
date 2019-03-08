package chapter03.section02.therad_3_2_3.project_1_joinException;

/**
 * 即使A线程的宿主线程B被中断，A也会继续执行
 */
public class Run {

	public static void main(String[] args) {

		try {
			ThreadB b = new ThreadB();
			b.start();

			Thread.sleep(500);

			ThreadC c = new ThreadC(b);
			c.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
