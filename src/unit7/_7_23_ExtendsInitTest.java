package unit7;

/**
 * 证明加载类的动作仅仅发生一次。
 * 
 * 证明该类的第一个实体的创建或者对static成员的访问都有可能引起加载
 * 
 * @author Administrator
 *
 */
class First {
	public First() {
		// TODO Auto-generated constructor stub
		System.out.println("First Class Constructor");
	}

	static int i = 1000;

	static void f() {
		System.out.println("static First.f()");
	}
}

public class _7_23_ExtendsInitTest {
	public static void main(String[] args) {
//		new First();
//		System.out.println(First.i);
		First.f();
	}
}


/*

 */
