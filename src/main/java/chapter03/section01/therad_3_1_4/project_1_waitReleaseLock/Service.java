package chapter03.section01.therad_3_1_4.project_1_waitReleaseLock;

public class Service {

	public void testMethod(Object lock) {
		try {
			synchronized (lock) {
				System.out.println("begin wait()");
				lock.wait();//wait()之后立马释放锁，别的线程可以自由进入，都进入等待状态
				//Thread.sleep(1000);//sleep（）方法不释放锁，别的线程也进不来
				System.out.println("  end wait()");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
