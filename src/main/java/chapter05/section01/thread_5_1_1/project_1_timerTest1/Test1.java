package chapter05.section01.thread_5_1_1.project_1_timerTest1;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test1 {
	
	public static void main(String[] args) {
		System.out.println("��ǰʱ��Ϊ��"+new Date());
		Calendar calendarRef = Calendar.getInstance();
		calendarRef.add(Calendar.SECOND, 10);
		Date runDate = calendarRef.getTime();
		
		MyTask task = new MyTask();
		Timer timer = new Timer();//����һ��Timer���Ǵ���һ���µ��̣߳�����̻߳�һֱ����������ֹͣ
		timer.schedule(task, runDate);
		
	}

}
