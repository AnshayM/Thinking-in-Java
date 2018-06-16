package unit5ex;
/*
 * 编写一个类，拥有两个静态字符串域，其中一个在定义处初始化，另一个在静态块中初始化。
 * 现在，加入一个静态方法用以打印出两个字段值。
 * 证明他们都会在使用之前完成初始化动作。
 * */

class StringFiled {
	static String s1 = "s1";
	static String s2;
	static {
		s2 = "s2";
	}
	static void print(){
		System.out.println("s1="+s1+" s2="+s2);
	}
}

public class _5_14_StaticField {
	public static void main(String[] args) {
//		StringFiled sFiled =new StringFiled();
//		System.out.println(sFiled.s1+"  "+sFiled.s2);
//		sFiled.print();
		StringFiled.print();//这一步才是正确的验证方法，因为没有生成任何对象，验证了
		//首次访问属于一个类的静态数据成员时，会执行静态初始化操作，而且只会执行一次
	}
}
