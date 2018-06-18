package unit5;

/**
 * 可变参数列表将重载过程变得复杂了
 * 
 * @author Administrator
 *
 */
public class OverloadingVarargs {
	static void f(Character... characters) {
		System.out.println("first");
		for (Character character : characters) {
			System.out.println(character);
		}
		System.out.println();
	}

	static void f(Integer... integers) {
		System.out.println("second");
		for (Integer integer : integers) {
			System.out.println(integer);
		}
		System.out.println();
	}

	static void f(Long... longs) {
		System.out.println("third");
		System.out.println();
	}

	public static void main(String[] args) {
		f('a', 'b', 'c');
		f(1, 2, 3, 4);
		f(1L);
		f(1);
		// f(); //无法通过编译，因为不使用参数调用f(),编译器无法知道调用哪一个方法
		/**
		 * 解决办法：添加一个非可变参数来解决这个问题
		 */
	}
}

/*
 first
a
b
c

second
1
2
3
4

third

second
1
 
 * */
