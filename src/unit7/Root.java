package unit7;

class Component1 {
	public Component1() {
		// TODO Auto-generated constructor stub
		System.out.println("Component1");
	}
}

class Component2 {
	public Component2() {
		// TODO Auto-generated constructor stub
		System.out.println("Component2");
	}
}

class Component3 {
	public Component3() {
		// TODO Auto-generated constructor stub
		System.out.println("Component3");
	}
}

public class Root {
	public Root() {
		// TODO Auto-generated constructor stub
		System.out.println("Root");
	}

	Component1 c1 = new Component1();
	Component2 c2 = new Component2();
	Component3 c3 = new Component3();

	public static void main(String[] args) { // 虽然每个类都可以写main方法，但是public
												// class没有main方法，将无法执行其他的main()
	}
}

class Stem extends Root {
	public Stem() {
		// TODO Auto-generated constructor stub
		System.out.println("Stem");
	}

	Component1 c1 = new Component1();
	Component2 c2 = new Component2();
	Component3 c3 = new Component3();

	public static void main(String[] args) {
		new Stem();
	}
}

/*
 * Component1 Component2 Component3 Root Component1 Component2 Component3 Stem
 * 
 */