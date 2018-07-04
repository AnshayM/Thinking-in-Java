package unit8;

class Meal {
	public Meal() {
		// TODO Auto-generated constructor stub
		System.out.println("Meal()");
	}
}

class Bread {
	public Bread() {
		// TODO Auto-generated constructor stub
		System.out.println("Bread()");
	}
}

class Cheese {
	public Cheese() {
		// TODO Auto-generated constructor stub
		System.out.println("Cheese()");
	}
}

class Lettuce {
	public Lettuce() {
		// TODO Auto-generated constructor stub
		System.out.println("Lettuce()");
	}
}

// 练习11：向Sandwich.java中添加Pickle类
class Pickle {
	public Pickle() {
		// TODO Auto-generated constructor stub
		System.out.println("Pickle()");
	}
}

class Lunch extends Meal {
	public Lunch() {
		// TODO Auto-generated constructor stub
		System.out.println("Lunch()");
	}
}

class PortableLunch extends Lunch {
	public PortableLunch() {
		// TODO Auto-generated constructor stub
		System.out.println("PortableLunch()");
	}
}

public class Sandwich extends PortableLunch {
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
	private Pickle p = new Pickle();

	public Sandwich() {
		System.out.println("Sanwich()");
	}

	public static void main(String[] args) {
		new Sandwich();
	}
}

/*
Meal()
Lunch()
PortableLunch()
Bread()
Cheese()
Lettuce()
Pickle()
Sanwich()

 * 
 */