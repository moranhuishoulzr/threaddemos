package chapter07.section01.thread_7_1_2.project_1_stateTest2;

public class Run {
	// NEW,
	// RUNNABLE,
	// TERMINATED,

	// BLOCKED,
	// WAITING,
	// TIMED_WAITING,

	public static void main(String[] args) {
		try {
			MyThread t = new MyThread();
			t.start();
			Thread.sleep(1000);
			System.out.println("main�����е�״̬��" + t.getState());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
