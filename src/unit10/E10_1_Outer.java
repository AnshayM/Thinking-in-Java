package unit10;

public class E10_1_Outer {
	class Inner {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	public Inner getInner() {
		return new Inner();
	}

	public static void main(String[] args) {
		E10_1_Outer outer = new E10_1_Outer();
		System.out.println(outer.getInner().value());

		E10_1_Outer outer2 = new E10_1_Outer();

		E10_1_Outer.Inner i = outer2.getInner();

	}
}
