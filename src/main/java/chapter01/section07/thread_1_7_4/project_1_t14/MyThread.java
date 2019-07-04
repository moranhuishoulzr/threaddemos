package chapter01.section07.thread_1_7_4.project_1_t14;
//sleep()睡眠中被中断会触发异常，并清除中断状态值
public class MyThread extends Thread {
	@Override
	public void run() {
		super.run();
		try {
			System.out.println("run begin");
			Thread.sleep(200000);
			System.out.println("run end");
		} catch (InterruptedException e) {
			System.out.println("在沉睡中被停止!进入catch!"+this.isInterrupted());
			e.printStackTrace();
		}
	}
}

