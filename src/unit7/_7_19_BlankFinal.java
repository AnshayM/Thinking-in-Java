package unit7;

/**
 * 创建一个含有指向某对象的空白final引用的类。
 * 
 * 在所有的构造器内部都执行空白final的初始化动作。
 * 
 * 说明Java确保final在使用前必须被初始化，且一旦被初始化即无法改变。
 * 
 * @author Administrator
 *
 */
class BF {
	private int i;

	public BF(int i) {
		// TODO Auto-generated constructor stub
		this.i = i;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i=" + i;
	}
}

public class _7_19_BlankFinal {
	private final BF bf;

	public _7_19_BlankFinal() {
		// TODO Auto-generated constructor stub
		bf = new BF(1);
	}

	public _7_19_BlankFinal(int x) {
		bf = new BF(x);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "bf:" + bf;
	}

	public static void main(String[] args) {
		System.out.println(new _7_19_BlankFinal());
		System.out.println(new _7_19_BlankFinal(5));
	}
}
