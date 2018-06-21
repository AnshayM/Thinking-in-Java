package unit7;

/**
 * 创建一个基类，它仅有一个非默认构造器；再创建一个导出类，它带有默认构造器和非默认构造器。
 * 
 * 在导出类的构造器中调用基类的构造器；
 * 
 * @author Administrator
 *
 */
class Base {
	Base(int i) {
		System.out.println(" Base :" + i);
	}
}

class BaseExtends extends Base {
	BaseExtends() {
		super(1); // 导出类有默认构造器，也必须执行super(int i)这个方法；
	}

	BaseExtends(int i) {
		super(i); // 首先调用基类构造器，再调用导出类构造器
		System.out.println(" BaseExtends int i:" + i);
	}

}

public class _7_8_ConstructorUse {
	public static void main(String[] args) {
		new BaseExtends();
		new BaseExtends(2);
	}
}

/*
 Base :1
 Base :2
 BaseExtends int i:2

 * */
