package unit6;

class Soup1 {
	private Soup1() {
		// TODO Auto-generated constructor stub
	}

	public static Soup1 makeSoup() {
		return new Soup1();
	}
}

class Soup2 {
	//以下代码就是单例模式，只能创建一个对象
	private Soup2() {
	}

	private static Soup2 ps1 = new Soup2();	//首先创建静态对象，然后是非静态对象

	public static Soup2 access() {
		return ps1;
	}

	public void f() {

	}
}

public class Lunch {
	void testPrivate(){
		//Soup1 soup1=new Soup1();//无法创建，因为Soup1()构造器私有，无法直接创建对象
	}
	void testStatic(){
		Soup1 soup=Soup1.makeSoup();
	}
	void testSingleton(){
		Soup2.access().f();//单例模式创建一个对象
	}
}
