package chapter03.section02.therad_3_2_6.project_1_joinMoreTest;
//join()����ռ��Ҳ���ͷ�������������ռ����
//join�������ڲ����õ���wait(),����ȴ��̵߳Ļ��ѡ�wait���ͷ����ġ�
//join��waitʵ�ֵģ��������̻߳��Ѻ󣬻�����������������������
public class Run1 {
	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			ThreadA a = new ThreadA(b);
			a.start();
			b.start();
			b.join();
			b.join(2000);//���е�ʱ������������������Ȼ��B���ͷţ�A��������ִ����ɺ�b.join��ThreadB������������ʱ���ѹ����ͷ������ӡmain end .
			System.out.println("                    main end "
					+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
