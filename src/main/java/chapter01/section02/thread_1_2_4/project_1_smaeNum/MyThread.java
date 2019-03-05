package chapter01.section02.thread_1_2_4.project_1_smaeNum;

import java.beans.IntrospectionException;

public class MyThread extends Thread {

	private int i = 5;

	@Override
	public void run() {
		/*try {
			Thread.sleep(1000);
		}catch (InterruptedException e){
			e.printStackTrace();
		}*/

		System.out.println("i=" + (i--) + " threadName="
				+ Thread.currentThread().getName());
	}

}
