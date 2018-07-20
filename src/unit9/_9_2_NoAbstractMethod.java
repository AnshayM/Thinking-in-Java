package unit9;

/**
 * 创建一个没有抽象方法的抽象类，验证我们能不能为这个抽象类创建任何对象
 * 
 * @author Administrator
 *
 */

abstract class NoAbstractMethod {

}

public class _9_2_NoAbstractMethod {
	public static void main(String[] args) {
//		NoAbstractMethod a = new NoAbstractMethod();
	}
}

/*
能创建对象，但是好像和 一般创建对象的方式不同，多了{};
--阅读网上的说明，这并不是创建对象

按照书本中的定义：
包含抽象方法的类叫做抽象类。
如果一个抽象类不完整，当我们试图产生该类的对象时，编译器对报错；
 * */
