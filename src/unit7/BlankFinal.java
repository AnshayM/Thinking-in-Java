package unit7;

/**
 * 空白final域：实现根据对象的不同而有所不同，却有保持其恒定不变的特性
 * 
 * 编译器确保空白final在使用前必须初始化
 * 
 * @author Administrator
 *
 */
class Poppet {
	private int i;

	public Poppet(int i) {
		// TODO Auto-generated constructor stub
		this.i = i;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i= " + i;
	}
}

public class BlankFinal {
	private final int i = 0;
	private final int j; // 编译器报错，提示需要对空白final进行初始化
	private final Poppet p;// 编译器报错，提示需要对空白final进行初始化

	public BlankFinal() {
		// TODO Auto-generated constructor stub
		j = 1;
		p = new Poppet(1);
	}

	public BlankFinal(int i) {
		j = i;
		p = new Poppet(i);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "j=" + j + " ;" + p;
	}

	public static void main(String[] args) {
		System.out.println(new BlankFinal());
		System.out.println(new BlankFinal(5));
	}
}
