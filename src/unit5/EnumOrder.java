package unit5;

/**
 * 1- toString()显示某个enum实例的名字
 * 2- 创建ordinal()表示某个特定enum常量的声明顺序
 * 3- static values()按照enum声明的顺序，产生由这个常量值构成的数组
 * @author Administrator
 *
 */
public class EnumOrder {
	public static void main(String [] args){
		for (Spiciness spiciness : Spiciness.values()) {
			System.out.println(spiciness);
		}
		
		 int ordinal = Spiciness.FLAMING.ordinal();	//获取特定enum常量的声明顺序
		 System.out.println(ordinal); 
			
	}
}

