package chapter03.section02.therad_3_2_6.project_1_joinMoreTest;

/**
 * 对join的理解：
 * 内部调用的wait方法，wait会释放锁；
 * 当多个线程争抢锁的时候，join（）会首选拿到锁，然后释放:内部代码阻塞在wait代码那里，等待唤醒。其他的线程执行完毕会唤醒这个wait().
 * 当线程运行结束会触发notify()，唤醒wait()中等待池中的线程。
 *
 * 水调用join谁就进入等待池，可以这么理解。
 *
 * t.join()方法只会使主线程进入等待池并等待t线程执行完毕后才会被唤醒。并不影响同一时刻处在运行状态的其他线程。
 *
 *
 */
public class Run1 {
	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			ThreadA a = new ThreadA(b);
			a.start();
			b.start();
			b.join(2000);//运行的时候这个语句先抢到锁，然后将B锁释放；A抢到锁，执行完成后：b.join和ThreadB争抢锁，发现时间已过，释放锁后打印main end .
			//对于争抢的同一个锁，如果别的线程执行完了，会唤醒b.join()中的代码wait(time)以下的代码执行
			System.out.println("                    main end "
					+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

