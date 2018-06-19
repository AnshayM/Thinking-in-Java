package unit6;

import personaUtils.Print;
import unit6t.Cookie;

/**
 * 验证protected：继承访问权限
 * 
 * @author Administrator
 *
 */
public class ChocolateChip extends Cookie {
	public ChocolateChip() {
		// TODO Auto-generated constructor stub
		Print.print("Chocolate Constructor");
	}

	public void chomp() {
		//bite();	//Cookie在其他包内，其方法bite()无法访问
		/**
		 * 如果将bite()方法设为public，所有人都获得了访问权限，这不是所希望的
		 * 这个时候将bite()设为protected权限，就能实现，包外只有继承的类，才能获得bite()的使用权限
		 * 而，包内的成员使用bite()不受影响
		 */
		bite();
	}
	
	public static void main(String[] args) {
		ChocolateChip cc=new ChocolateChip();
		cc.chomp();
	}
}

//// 一个java文件中，只能有一个public权限的class
//class Cookie {
//	public Cookie() {
//		// TODO Auto-generated constructor stub
//		Print.print("Cookie Constructor");
//	}
//
//	// 如果和ChocolateChip在同一个java文件下，有访问权限
//	void bite() {
//		Print.print("bite");
//	}
//}
