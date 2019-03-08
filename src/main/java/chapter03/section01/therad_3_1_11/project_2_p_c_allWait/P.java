package chapter03.section01.therad_3_1_11.project_2_p_c_allWait;

/**
 * 比方说有生产者A和生产者B，缓冲区由于空了，消费者处于WAITING。生产者B处于WAITING，生产者A被消费者通知生产，生产者A生产出来的产品本应该通知消费者，结果通知了生产者B，生产者B被唤醒，发现缓冲区满了，于是继续WAITING。至此，两个生产者线程处于WAITING，消费者处于WAITING，系统假死
 * 唤醒的应该是异类，有时候唤醒的却是同类，导致都在wating。。
 */
public class P {

	private String lock;

	public P(String lock) {
		super();
		this.lock = lock;
	}

	public void setValue() {
		try {
			synchronized (lock) {
				while (!ValueObject.value.equals("")) {
					System.out.println("生产者 "
							+ Thread.currentThread().getName() + " WAITING了★");
					lock.wait();
				}
				System.out.println("生产者 " + Thread.currentThread().getName()
						+ " RUNNABLE了");
				String value = System.currentTimeMillis() + "_"
						+ System.nanoTime();
				ValueObject.value = value;
				lock.notify();
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
