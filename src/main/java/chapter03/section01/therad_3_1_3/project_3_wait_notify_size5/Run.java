package chapter03.section01.therad_3_1_3.project_3_wait_notify_size5;
//notify()唤醒的时候，不是立刻唤醒等待的线程，是当前的线程执行完再把锁让给等待中的线程。
public class Run {

	public static void main(String[] args) {

		try {
			Object lock = new Object();

			ThreadA a = new ThreadA(lock);
			a.start();

			Thread.sleep(50);

			ThreadB b = new ThreadB(lock);
			b.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
