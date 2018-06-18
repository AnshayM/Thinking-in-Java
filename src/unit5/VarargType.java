package unit5;

public class VarargType {
	//getClass()将产生对象的类
	
	static void f(Character... args) {
		System.out.println(args.getClass());
		System.out.println("length of args:" + args.length);
	}

	static void g(int... args) {
		System.out.println(args.getClass());
		System.out.println("length of args:" + args.length);
		for (int i : args) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		f('a');
		f();
		System.out.println();
		
		g(1);
		g();		
		System.out.println("int[]:" + new int[0].getClass());	//可变参数列表不依赖于自动包装机制
		System.out.println();
		
		g(1,new Integer(2),3);	//单一参数列表中将类型混合在一起，自动包装机制有选择的将参数提升为Integer

	}
}

/*
class [Ljava.lang.Character;
length of args:1
class [Ljava.lang.Character;
length of args:0
class [I
length of args:1
class [I
length of args:0
int[]:class [I

 * */
