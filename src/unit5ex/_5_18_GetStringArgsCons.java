package unit5ex;

/**
 * 创建一个类，他有一个接收一个String参数额构造器。在构造阶段，打印该参数。创建一个该类的引用数组，这次是创建对象赋值给引用数组
 * 当程序运行时，请注意来自对该构造器的调用中的初始化消息是否打印了出来
 * 
 * @author Administrator
 *
 */
public class _5_18_GetStringArgsCons {
	public static void main(String[] args) {
		GetString2 [] gs=new GetString2[]{
				new GetString2("s1"),
				new GetString2("s2")
		};
	}
}

class GetString2 {
	public GetString2(String s) {
		// TODO Auto-generated constructor stub
		System.out.println(s);
	}
}

/**
s1
s2
 */
