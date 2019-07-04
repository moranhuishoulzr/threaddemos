package chapter01.section07.thread_1_7_8.project_1_useReturnInterrupt;

/**
 * 还是建议抛出异常的方式来终止线程，这样还可以向上抛出异常，得以传播
 */
public class MyThread extends Thread {

	@Override
	public void run() {
			while (true) {
				if (this.isInterrupted()) {
					System.out.println("停止了!");
					return;
				}
				System.out.println("timer=" + System.currentTimeMillis());
			}
	}

}
