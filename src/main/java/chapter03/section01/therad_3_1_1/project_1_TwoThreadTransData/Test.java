package chapter03.section01.therad_3_1_1.project_1_TwoThreadTransData;
//为什么打断点才能捕捉到==5，不打断点捕捉不到,没有出现线程B的打印结果
public class Test {

	public static void main(String[] args) {
		MyList service = new MyList();

		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();

		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
	}
}
