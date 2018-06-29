package unit7;

/**
 * final类
 * 
 * 对该类的设计不需要任何改动
 * 
 * 或者，出于安全考虑不允许它有子类
 * 
 * @author Administrator
 *
 */
class SmallBrain {

}

final class Dinosaur {
	int i = 7;
	int j = 1;
	SmallBrain x = new SmallBrain();

	void f() {
	}
}

// 无法继承Dinosaur类
public class Jurassic {
	public static void main(String[] args) {
		Dinosaur n = new Dinosaur();
		n.f();
		n.i = 40;
		n.j++;
	}
}
