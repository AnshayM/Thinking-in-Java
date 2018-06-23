package unit7;

import unit7.protectedUse.ProtectedOne;

public class _7_15_Protected {
	public static void main(String[] args) {
		ProtectedOne one = new ProtectedOne();
		// one.set(3); //编译器无法通过
		/**
		 * 因为ProtectedOne这个类的set方法是protected 
		 * 
		 * 只有继承这个类，或者再同一个包内，才具有这个类的使用权限
		 */
	}
}
