package chapter02.section02.thread_2_2_16.project_1_setNewStringTwoLock;

/**
 * 虽然已经把锁变成“456”，但是B线程挣的还是“123”
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException {

        MyService service = new MyService();

        ThreadA a = new ThreadA(service);
        a.setName("A");

        ThreadB b = new ThreadB(service);
        b.setName("B");
//没有睡眠，争抢的是同一个锁，虽然中间锁已经改变，但是此时b线程在等待池。没有一直去监视锁
        a.start();
        b.start();
    }
}
