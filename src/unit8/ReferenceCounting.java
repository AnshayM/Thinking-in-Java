package unit8;

/**
 * 引用记数
 * 
 * @author Administrator
 *
 */
class Shared {
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;

	public Shared() {
		// TODO Auto-generated constructor stub
		// System.out.println(this);
		System.out.println("Creating " + this); // 这个this指的是
	}

	public void addRef() {
		refcount++;
	}

	protected void dispose() {
		// TODO Auto-generated method stub
		if (--refcount == 0) {
			System.out.println("Disposing " + this);
		}
	}

	@Override
	public String toString() {
		return "Shared " + id;
	}

	@Override
	protected void finalize() throws Throwable {
		if (--refcount != 0) {
			return;
		} else {
			super.finalize();
		}
	}

	public int getRefcount() {
		return refcount;
	}
}

class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;

	public Composing(Shared shared) {
		// TODO Auto-generated constructor stub
		System.out.println("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}

	protected void dispose() {
		System.out.println("Disposing " + this);
		shared.dispose();
	}

	// 判断记数
	@Override
	protected void finalize() throws Throwable {
		if (shared.getRefcount() != 0) {
			System.out.println("can't finalize now");
		} else {
			System.out.println("finalize now");
			super.finalize();
		}
	}

	@Override
	public String toString() {
		return "Composing " + id;
	}
}

public class ReferenceCounting {
	public static void main(String[] args) throws Throwable {
		Shared shared = new Shared();
		Composing[] composings = { new Composing(shared), new Composing(shared), new Composing(shared),
				new Composing(shared), new Composing(shared) };
		for (Composing c : composings) {
			c.dispose();
			c.finalize();// 调用finalize
		}
		System.gc();
	}
}

/*
 * Creating Shared 0 Creating Composing 0 Creating Composing 1 Creating
 * Composing 2 Creating Composing 3 Creating Composing 4 Disposing Composing 0
 * can't finalize now Disposing Composing 1 can't finalize now Disposing
 * Composing 2 can't finalize now Disposing Composing 3 can't finalize now
 * Disposing Composing 4 Disposing Shared 0 finalize now
 * 
 */