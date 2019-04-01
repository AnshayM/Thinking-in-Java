package unit10;

/**
 * 如果想要在匿名类做一些类似构造器的操作，可以使用如下操作；
 * 对比Parcel8的操作，这里是使用了抽象类的操作，添加了构造器，和抽象方法；
 */
abstract class Base {
	public Base(int i) {
		System.out.println("Base constructor ,i = " + i);
	}

	public abstract void f();
}

public class AnnoymousConstructor {
	public static Base getBase(int i) {
		return new Base(i) {
			{
				System.out.println("Inside initialization");//使用代码块输进行操作；
			}

			@Override
			public void f() {
				System.out.println("In annoymoust f()");
			}
		};
	}

	public static void main(String[] args) {
		Base base =getBase(47);
		base.f();
	}
}

/* output:
Base constructor ,i = 47
Inside initialization
In annoymoust f()
* */
