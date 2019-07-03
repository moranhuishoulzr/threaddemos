package chapter01.section04.project_2_isaliveOtherTest;

/**
 * 这么理解：
 * 谁调用了start函数，谁才把自己交给线程调度器，谁才是活着的线程，否则，管你继承啥，还是实现啥，都是一个普通的对象
 * 实现了Runable接口的对象具有运行线程的资格，但是，只要它不被start，它就是一个普通的对象，有资格，并不代表它就是线程，
 * 线程是活着的东西，对象是死的。
 * 对象永远死死的，线程才有死活。那为何还要判断this.isAlive()呢？？？？？？？？？？？？？？？？？？？
 *
 */
public class CountOperate extends Thread {

    public CountOperate() {
        System.out.println("CountOperate---begin");

        System.out.println("Thread.currentThread().getName()="
                + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()="
                + Thread.currentThread().isAlive());

        System.out.println("this.getName()=" + this.getName());
        System.out.println("this.isAlive()=" + this.isAlive());

        System.out.println("CountOperate---end");
    }

    @Override
    public void run() {
        System.out.println("run---begin");

        System.out.println("Thread.currentThread().getName()="
                + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()="
                + Thread.currentThread().isAlive());

        System.out.println("this.getName()=" + this.getName());
        System.out.println("this.isAlive()=" + this.isAlive());

        System.out.println("run---end");
    }

}

