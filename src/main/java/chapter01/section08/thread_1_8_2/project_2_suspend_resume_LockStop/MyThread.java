package chapter01.section08.thread_1_8_2.project_2_suspend_resume_LockStop;

/**
 * 注释会打印main end
 * 去掉注释则不会打印
 * println()也是个同步方法，锁未被释放
 */
public class MyThread extends Thread {
	private long i = 0;

	@Override
	public void run() {
		while (true) {
			i++;
			//System.out.println(i);
		}
	}

}
