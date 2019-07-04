package chapter03.section02.therad_3_2_6.project_1_joinMoreTest;
//join()会抢占锁也会释放锁，会重新抢占锁。
//join方法的内部调用的是wait(),必须等待线程的唤醒。wait是释放锁的。
//join是wait实现的，被其它线程唤醒后，会抢锁，而且是优先抢到锁
public class Run1 {
	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			ThreadA a = new ThreadA(b);
			a.start();
			b.start();
			b.join();
			b.join(2000);//运行的时候这个语句先抢到锁，然后将B锁释放；A抢到锁，执行完成后：b.join和ThreadB争抢锁，发现时间已过，释放锁后打印main end .
			System.out.println("                    main end "
					+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
