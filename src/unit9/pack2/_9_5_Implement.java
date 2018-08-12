package unit9.pack2;

import unit9.pack1._9_5_Interface;

/**
 * 在某个包内创建一个接口，内含三个方法，然后在另一个包中实现；
 * 
 * @author Administrator
 *
 */
class Implements implements _9_5_Interface{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Implement m1()");
	}

	@Override
	public int m2() {
		// TODO Auto-generated method stub
		return 123;
	}

	@Override
	public String m3() {
		// TODO Auto-generated method stub
		return "Implement m3()";
	}
}

public class _9_5_Implement {
	public static void main(String[] args) {
		Implements i=new Implements();	
		i.m1();
		i.m2();
		i.m3();
	}
}

/*
接口有专有的一个类，interface；
class是无法implement的； 
*/