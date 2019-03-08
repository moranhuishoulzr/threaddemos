package chapter03.section01.therad_3_1_10.project_1_waitOld;
//换成if就会出现错误，因为if得到锁后，第二个线程执行sub操作就会list溢出。
public class Subtract {
	
	private String lock;

	public Subtract(String lock) {
		super();
		this.lock = lock;
	}

	public void subtract() {
		try {
			synchronized (lock) {
				while (ValueObject.list.size() == 0) {
					System.out.println("wait begin ThreadName="
							+ Thread.currentThread().getName());
					lock.wait();
					System.out.println("wait   end ThreadName="
							+ Thread.currentThread().getName());
				}
				ValueObject.list.remove(0);
				System.out.println("list size=" + ValueObject.list.size());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}
