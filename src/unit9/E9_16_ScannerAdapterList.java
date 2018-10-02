package unit9;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * 创建一个类，他将生成一个char序列，适配这个类，使其可以成为Scanner对象的一种输入。
 * 
 * 
 * // 此练习的目的是让我们懂得去适配接口 // Scanner类的构造器中接受的是一个Readable接口 //
 * 只要我们写一个类去实现Readable接口并且重写接口中的read方法 // 那Scanner就会自动调用重写后的方法，那么就可以实现输出
 * 
 * 
 * @author Administrator
 *
 */
public class E9_16_ScannerAdapterList implements Readable {

	private static final char[] cs = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

	public E9_16_ScannerAdapterList() {
		// TODO Auto-generated constructor stub
	}

	// 重写readable接口并重写接口中欧的read方法，Scanner会自动调用重写后的方法
	@Override
	public int read(CharBuffer cb) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(new E9_16_ScannerAdapterList());

	}

}
