package chapter03.section02.therad_3_2_6.project_1_joinMoreTest;

/**
 * ��join����⣺
 * �ڲ����õ�wait������wait���ͷ�����
 * ������߳���������ʱ��join��������ѡ�õ�����Ȼ���ͷ�:�ڲ�����������wait��������ȴ����ѡ��������߳�ִ����ϻỽ�����wait().
 * ���߳����н����ᴥ��notify()������wait()�еȴ����е��̡߳�
 *
 * ˮ����join˭�ͽ���ȴ��أ�������ô��⡣
 *
 * t.join()����ֻ��ʹ���߳̽���ȴ��ز��ȴ�t�߳�ִ����Ϻ�Żᱻ���ѡ�����Ӱ��ͬһʱ�̴�������״̬�������̡߳�
 *
 *
 */
public class Run1 {
	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			ThreadA a = new ThreadA(b);
			a.start();
			b.start();
			b.join(2000);//���е�ʱ������������������Ȼ��B���ͷţ�A��������ִ����ɺ�b.join��ThreadB������������ʱ���ѹ����ͷ������ӡmain end .
			//����������ͬһ�������������߳�ִ�����ˣ��ỽ��b.join()�еĴ���wait(time)���µĴ���ִ��
			System.out.println("                    main end "
					+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

