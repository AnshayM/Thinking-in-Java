package unit5ex;

class Book {
	boolean checked = false;

	Book(boolean checkout) {
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

public class _5_10_TerninationCondition {
	public static void main(String[] args){
		Book novel =new Book(true);
		novel.checkIn();
		
		new Book(true);//此对象在生成之后，程序结束之前，会被finalize，此时Book类中的finalize方法覆写，会对对象进行检查
		System.gc();
	}
}
