package unit7;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

class Component1U {
	public Component1U(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Component1 " + i);
	}

	void dispose() {
		System.out.println("Component1U.dispose()");
	}
}

class Component2U {
	public Component2U(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Component2 " + i);
	}

	void dispose() {
		System.out.println("Component2U.dispose()");
	}
}

class Component3U {
	public Component3U(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Component3 " + i);
	}

	void dispose() {
		System.out.println("Component3U.dispose()");
	}
}

class RootU {
	public RootU(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Root " + i);
	}

	Component1U c1 = new Component1U(1);
	Component2U c2 = new Component2U(2);
	Component3U c3 = new Component3U(3);

	void dispose() {
		System.out.println("RootU.dispose()");
		c1.dispose();
		c2.dispose();
		c3.dispose();
	}

	public static void main(String[] args) { // 虽然每个类都可以写main方法，但是public
												// class没有main方法，将无法执行其他的main()
	}
}

public class _7_9_Root extends RootU {
	Component1U c1; // 不需要添加static，因为不用在main测试方法中进行测试。并且，单独设计一个方法用于清理这些对象
	Component2U c2;
	Component3U c3;

	public _7_9_Root(int i) {
		super(i);
		// TODO Auto-generated constructor stub
		System.out.println("_7_9_Root Constructor");

		c1 = new Component1U(4);
		c2 = new Component2U(5);
		c3 = new Component3U(6);
	}

	void dispose() {
		System.out.println("_7_9_Root.dispose()");
		c1.dispose();
		c2.dispose();
		c3.dispose();
		super.dispose();
	}

	public static void main(String[] args) {
		_7_9_Root x = new _7_9_Root(4);
		try {

		} finally {
			x.dispose();
		}
	}
}
/*
Component1 1
Component2 2
Component3 3
Root 4
_7_9_Root Constructor
Component1 4
Component2 5
Component3 6
_7_9_Root.dispose()
Component1U.dispose()
Component2U.dispose()
Component3U.dispose()
RootU.dispose()
Component1U.dispose()
Component2U.dispose()
Component3U.dispose()

 */