package unit9;

interface FirInterface {
	void fFun();

	void fFun2();
}

interface SecInterface {
	void sFun();

	void sFun2();
}

interface ThiInterface {
	void tFun();

	void tFun2();
}

interface ComInterface extends FirInterface, SecInterface, ThiInterface {
	void cFun();
}

class Base {
	public void bFun() {
	}
}

class BaseP extends Base implements ComInterface {

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
}

//参考前例，可以知道参数可以传入接口
public class E9_14_ExtendsInterface {
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
		BaseP bp = new BaseP();
		t1(bp);
		t2(bp);
		t3(bp);
		t4(bp);
	}
}

/*
 *
Output:
BaseP f
BaseP f2
BaseP s
BaseP s2
BaseP t
BaseP t2
BaseP c

 */