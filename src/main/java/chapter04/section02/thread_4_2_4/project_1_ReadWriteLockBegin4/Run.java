package chapter04.section02.thread_4_2_4.project_1_ReadWriteLockBegin4;

/**
 * 总结：只要有写就是互斥的
 */
public class Run {

	public static void main(String[] args) throws InterruptedException {

		Service service = new Service();
		//先写再读也是互斥的
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();

		Thread.sleep(1000);

		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();

	}

}