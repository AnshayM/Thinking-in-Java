package unit6;

/**
 * 在某个包中创建一个类，在这个类所处的包的外部创建该类的一个实例
 * 实例创建在unit6t中
 * 
 * @author Administrator
 *
 */
public class _6_1_Package {
	//这个构造器必须是public，如果是包访问权限（没有访问词，包外是无法访问的）
	public _6_1_Package() {
		System.out.println("unit6");
	}
}
