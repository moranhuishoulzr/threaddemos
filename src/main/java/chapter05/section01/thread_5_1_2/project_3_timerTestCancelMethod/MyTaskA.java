package chapter05.section01.thread_5_1_2.project_3_timerTestCancelMethod;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskA extends TimerTask {
	@Override
	public void run() {
		System.out.println("A run timer =" + new Date());
		this.cancel();//����������Ӷ��������
		System.out.println("A �΄��Լ��Ƴ��Լ�");
	}
}
