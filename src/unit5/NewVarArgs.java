package unit5;

public class NewVarArgs {
	static void printArray(Object... args) {	//区别于Object[]的形式，SE5后的新特性，书写更加方便，不需要强制[]数组
		for (Object object : args) {
			System.out.println(object + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
//		printArray(new Object[] { new Integer(47), new Float(3.14), new Double(11.11) });
		printArray(new Integer(47), new Float(3.14), new Double(11.11));

		printArray(47, 3.14, 11.11);
		printArray("One", "Two", "Three");
		printArray(new A(), new A());
		printArray((Object[]) new Integer[] { 1, 2, 3, 4 }); // 强制转换为Object[]
		//如果已经有一组事物，可以通过转型为Object数组，以便移除编译器警告信息。该方法可以把他们当做可变参数列表来接受
		printArray(); // 空的参数列表也是可以的
	}
}
