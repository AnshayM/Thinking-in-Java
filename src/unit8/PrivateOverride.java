package unit8;

/**
 * PrviateOverride类中的f()为private,Derived类无法覆写
 * 
 * 所以PrivateOverride po对象的f()使用的是PrivateOverride的f()
 * 
 * @author Administrator
 *
 */
class Derived extends PrivateOverride {
	public void f() {
		System.out.println("public f()");
	}
}

public class PrivateOverride {
	private void f() {
		System.out.println("private f()");
	}

	public static void main(String[] args) {
		PrivateOverride po = new Derived();
		po.f();
	}
}

/*
 * 
 * private f()
 * 
 */
