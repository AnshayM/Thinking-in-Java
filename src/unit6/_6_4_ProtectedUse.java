package unit6;

import unit6t.Cookie;

/**
 * 展示protected方法具有包访问权限，但不是public
 * 
 * 查看unit6t的Cookie类
 * @author Administrator
 *
 */
public class _6_4_ProtectedUse {
	public static void main(String[] args) {
		Cookie cookie=new Cookie();
//		cookie.bite();//程序报错，无法通过编译。证实bite()protected权限下，如果没有继承，是没有其使用权限的
	}
}
