package personaUtils;
/**
 * 自定义打印类
 * 
 */
import java.io.PrintStream;

public class Print {
	//无换行
	public static void print(Object obj) {
		System.out.print(obj);
	}

	//空行
	public static void print() {
		System.out.println();
	}

	//换行
	public static void printb(Object obj) {
		System.out.println(obj);
	}

	public static PrintStream printf(String format, Object... args) {
		return System.out.printf(format, args);
	}
}
