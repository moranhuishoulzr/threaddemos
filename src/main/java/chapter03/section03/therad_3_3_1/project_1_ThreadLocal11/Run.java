package chapter03.section03.therad_3_3_1.project_1_ThreadLocal11;

/**
 * ThreadLocal������Ǳ����ڲ�ͬ�̼߳�ĸ����ԣ�Ҳ���ǲ�ͬ�߳�ӵ���Լ���ֵ����ͬ�߳��е�ֵ�ǿ��Է���ThreadLocal����ġ�
 */
public class Run {
	public static ThreadLocal tl = new ThreadLocal();

	public static void main(String[] args) {
		if (tl.get() == null) {
			System.out.println("��δ�Ź�ֵ");
			tl.set("�ҵ�ֵ");
			tl.set("...");//ֻ�ܷ�һ��ֵ�𣿺����Ļ��֮ǰ�ĸ���
		}
		System.out.println(tl.get());
		System.out.println(tl.get());
	}

}
