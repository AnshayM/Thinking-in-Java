package unit5ex;

/**
 * 创建一个使用可变参数列表的而不是普通main()方法的main()。
 * 打印所有的args数组的所有元素，并用各种不同数量的命令行参数来测试它
 * 
 * 参考了DynamicArray的方法
 * @author Administrator
 *
 */

public class _5_20_VarArgsMain {
	public static void main(String... args) { //public static void main(String[] args)好像没差
		OtherMain.main("args1","args2",1,1.1,0.333);
	}
}

class OtherMain{
	public static void main(Object...objects ){
		for (Object object : objects) {
			System.out.println(object);
		}
	}
}
