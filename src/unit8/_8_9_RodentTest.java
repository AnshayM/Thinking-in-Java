package unit8;

class Rodent {
	void eat() {
		System.out.println("Rodent.eat()");
	}
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

public class _8_9_RodentTest {
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