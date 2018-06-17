package unit5ex;

/**
 * 创建一个类，他有一个接收一个String参数额构造器。在构造阶段，打印该参数。创建一个该类的引用数组，但是不实际去创建对象赋值给该数组。
 * 当程序运行时，请注意来自对该构造器的调用中的初始化消息是否打印了出来
 * 
 * @author Administrator
 *
 */
public class _5_17_GetStringArgsCons {
	public static void main(String[] args) {
		GetString [] gs=new GetString[]{
				
		};
	}
}

class GetString {
	public GetString(String s) {
		// TODO Auto-generated constructor stub
		System.out.println(s);
	}
}
