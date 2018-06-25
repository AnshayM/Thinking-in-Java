package unit7;

/**
 * 基本类型的参数指明为final时：可以读参数，却无法修改参数
 * 
 * 主要用来想匿名内部类传递数据
 * 
 * @author Administrator
 *
 */
class Gizmo {
	public void spin() {
		System.out.println("Gizmo.spin()");
	}
}

public class FinalArgument {
	void with(final Gizmo g) {
		// g=new Gizmo();//g是final参数，无法更改引用
	}

	void without(Gizmo g) {
		g = new Gizmo();
		g.spin();
	}

	int g(final int i) {
		return i + 1;
	}

	public static void main(String[] args) {
		FinalArgument fa = new FinalArgument();
		fa.with(null);
		fa.without(null);
	}

}
