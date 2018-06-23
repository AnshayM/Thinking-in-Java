package unit7.protectedUse;

/**
 * 在包内编写一个类，类应具备一个protected方法。在包外，试着调用protected方法并解释其结果
 * 
 * 然后，从你的类中继承产生一个类，并从该导出类的方法内部调用该protected方法。
 * 
 * @author Administrator
 *
 */
public class ProtectedOne {
	private int one;

	protected void set(int i) {
		one = i;
		System.out.println(one);
	}

	public static void main(String[] args) {

	}
}

class ProtectedTwo extends ProtectedOne {
	void set2() {
		set(1);
	}

	public static void main(String[] args) {
		ProtectedTwo x = new ProtectedTwo();
		x.set2();
	}
}

/*
1
 */