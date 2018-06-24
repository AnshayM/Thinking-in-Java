package unit7;

/**
 * 向上转型练习
 * 
 * @author Administrator
 *
 */
class Amphibian {
	void paly() {
		System.out.println("Ambition.play()");
	}

	static void tune(Amphibian a) {
		a.paly();
	}
}

class Frog extends Amphibian {
	public Frog() {
		// TODO Auto-generated constructor stub
		System.out.println("Frog Constructor");
	}
}

public class _7_16_AmphibianTest {
	public static void main(String[] args) {
		Frog frog = new Frog();
		Amphibian.tune(frog);
	}
}
/*
Frog Constructor
Ambition.play()

 */