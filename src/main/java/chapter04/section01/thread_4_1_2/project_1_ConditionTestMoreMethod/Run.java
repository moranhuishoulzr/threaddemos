package chapter04.section01.thread_4_1_2.project_1_ConditionTestMoreMethod;
//保证互斥的同时，线程的执行还是顺序的
public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();

		ThreadAA aa = new ThreadAA(service);
		aa.setName("AA");
		aa.start();

		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();


		Thread.sleep(100);

		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
		
		ThreadBB bb = new ThreadBB(service);
		bb.setName("BB");
		bb.start();

	}

}
