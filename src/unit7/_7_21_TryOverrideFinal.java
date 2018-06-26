package unit7;

/**
 * 创建一个带final方法的类，由此继承产生一个类并尝试覆盖该方法。
 * 
 * @author Administrator
 *
 */
class FinalClass {
	public final void f() {
		System.out.println("FinalClass.f()");
	}
}

class ExtendsFinalClass extends FinalClass{
	//编译器报错，提示无法override final类型的方法
	@Override
//	public final void f() {
//		System.out.println("FinalClass.f()");
//	}
}

public class _7_21_TryOverrideFinal {

}
