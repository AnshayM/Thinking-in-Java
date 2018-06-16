package unit5ex;

class Cup {
	public Cup(int marker) {
		System.out.println("Cup(" + marker + ")");
	}

	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}
}

class Cups {
	static Cup cup1;
	static Cup cup2;
	static {
		cup1 = new Cup(1);	//（3）静态初始化操作只会执行一次
		cup2 = new Cup(2);
	}

	Cups() {
		System.out.println("Cups()");
	}
}

public class _5_13_initialization_ExplicitStatic {
	public static void main(String[] args) {
		System.out.println("Inside main()");
//		Cups.cup1.f(99);	//(1)
	}

	static Cups cups1 = new Cups();	//(2) //静态初始化操作只会执行一次，所以（2）无论是一行还是两行，结果都是一样
	static Cups cups2 = new Cups();	//(2)
}
