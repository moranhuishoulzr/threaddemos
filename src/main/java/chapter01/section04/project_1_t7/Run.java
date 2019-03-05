package chapter01.section04.project_1_t7;

public class Run {
	
	public static void main(String[] args) throws InterruptedException{
		MyThread mythread = new MyThread();
		System.out.println("begin ==" + mythread.isAlive());
		mythread.start();
		//Thread.sleep(1000);
		System.out.println("end ==" + mythread.isAlive());//这个值是不确定的，根据线程执行完毕与否
	}
	
}

