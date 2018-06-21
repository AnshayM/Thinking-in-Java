package unit7;

class Cleanser {
	private String s = "cleanser ";

	public void append(String a) {
		s += a;
	}

	public void dilute() {
		append(" Cleanser.dilute()");
	}

	public void apply() {
		append(" Cleanser.apply()");
	}

	public void scrub() {
		append(" Cleanser.scrub()");
	}

	public String toString() {
		return s;
	}

	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		System.out.println(x);
	}
}

public class Detergent extends Cleanser {
	@Override
	public void scrub() {
		// TODO Auto-generated method stub
		append("Detergent.scrub()");
		super.scrub(); // 调用基类版本的scrub()
	}

	public void foam() {
		append(" foam()");
	}

	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println("Testing base class:");
		Cleanser.main(args);
	}
}

/*
 * cleanser dilute() append()Detergent.scrub() Cleanser.scrub() foam() Testing
 * base class: cleanser dilute() append() Cleanser.scrub()
 * 
 * 
 */
