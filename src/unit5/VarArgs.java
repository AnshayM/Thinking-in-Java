package unit5;

public class VarArgs {
	static void printArray(Object[] args) {
		for (Object object : args) {
			System.out.println(object + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		printArray(new Object[] { new Integer(47), new Float(3.14), new Double(11.11) });
		printArray(new Object[] { "One", "Two", "Three" });
		printArray(new Object[] { new A(), new A() });
	}
}

class A{
	
}