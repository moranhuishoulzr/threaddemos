package chapter01.section09.project_1_t17;
//放弃当前的CPU资源，将它让给其他的任务去占用CPU执行时间，但是放弃的时间不确定，有可能刚刚放弃又获得时间片。
public class MyThread extends Thread {

	@Override
	public void run() {
		long beginTime = System.currentTimeMillis();
		int count = 0;
		for (int i = 0; i < 50000000; i++) {
			Thread.yield();//让出CPU导致运行变慢，但是啥时候让出的是不确定的
			count = count + (i + 1);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("count:"+count);
		System.out.println("用时：" + (endTime - beginTime) + "毫秒！");
	}

}
