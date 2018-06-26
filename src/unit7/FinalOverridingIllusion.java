package unit7;

/**
 * private类型的方法，隐式指定为final。由于方法是private的，所以无法访问，更没有办法覆盖。
 * 
 * final的方法，继承之后，无法override
 * 
 * @author Administrator
 *
 */
class WithFinals {
	private final void f() {
		System.out.println("WithFinals.f()");
	}

	private void g() {
		System.out.println("WithFinal.g()");
	}
}

class OverridingPrivate extends WithFinals {
	private final void f() {
		System.out.println("OverridingPrivate.f()");
	}

	private void g() {
		System.out.println("OverridingPrivate.g()");
	}
}

class OverridingPrivate2 extends OverridingPrivate {
	public final void f() {
		System.out.println("OverridingPrivate2.f()");
	}

	public void g() {
		System.out.println("OverridingPrivate2.g()");
	}
}

public class FinalOverridingIllusion {
	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();

		OverridingPrivate op = op2;// 向上转型

		// 但是无法使用下列方法：
		// op.f();
		// op.g();

	}
}
