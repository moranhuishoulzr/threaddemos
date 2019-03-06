package chapter01.section08.thread_1_8_3.project_1_suspend_resume_nosameValue;

/**
 * 废除suspend和resume()方法的原因是会造成数据的不一致
 */
public class Run {
	public static void main(String[] args) throws InterruptedException {

		final MyObject myobject = new MyObject();

		Thread thread1 = new Thread() {
			public void run() {
				myobject.setValue("a", "aa");
			};
		};
		thread1.setName("a");
		thread1.start();

		Thread.sleep(500);

		Thread thread2 = new Thread() {
			public void run() {
				myobject.printUsernamePassword();
			};
		};
		thread2.start();

	}

}
