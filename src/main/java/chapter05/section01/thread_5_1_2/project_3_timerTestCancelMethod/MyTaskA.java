package chapter05.section01.thread_5_1_2.project_3_timerTestCancelMethod;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskA extends TimerTask {
	@Override
	public void run() {
		System.out.println("A run timer =" + new Date());
		this.cancel();//把自身任务从队列中清除
		System.out.println("A 任務自己移除自己");
	}
}
