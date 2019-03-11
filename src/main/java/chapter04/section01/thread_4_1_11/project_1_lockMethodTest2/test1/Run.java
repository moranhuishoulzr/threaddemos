package chapter04.section01.thread_4_1_11.project_1_lockMethodTest2.test1;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		final Service service = new Service();

		Runnable runnable = new Runnable() {
			public void run() {
				service.waitMethod();
			}
		};

		Thread threadB = new Thread(runnable);
		threadB.start();
		Thread.sleep(500);
		Thread threadA = new Thread(runnable);
		threadA.start();





		Thread.sleep(500);
		System.out.println(service.lock.hasQueuedThread(threadA));//特定线程是否等待此锁
		System.out.println(service.lock.hasQueuedThread(threadB));
		System.out.println(service.lock.hasQueuedThreads());//是否有线程等待此锁
	}
}
