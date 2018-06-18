package unit5ex;

/**
 * enum类必须单独创建一个类
 * 
 * 创建一个enum，包含6种基本面值，通过value()循环打印每个值，并输出其ordinal()
 * 
 * @author Administrator
 *
 */
public class _5_21_EnumTest {
	public static void main(String[] args) {
		for (_5_21_EnumMoneyType moneyType : _5_21_EnumMoneyType.values()) {
			System.out.println(moneyType);
			System.out.println(moneyType.ordinal());
		}
	}
}
