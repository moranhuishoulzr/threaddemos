package chapter02.section01.thread_2_1_8.project_1_synNotExtends;

/**
 * 同步不具有继承性，必须加关键字synchronized
 */
public class Sub extends Main {
	 @Override
	public synchronized void serviceMethod() {
		try {
			System.out.println("int sub 下一步 sleep begin threadName="
					+ Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("int sub 下一步 sleep   end threadName="
					+ Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());
			super.serviceMethod();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
