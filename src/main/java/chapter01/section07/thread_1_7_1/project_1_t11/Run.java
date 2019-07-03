package chapter01.section07.thread_1_7_1.project_1_t11;

/**
 * 调用interrupt()方法仅仅是在当前线程中打了一个停止的标记，并不是真的停止线程
 * stop()是强制停止线程，不安全，JDK不建议使用
 */
public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
	}
}
