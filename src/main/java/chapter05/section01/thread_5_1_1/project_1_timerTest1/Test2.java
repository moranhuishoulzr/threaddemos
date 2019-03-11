package chapter05.section01.thread_5_1_1.project_1_timerTest1;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test2 {
	
	public static void main(String[] args) {
		System.out.println("当前时间为："+new Date());
		Calendar calendarRef = Calendar.getInstance();
		calendarRef.add(Calendar.SECOND, 10);
		Date runDate = calendarRef.getTime();
		
		MyTask task = new MyTask();
		//守护线程
		Timer timer = new Timer(true);//主线程执行完毕，守护线程消失，故不执行计划
		timer.schedule(task, runDate);
		
	}

	
}
