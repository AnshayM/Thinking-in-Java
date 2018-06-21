package unit7;

/**
 * 修改练习题5，使A和B以带参数的构造器取代默认的构造器
 * 
 * 为C写一个构造器，并在其中执行所有的初始化
 * 
 * @author Administrator
 *
 */

class AU {
	AU(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("AU Constructor");
	}
}

class BU {
	BU(int i) {
		System.out.println("BU Constructor");
	}
}

class CU extends AU {

	CU(int i) {
		super(i);
		// TODO Auto-generated constructor stub
		System.out.println("CU Constructor");
	}

	BU bu = new BU(2);
}

public class _7_7_ClassABCUpdate {
	public static void main(String[] args) {
		CU cu = new CU(3);
//		System.out.println(cu.getClass());
	}
}


/*
AU Constructor
BU Constructor
CU Constructor

 * */
