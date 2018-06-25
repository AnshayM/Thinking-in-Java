package unit7;

/**
 * 创建一个类含有static final 和 final域的类，说明两者的区别
 * 
 * 其中包括： final基本数据类型 final引用
 * 
 * @author Administrator
 *
 */

class ProduceInt {
	private int i;

	public ProduceInt(int i) {
		// TODO Auto-generated constructor stub
		this.i = i;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ProduceInt:" + i;
	}
}

class WithoutFinal {
	public int count1;
	public static int count2;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "count1:" + count1 + " ;count2:" + count2;
	}
}

class WithFinal {
	// final基类类型数据必须进行初始化
	public final int count1 = 33;
	public static final int count2 = 44;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "count1:" + count1 + " ;count2:" + count2;
	}
}

public class _7_18_StaticFinalandFinal {
	public static void main(String[] args) {
		WithoutFinal wof1 = new WithoutFinal();
		wof1.count1 = 11;
		wof1.count2 = 22;
		System.out.println(wof1);

		WithoutFinal wof2 = new WithoutFinal();
		wof2.count1 = 88;
		wof2.count2 = 99;
		System.out.println(wof2);

		WithFinal wof3 = new WithFinal();
		// wof3.count1; //无法修改
		System.out.println(wof3);
	}
}

/*
count1:11 ;count2:22
count1:88 ;count2:99
count1:33 ;count2:44
*/
