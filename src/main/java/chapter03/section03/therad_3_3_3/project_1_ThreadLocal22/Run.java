package chapter03.section03.therad_3_3_3.project_1_ThreadLocal22;

public class Run {
	public static ThreadLocalExt tl = new ThreadLocalExt();

	public static void main(String[] args) {
		if (tl.get() == null) {
			System.out.println("��δ�Ź�ֵ");
			tl.set("�ҵ�ֵ");
		}
		System.out.println(tl.get());
		System.out.println(tl.get());
	}

}
