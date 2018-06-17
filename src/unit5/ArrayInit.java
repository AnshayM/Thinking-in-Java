package unit5;

import java.util.Arrays;

public class ArrayInit {
	public static void main(String[] args) {
		//必须在开始就对数组进行初始化
		Integer[] a = { new Integer(1), new Integer(2), 3 };
		//可以在任意场合进行初始化，甚至是方法调用的内部
		Integer[] b = new Integer[] { new Integer(1), new Integer(2), 3 };

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}
