package unit9;

/**
 * 验证接口中域隐式地是static和final。
 * 
 * static 内部无法调用非静态方法；
 * 
 * @author Administrator
 *
 */
interface Number {
	int ONE = 1, TWO = 2, THREE = 3, FOUR = 4, FIVE = 5, SIX = 6, SEVEN = 7, EIGHT = 8, NINE = 9, TEN = 10;
}


public class E9_17TestInterfaceHideStaticFinal {
	public static void main(String[] args) {
		System.out.println(Number.EIGHT);//可以直接调用证明是static和public的
	}
}
