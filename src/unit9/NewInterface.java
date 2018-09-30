package unit9;

/**
 * 创建一个接口，并从该接口继承两个接口，然后从后面两个接口多重继承第三个接口
 * 
 * （这两句话其实有点拗口，但是通过查看别人的代码就可以理解了）
 * 
 * @author Administrator
 *
 */
interface BaseInterface {
	void f();
}

interface IntermediateInterface1 extends BaseInterface {
	void f();
}

interface IntermediateInterface2 extends BaseInterface {
	void f();
}

interface CombinedInterface extends IntermediateInterface1, IntermediateInterface2 {
	void f();
}

class CombinedImpl implements CombinedInterface {
	public void f() {
		System.out.println("CombinedImpl.f()");
	}
}

public class NewInterface {
	public static void main(String[] args) {
		new CombinedImpl().f();
	}
}

// 运行结果
// CombinedImpl.f()
/*
 * Interface是可以继承的
 */
