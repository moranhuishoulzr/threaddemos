package chapter02.section01.thread_2_1_6.project_2_synLockIn_2;

/**
 * 当存在父子继承关系时，子类是完全可以通过“可重入锁”调用父类的同步方法的
 */
public class Sub extends Main {

	synchronized public void operateISubMethod() {
		try {
			while (i > 0) {
				i--;
				System.out.println("sub print i=" + i);
				Thread.sleep(100);
				this.operateIMainMethod();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
