package chapter03.section01.therad_3_1_11.project_2_p_c_allWait;

/**
 * �ȷ�˵��������A��������B�����������ڿ��ˣ������ߴ���WAITING��������B����WAITING��������A��������֪ͨ������������A���������Ĳ�Ʒ��Ӧ��֪ͨ�����ߣ����֪ͨ��������B��������B�����ѣ����ֻ��������ˣ����Ǽ���WAITING�����ˣ������������̴߳���WAITING�������ߴ���WAITING��ϵͳ����
 * ���ѵ�Ӧ�������࣬��ʱ���ѵ�ȴ��ͬ�࣬���¶���wating����
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
					System.out.println("������ "
							+ Thread.currentThread().getName() + " WAITING�ˡ�");
					lock.wait();
				}
				System.out.println("������ " + Thread.currentThread().getName()
						+ " RUNNABLE��");
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
