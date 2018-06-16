package unit5ex;
/*
 * 保证finalize()方法总会调用
 * */

class Book2 {
	boolean checked = false;

	Book2(boolean checkout) {
		checked = checkout;
	}

	void checkIn() {
		checked = false;
	}

	//这个方法用来验证new Book(true)的错误
	protected void finalize() {//overrides java.lang.Object.finalize
		if (checked) {
			System.out.println("Error:checked out");
		}
	}
}

public class _5_11_TerninationCondition2 {
	public static void main(String[] args){
		Book2 novel =new Book2(true);//区别与下面两个对象，为什么这个对象没有调用finalize()方法呢？请电联告知我，谢谢
//		novel.checkIn();
		
		new Book2(true);//此对象在生成之后，程序结束之前，会被finalize，此时Book类中的finalize方法覆写，会对对象进行检查
		new Book2(true);
		//为了使上述对象总是调用finalize()方法
		System.gc();
//		System.runFinalization();
	}
}
