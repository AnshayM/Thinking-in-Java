package unit5;

public class DynamicArray {
	public static void main(String[] args) {
		Other.main(new String[] { "Debug", "this", "moment" });

		//上面的语句等价于，这句话也是验证了创建非基本类型数组，持有的是一个引用，需要对每一个元素进行赋值
		String []a ={
				new String("Debug"),
				new String("that"),
				new String("moment")
		};
		Other.main(a);
	}
}

class Other {
	public static void main(String[] args) {
		for (String string : args) {
			System.out.println(string+" ");
		}
	}
}