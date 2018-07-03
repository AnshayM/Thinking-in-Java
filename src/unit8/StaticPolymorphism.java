package unit8;

class StaticSuper {
	public static String staticGet() {
		return "Base staticGet()";
	}

	public String dynamicGet() {
		return "Base dynamicGet()";
	}
}

class StaticSub extends StaticSuper {
	public static String staticGet() {
		return "Derived staticGet()";
	}

	public String dynamicGet() {
		return "Derived dynamicGet()";
	}
}

public class StaticPolymorphism {
	public static void main(String[] args) {
		StaticSuper sup = new StaticSub();
		System.out.println(sup.staticGet());	//static方法与类相关，sup对象属于StaticSuper
		System.out.println(sup.dynamicGet());	//向上转型，使用继承类的方法
	}
}

/*
Base staticGet()
Derived dynamicGet()

 */