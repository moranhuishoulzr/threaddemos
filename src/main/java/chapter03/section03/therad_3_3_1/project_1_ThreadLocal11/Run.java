package chapter03.section03.therad_3_3_1.project_1_ThreadLocal11;

/**
 * ThreadLocal解决的是变量在不同线程间的隔离性，也就是不同线程拥有自己的值，不同线程中的值是可以放入ThreadLocal保存的。
 */
public class Run {
	public static ThreadLocal tl = new ThreadLocal();

	public static void main(String[] args) {
		if (tl.get() == null) {
			System.out.println("从未放过值");
			tl.set("我的值");
			tl.set("...");//只能放一个值吗？后来的会把之前的覆盖
		}
		System.out.println(tl.get());
		System.out.println(tl.get());
	}

}
