package chapter01.section07.thread_1_7_2.project_1_t12;

/**
 * thread.interrupted()查看源代码得知：是查看main线程是否被中断;由于main线程没有被中断，所以返回两个false。
 */
public class Run {
	
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt();
			//Thread.currentThread().interrupt();
			System.out.println("是否停止1？="+thread.interrupted());
			System.out.println("是否停止2？="+thread.interrupted());
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}

}
