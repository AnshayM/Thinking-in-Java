package unit6t;

import personaUtils.Print;

// 一个java文件中，只能有一个public权限的class
public class Cookie {
	public Cookie() {
		// TODO Auto-generated constructor stub
		Print.print("Cookie Constructor");
	}

	// 如果和ChocolateChip在同一个java文件下，有访问权限
	protected void bite() {
		Print.printb("bite");
	}
}
