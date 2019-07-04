package chapter03.section01.therad_3_1_14.project_1_wait_notify_insert_test;

public class DBTools {

	volatile private boolean prevIsA = false;//一个开关实现交替线程运行

	synchronized public void backupA() {
		try {
			while (prevIsA == true) {
				wait();
			}
			for (int i = 0; i < 5; i++) {
				System.out.println("★★★★★");
			}
			prevIsA = true;
			notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public void backupB() {
		try {
			while (prevIsA == false) {
				wait();
			}
			for (int i = 0; i < 5; i++) {
				System.out.println("☆☆☆☆☆");
			}
			prevIsA = false;
			notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
