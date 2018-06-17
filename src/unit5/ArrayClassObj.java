package unit5;

import java.util.Arrays;
import java.util.Random;

public class ArrayClassObj {
	public static void main(String[] args) {
		Random random = new Random(48);
		
		//创建一个非基本类型的数组，只是创建了这个数组的引用。
		//直接通过创建新的对象，把对象赋值给引用
		Integer [] a = new Integer[random.nextInt(20)];
		System.out.println("length of a = " + a.length);
		
		for (int i = 0; i < a.length; i++) {
			a[i]=random.nextInt(500);
		}
		
		System.out.println(Arrays.toString(a));
	}
}
