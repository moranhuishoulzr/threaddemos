package chapter02.section02.thread_2_2_16.project_1_setNewStringTwoLock;

/**
 * 虽然已经把锁变成“456”，但是B线程挣的还是“123”
 */
public class Run2 {

	public static void main(String[] args) throws InterruptedException {

		MyService service = new MyService();

		ThreadA a = new ThreadA(service);
		a.setName("A");

		ThreadB b = new ThreadB(service);
		b.setName("B");

		a.start();
		b.start();
	}
}
