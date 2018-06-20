package unit6;

import personaUtils.Print;

class Manager1 {
	private Manager1() {
	}

	public static Manager1 access() {
		return new Manager1();
	}
}

class Manager2 {
	private Manager2() {
	}

	private static Manager2 mg = new Manager2();

	public static Manager2 access() {
		return mg;
	}
}

public class _6_8_ConnectionManager {
	void tStatic() {
		Manager1 manager1 = Manager1.access();
		Print.printb(manager1);
	}

	void tSingleton() {
		Manager2 manager2 = Manager2.access();
		Print.printb(manager2);
	}

	public static void main(String[] args) {
		Print.print(Manager2.access());

		_6_8_ConnectionManager mg = new _6_8_ConnectionManager();
		_6_8_ConnectionManager mg2 = new _6_8_ConnectionManager();

		mg.tStatic(); // (1)
		mg.tSingleton(); // (2)

		mg2.tStatic(); // (3)
		mg2.tSingleton(); // (4)
		
		Print.print(Manager2.access());
	}
}

/**
 * (2)(4)使用了singleton单例模式，创建的对象只有一个，所以对象地址是相同的 
unit6.Manager2@139a55unit6.Manager1@1db9742
unit6.Manager2@139a55
unit6.Manager1@106d69c
unit6.Manager2@139a55
unit6.Manager2@139a55
 */
