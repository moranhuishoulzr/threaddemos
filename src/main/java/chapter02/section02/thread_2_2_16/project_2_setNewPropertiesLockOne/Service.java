package chapter02.section02.thread_2_2_16.project_2_setNewPropertiesLockOne;

public class Service {

	public void serviceMethodA(Userinfo userinfo) {
		synchronized (userinfo) {
			try {
				System.out.println(Thread.currentThread().getName());
				//下面两行代码，即使是改变对象也会同步执行，因为B线程在等待池了。
				//userinfo.setUsername("abcabcabc");
				userinfo=new Userinfo();
				Thread.sleep(3000);
				System.out.println("end! time=" + System.currentTimeMillis());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
