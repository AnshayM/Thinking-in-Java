package unit7;

class Component1U {
	public Component1U(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Component1"+i);
	}
}

class Component2U {
	public Component2U(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Component2"+i);
	}
}

class Component3U {
	public Component3U(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Component3"+i);
	}
}

class RootU {
	public RootU(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Root"+i);
	}

	Component1U c1 = new Component1U(1);
	Component2U c2 = new Component2U(2);
	Component3U c3 = new Component3U(3);

	public static void main(String[] args) { // 虽然每个类都可以写main方法，但是public
												// class没有main方法，将无法执行其他的main()
	}
}

public class _7_9_Root extends RootU {
	public _7_9_Root(int i) {
		super(i);
		// TODO Auto-generated constructor stub
		System.out.println("_7_9_Root");
	}
	
	Component1U c1 = new Component1U(1);
	Component2U c2 = new Component2U(2);
	Component3U c3 = new Component3U(3);

	public static void main(String[] args) {
		new _7_9_Root(4);
	}
}
/*
Component11
Component22
Component33
Root4
Component11
Component22
Component33
_7_9_Root
 */