package chapter02.section02.thread_2_2_9.project_3_synMoreObjectStaticOneLock;

/**
 * 都是用的类锁，会互相排斥
 * 类锁方法无论使用几个对象都构成同步互斥
 */
public class Run {

	public static void main(String[] args) {

		Service service1 = new Service();
		Service service2 = new Service();

		ThreadA a = new ThreadA(service1);
		a.setName("A");
		a.start();

		ThreadB b = new ThreadB(service2);
		b.setName("B");
		b.start();

	}

}
