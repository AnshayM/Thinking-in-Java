package unit9;

/**
 * 使其成为一个抽象类。只要有可能，就将Rodent的方法声明为抽象方法·
 * @author Administrator
 *
 */

//class Rodent {
//	void eat() {
//		System.out.println("Rodent.eat()");
//	}
//}
abstract class Rodent {
	abstract void eat();//只是更改了基类为抽象类，方法声明为抽象方法，但是结果相同 
}

class Mouse extends Rodent {
	@Override
	void eat() {
		System.out.println("Mouse.eat()");
	}
}

class Gerbil extends Rodent {
	@Override
	void eat() {
		System.out.println("Gerbil.eat()");
	}
}

class Hamster extends Rodent {
	@Override
	void eat() {
		System.out.println("Hamster.eat()");
	}
}

public class _9_1_RodentTest {
	public static void live(Rodent r) {
		r.eat();
	}

	static void liveAll(Rodent[] rs) {
		for (Rodent rodent : rs) {
			rodent.eat();
		}
	}

	public static void main(String[] args) {
		Rodent[] rodents = { new Mouse(), new Gerbil(), new Hamster() };
		liveAll(rodents);
	}
}


/*
Mouse.eat()
Gerbil.eat()
Hamster.eat()

 */