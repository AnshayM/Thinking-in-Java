package unit7;

class Villian {
	private String name;

	protected void set(String name) {
		this.name = name;
	}

	public Villian(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public String toString() {
		return "I'm a Villian and my name is " + name;
	}
}

public class Orc extends Villian {
	private int orcNumber;

	public Orc(String name, int orcNumber) {
		super(name); // 调用基类构造器，同时传递参数name
		this.orcNumber = orcNumber;
	}

	public void change(String name, int orcNumber) {	//Orc这个类extends Villian，可以使用基类的set()方法
		set(name); // 调用基类的方法set(name)
		this.orcNumber = orcNumber;
	}

	@Override
	public String toString() {
		return "Orc " + orcNumber + ":" + super.toString();
	}

	public static void main(String[] args) {
		Orc orc = new Orc("Limburger", 12);
		System.out.println(orc);
		orc.change("Bob", 19);
		System.out.println(orc);
	}
}
