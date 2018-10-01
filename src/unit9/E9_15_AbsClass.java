package unit9;

/**
 * 创建一个抽象类，并将其继承到一个导出类中。
 * 
 * @author Administrator
 *
 */

abstract class AbsTest{
	abstract void aFun();
}

class BaseP2 extends AbsTest implements ComInterface{

	@Override
	public void fFun() {
		// TODO Auto-generated method stub
		System.out.println("BaseP f");
	}

	@Override
	public void fFun2() {
		// TODO Auto-generated method stub
		System.out.println("BaseP f2");
	}

	@Override
	public void sFun() {
		// TODO Auto-generated method stub
		System.out.println("BaseP s");
	}

	@Override
	public void sFun2() {
		// TODO Auto-generated method stub
		System.out.println("BaseP s2");
	}

	@Override
	public void tFun() {
		// TODO Auto-generated method stub
		System.out.println("BaseP t");
	}

	@Override
	public void tFun2() {
		// TODO Auto-generated method stub
		System.out.println("BaseP t2");
	}

	@Override
	public void cFun() {
		// TODO Auto-generated method stub
		System.out.println("BaseP c");
	}

	@Override
	void aFun() {
		// TODO Auto-generated method stub
		System.out.println("BaseP abs a");
	}
}

public class E9_15_AbsClass {
	static void t1(FirInterface f) {
		f.fFun();
		f.fFun2();
	}

	static void t2(SecInterface s) {
		s.sFun();
		s.sFun2();
	}

	static void t3(ThiInterface t) {
		t.tFun();
		t.tFun2();
	}

	static void t4(ComInterface c) {
		c.cFun();
	}

	public static void main(String[] args) {
		BaseP2 bp = new BaseP2();
		t1(bp);
		t2(bp);
		t3(bp);
		t4(bp);
	}
}
