package unit8;

/**
 * 
 * @author Administrator
 *
 */

class Super {
	public int field = 0;

	public int getFileld() {
		return field;
	}
}

class Sub extends Super {
	public int field = 1;

	public int getFiled() {
		return field;
	}

	public int getSuperField() {
		return super.field;
	}
}

public class FieldAccess {
	public static void main(String[] args) {
		Super sup = new Sub();
		System.out.println("sup.field = " + sup.field + " ,sup.getFiled() =" + sup.getFileld());

		Sub sub = new Sub();
		System.out.println("sub.field = " + sub.field + " , sub.getFiled() = " + sub.getFileld()
				+ ", sub.getSuperFiled() = " + sub.getSuperField());
	}
}

/*
 * 
 * 和书本给出的答案不同
sup.field = 0 ,sup.getFiled() =0
sub.field = 1 , sub.getFiled() = 0, sub.getSuperFiled() = 0

 * 
 * 
 */
