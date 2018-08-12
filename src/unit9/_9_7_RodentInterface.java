package unit9;
/**
 * 修改第8章中的练习9，是Rodent成为一个接口
 * @author Administrator
 *
 */
interface Rodent9 {
	void eat();
}

//implement某个interface，interface中的方法在implement后必须是public
class Mouse9 implements Rodent9 {
	@Override
	public void eat() {
		System.out.println("Mouse.eat()");
	}
}

class Gerbil9 implements Rodent9 {
	@Override
	public void eat() {
		System.out.println("Gerbil.eat()");
	}
}

class Hamster9 implements Rodent9 {
	@Override
	public void eat() {
		System.out.println("Hamster.eat()");
	}
}

public class _9_7_RodentInterface {
	public static void live(Rodent9 r) {
		r.eat();
	}

	static void liveAll(Rodent9[] rs) {
		for (Rodent9 rodent : rs) {
			rodent.eat();
		}
	}

	public static void main(String[] args) {
		Rodent9[] rodents = { new Mouse9(), new Gerbil9(), new Hamster9() };
		liveAll(rodents);
	}
}


/*
 仅仅修改Rodent为接口，并删除Rodent中的方法实体；
 同时将子类的extends改为implement即可；
 
Mouse.eat()
Gerbil.eat()
Hamster.eat()

 */