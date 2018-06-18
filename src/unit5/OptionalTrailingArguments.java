package unit5;

/**
 * 当有可选的尾随参数时，可变参数列表会非常方便
 * 
 * @author Administrator
 *
 */
public class OptionalTrailingArguments {
	static void f(int required, String... trailing) {
		System.out.println("required:" + required + " ");
		for (String string : trailing) {
			System.out.println(string + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		f(1, "one");
		f(2, "two", "three");
		f(0);
	}
}

/*
required:1 
one 

required:2 
two 
three 

required:0 

 * */
