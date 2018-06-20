package access.foreign;



public class Foreign {
	public static void main(String[] args) {
		/**
		 * 程序无法编译通过，
				class PackageClass {
					public PackageClass() {
						// TODO Auto-generated constructor stub
						Print.printb("Creating a packaged class");
					}
				}
			因为PackageClass这个类是包访问权限，包之外的类无法获得其使用权限
			但是如果放在同一个包内，两个类相通
		 */
		
//		PackageClass pc = new PackageClass();
	}
}
