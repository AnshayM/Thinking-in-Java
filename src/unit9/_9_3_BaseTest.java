package unit9;

/**
 * 创建一个基类，让它包含抽象方法print()，并在导出类中覆盖这个方法。
 * 
 * 覆盖的方法版本中可以打印导出类中定义的某个整型变量的值。
 * 
 * 在定义该变量处，赋予它非零值。
 * 
 * 在基类的构造器中调用这个方法。
 * 
 * 在main()方法中，创建一个导出类的对象，然后调用print()。
 * 
 * 解释现象
 * 
 * @author Administrator
 *
 */

abstract class BaseClass {
	abstract void print();
	
	public BaseClass() {
		// TODO Auto-generated constructor stub
		print();
	}

}

class NextClass extends BaseClass {

	 int a = 1;

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("a = " + a);
	}

}

public class _9_3_BaseTest {
	public static void main(String[] args) {
		NextClass n=new NextClass();
		n.print();
	}
}

/*
a = 0
a = 1

首先调用基类构造器中的print()，可是抽象方法，输出的数据为默认值
然后调用子类的print(),调用子类中实际的值
 */