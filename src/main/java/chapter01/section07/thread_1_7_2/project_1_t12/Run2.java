package chapter01.section07.thread_1_7_2.project_1_t12;

/**
 * interrupted():测试当前线程是否中断。线程的中断状态由该线程清除，就是说连续两次调用该方法则第二次调用将返回false
 */
public class Run2 {
	
	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		System.out.println("是否停止1？=" + Thread.interrupted());//true
		System.out.println("是否停止2？=" + Thread.interrupted());//false
		System.out.println("end!");
	}

}
