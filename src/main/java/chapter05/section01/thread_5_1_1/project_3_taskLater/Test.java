package chapter05.section01.thread_5_1_1.project_3_taskLater;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
/**
 * TimerTask是以队列的方式一个一个被顺序执行，所以执行的时间有可能和预期的时间不一致，因为前面的任务有可能消耗的时间更长，后面的任务被延迟
 */

public class Test {
	public static void main(String[] args) {
		System.out.println("当前时间为：" + new Date());
		Calendar calendarRef1 = Calendar.getInstance();
		Date runDate1 = calendarRef1.getTime();
		System.out.println("A计划时间为：" + runDate1);
		
		Calendar calendarRef2 = Calendar.getInstance();
		calendarRef2.add(Calendar.SECOND, 10);
		Date runDate2 = calendarRef2.getTime();
		System.out.println("B计划时间为：" + runDate2);
		
		MyTaskA task1 = new MyTaskA();
		MyTaskB task2 = new MyTaskB();
		
		Timer timer = new Timer();
		timer.schedule(task1, runDate1);
		timer.schedule(task2, runDate2);
		
	}
}
