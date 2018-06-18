package unit5ex;

/**
 * 写一个类，它接受一个可变参数的String数组。验证可以向该方法传递一个用逗号分隔的String列表，或是一个String[]
 * 
 * @author Administrator
 *
 */

public class _5_19_VarArgsString {
	static void f(String... strings) {
		for (String string : strings) {
			System.out.println("String :" + string);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		f("s", "t", "r", "i", "n", "g");
		f(new String[] { "s", "t", "r", "i", "n", "g" });
	}
}
