package chapter05.section01.thread_5_1_2.project_2_timerTest2_periodLater;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;


public class Test1 {
	
	public static void main(String[] args) {
		System.out.println("��ǰʱ��Ϊ��" + new Date());
		Calendar calendarRef = Calendar.getInstance();
		calendarRef.add(Calendar.SECOND, 10);
		Date runDate = calendarRef.getTime();
		System.out.println("�ƻ�ʱ��Ϊ��" + runDate);
		MyTaskA task = new MyTaskA();
		Timer timer = new Timer();
		timer.schedule(task, runDate, 3000);
	}
	
}
