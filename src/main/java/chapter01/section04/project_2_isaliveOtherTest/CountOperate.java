package chapter01.section04.project_2_isaliveOtherTest;

/**
 * 如果将Thread对象以构造参数的方式传递给Thread对象进行start()启动时：
 * Thread.currentThread().getName()=A也就是Thread t1 = new Thread(c);t1.setName("A");设置的
 *this.getName()=Thread-0
 */
public class CountOperate extends Thread {

	public CountOperate() {
		//System.out.println("CountOperate---begin");

		System.out.println("Thread.currentThread().getName()="
				+ Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive()="
				+ Thread.currentThread().isAlive());

		System.out.println("this.getName()=" + this.getName());
		System.out.println("this.isAlive()=" + this.isAlive());

		//System.out.println("CountOperate---end");
	}

	@Override
	public void run() {
		//System.out.println("run---begin");

		System.out.println("Thread.currentThread().getName()="
				+ Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive()="
				+ Thread.currentThread().isAlive());

		System.out.println("this.getName()=" + this.getName());
		System.out.println("this.isAlive()=" + this.isAlive());

		//System.out.println("run---end");
	}

}

