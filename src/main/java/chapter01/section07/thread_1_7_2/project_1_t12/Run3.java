package chapter01.section07.thread_1_7_2.project_1_t12;

/**
 * 正常情况都是true,为何打印出来都是false呢。书上也写着都是true呢。
 */
public class Run3 {
	
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt();
			System.out.println("是否停止1？="+thread.isInterrupted());
			System.out.println("是否停止2？="+thread.isInterrupted());
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}
}
