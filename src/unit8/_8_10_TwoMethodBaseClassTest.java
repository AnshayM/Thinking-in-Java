package unit8;

/**
 * 子类向上转型后，调用基类的方法；
 * 
 * 结果：反应子类的结果
 * 
 * 子类已经覆写了基类的方法
 * 
 * @author Administrator
 *
 */
class TwoMethodClass {
	void firstMethod() {
//		System.out.println("TwoMethodClass.firstMethod()"); // 首先调用了这个方法
		secondMethod();
	}

	void secondMethod() {
		System.out.println("TwoMethodClass.secondMethod()");
	}
}

class ClassExtends extends TwoMethodClass {
	@Override
	void secondMethod() {
		System.out.println("ClassExtends.secondMethods()"); // 然后调用了这个方法
	}
}

public class _8_10_TwoMethodBaseClassTest {
	public static void change(TwoMethodClass i) {

	}

	public static void main(String[] args) {
		ClassExtends ce = new ClassExtends();
		TwoMethodClass tm = (TwoMethodClass) ce; // 向上强制转型。但是好像编译器默认已经转型

		TwoMethodClass tm1 = new ClassExtends(); // 以上步骤可以简化为以下一步
		tm.firstMethod();
	}
}

/*
 ClassExtends.secondMethods()
 * 
 */
