package chapter05.section01.thread_5_1_3.project_1_timerTest3;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {
	
	static public class MyTask extends TimerTask {
		@Override
		public void run() {
			System.out.println("�����ˣ�ʱ��Ϊ��" + new Date());
		}
	}
	
	public static void main(String[] args) {
		MyTask task = new MyTask();
		Timer timer = new Timer();
		System.out.println("��ǰʱ��:" + new Date());
		timer.schedule(task, 7000);
		
	} 

}
