package unit7;

/**
 * 创建两个带有默认构造器的类A和B。从A中继承产生C类，并在C内创建一个B类的成员。
 * 
 * 不要给C类构造器。创建一个C类对象并观察结果。
 * 
 * @author Administrator
 *
 */
class A {
	A() {
		System.out.println(" A Constructor");
	}
}

class B {
	B() {
		System.out.println(" B Constructor");
	}
}

class C extends A {
	B b = new B();
}

public class _7_5_ClassABC {
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.getClass());
		/**
		 * 首先调用继承类的基类构造器；
		 * 然后调用实例对象b 的构造器
		 */
	}
}

/*
 A Constructor
 B Constructor
class unit7.C

 * */
