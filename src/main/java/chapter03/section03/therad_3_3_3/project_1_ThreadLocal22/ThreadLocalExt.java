package chapter03.section03.therad_3_3_3.project_1_ThreadLocal22;

public class ThreadLocalExt extends ThreadLocal {
	@Override
	protected Object initialValue() {
		return "����Ĭ��ֵ ��һ��get����Ϊnull";
	}
}
