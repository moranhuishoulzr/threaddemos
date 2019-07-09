package chapter05.section01.thread_5_1_1.project_3_taskLater;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
/**
 * TimerTask���Զ��еķ�ʽһ��һ����˳��ִ�У�����ִ�е�ʱ���п��ܺ�Ԥ�ڵ�ʱ�䲻һ�£���Ϊǰ��������п������ĵ�ʱ�����������������ӳ�
 */

public class Test {
	public static void main(String[] args) {
		System.out.println("��ǰʱ��Ϊ��" + new Date());
		Calendar calendarRef1 = Calendar.getInstance();
		Date runDate1 = calendarRef1.getTime();
		System.out.println("A�ƻ�ʱ��Ϊ��" + runDate1);
		
		Calendar calendarRef2 = Calendar.getInstance();
		calendarRef2.add(Calendar.SECOND, 10);
		Date runDate2 = calendarRef2.getTime();
		System.out.println("B�ƻ�ʱ��Ϊ��" + runDate2);
		
		MyTaskA task1 = new MyTaskA();
		MyTaskB task2 = new MyTaskB();
		
		Timer timer = new Timer();
		timer.schedule(task1, runDate1);
		timer.schedule(task2, runDate2);
		
	}
}
