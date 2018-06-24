package unit7;

/**
 * 修改AmphibianTest。使其Frog覆盖基类的方法的定义（令新定义使用相同的方法特征签名）。
 * 
 * 留心main()中发生了什么
 * 
 * @author Administrator
 *
 */
class AmphibianU {
	void play() {
		System.out.println("Amphibian.play()");
	}

	static void tune(AmphibianU a) {
		a.play();
	}
}

class FrogU extends AmphibianU {
	public FrogU() {
		// TODO Auto-generated constructor stub
		System.out.println("FrogU Constructor");
	}
	
	@Override
	void play() {
		// TODO Auto-generated method stub
		super.play();
		System.out.println("FrogU.play()");
	}
	
	static void tune(AmphibianU a){
		a.play();
	}
}

public class _7_17_AmphibianUTest {
	public static void main(String[] args) {
		FrogU x = new FrogU();
		AmphibianU.tune(x);
	}
}
