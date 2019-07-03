package chapter01.section07.thread_1_7_2.project_1_t12;

/**
 * interrupted()查看源代码得知：是判断当前线程是否中断，并清除中断状态。没有中断main线程所有都是false。
 */
public class Run {
	
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt();
			//Thread.currentThread().interrupt();
			System.out.println("是否停止1？="+thread.interrupted());//false
			System.out.println("是否停止2？="+thread.interrupted());//false
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}

}
