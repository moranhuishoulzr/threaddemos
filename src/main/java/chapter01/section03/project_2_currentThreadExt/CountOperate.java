package chapter01.section03.project_2_currentThreadExt;

/**
 * Thread.currentThread().getName()=A
 * this.getName()=Thread-0
 * 造成这样的结果的原因是：currentThread()方法返回的是对当前正在执行的线程对象的引用，this代表的是当前调用它所在函数所属的对象的引用。
 * 所以想获取当前运行线程的名称尽量使用Thread.currentThread().getName()。
 *
 */

public class CountOperate extends Thread {

    public CountOperate() {
        System.out.println("CountOperate---begin");
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        System.out.println("this.getName()=" + this.getName());
        System.out.println("CountOperate---end");
    }

    @Override
    public void run() {
        System.out.println("run---begin");
        System.out.println("Thread.currentThread().getName()="
                + Thread.currentThread().getName());
        System.out.println("this.getName()=" + this.getName());
        System.out.println("run---end");
    }

}
