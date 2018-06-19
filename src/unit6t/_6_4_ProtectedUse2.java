package unit6t;

/**
 * 展示protected方法具有包访问权限，但不是public
 * 
 * 查看unit6t的Cookie类
 * 
 * @author Administrator
 *
 */
public class _6_4_ProtectedUse2 {
	public static void main(String[] args) {
		Cookie cookie = new Cookie();
		cookie.bite();// bite()是protected，但是仍然具有包访问权限
	}

}
