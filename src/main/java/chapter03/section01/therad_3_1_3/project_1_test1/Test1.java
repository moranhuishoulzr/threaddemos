package chapter03.section01.therad_3_1_3.project_1_test1;
//wait()方法必须在同步方法中或者同步代码块中
public class Test1 {
	public static void main(String[] args) {
		try {
			String newString = new String("");
			newString.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
