package chapter05.section01.thread_5_1_2.project_3_timerTestCancelMethod;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("��ǰʱ��Ϊ��"+ new Date());
		Calendar calendarRef1 = Calendar.getInstance();
		Date runDate1 = calendarRef1.getTime();
		System.out.println("�ƻ�ʱ��Ϊ��" + runDate1);
		MyTaskA task1 = new MyTaskA();
		MyTaskB task2 = new MyTaskB();
		Timer timer = new  Timer();
		timer.schedule(task1, runDate1,4000);
		timer.schedule(task2, runDate1,4000);
	}

}
