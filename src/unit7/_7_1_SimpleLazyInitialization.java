package unit7;

/**
 * 创建一个简单的类。第二个类中，将一个引用定义为第一个类的对象。运用惰性初始化来实例化 这个对象
 * 
 * 所谓惰性初始化，也就是懒加载模式，在对象使用之前才对对象进行初始化操作
 * 
 * @author Administrator
 *
 */
class Simple {
	String s;

	public String toString() {
		return s;
	}

	public void setString(String sNew) {
		s = sNew;
	}
}

// 第二个是组合：在新的类中产生现有类的对象
class Second {
	Simple simple;
	String s;

	public Second(String si) {
		s = si;
	}

	// 检查第一个类Simple是否已经创建对象
	public void checked() {
		if (simple == null) {
			System.out.println("simple not initialized");
		} else {
			System.out.println("simple initialized");
		}
	}

	// 懒加载
	private Simple lazy() {
		if (simple == null) {
			System.out.println("Creating Simple");
			simple = new Simple();
		}
		return simple;
	}

	public Simple getSimple() {
		return simple;
	}

	public void setSimple(String sNew) {
		lazy().setString(sNew);
	}

	public String toString() {
		return lazy().toString();
	}
}

public class _7_1_SimpleLazyInitialization {
	public static void main(String[] args) {
		Second second = new Second("Init String");
		second.checked(); // simple not initialized
		System.out.println(second.getSimple()); // null
		second.checked(); // simple not initialized
		System.out.println(second.getSimple()); // null
		System.out.println(second); // 
		second.setSimple("New String"); //Creating Simple; 
		System.out.println(second); // New String
	}
}

/*
simple not initialized
null
simple not initialized
null
Creating Simple
null	//这个null从何而来，未知？求解答
New String
 * 
 * */
