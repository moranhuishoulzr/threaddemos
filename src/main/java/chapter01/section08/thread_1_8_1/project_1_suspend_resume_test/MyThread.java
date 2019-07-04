package chapter01.section08.thread_1_8_1.project_1_suspend_resume_test;

/**
 * suspend()和resume()线程用来暂停好恢复线程
 *
 */
public class MyThread extends Thread {

	private long i = 0;

	public long getI() {
		return i;
	}

	public void setI(long i) {
		this.i = i;
	}

	@Override
	public void run() {
		while (true) {
			i++;
		}
	}

}
