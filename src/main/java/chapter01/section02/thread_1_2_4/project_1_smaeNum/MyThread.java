package chapter01.section02.thread_1_2_4.project_1_smaeNum;

/**
 * 测试目的：虽然printLn()内部是同步方法，但是i--却是在进入方法之前发生的，存在线程安全问题
 */
public class MyThread extends Thread {

	private int i = 5;

	@Override
	public void run() {
		/*try {
			Thread.sleep(1000);
		}catch (InterruptedException e){
			e.printStackTrace();
		}*/

		System.out.println("i=" + (i--) + " threadName="
				+ Thread.currentThread().getName());
	}

}
