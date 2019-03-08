package chapter03.section02.therad_3_2_4.project_1_joinLong;

/**
 * 方法join(long)的功能在内部是调用了wait（long）方法来实现的，所有join()方法具有释放锁的特点
 */
public class Test {

	public static void main(String[] args) {
		try {
			MyThread threadTest = new MyThread();
			threadTest.start();

			 threadTest.join(2000);//只等2秒
			//Thread.sleep(2000);

			System.out.println("  end timer=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
