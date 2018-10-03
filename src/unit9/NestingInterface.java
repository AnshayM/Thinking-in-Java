package unit9;

class A {
	interface B {
		void f();
	}

	public class Bimp implements B {

		@Override
		public void f() {
			// TODO Auto-generated method stub

		}

	}

	public interface C {
		void f();
	}

	class Cimp implements C {
		@Override
		public void f() {
			// TODO Auto-generated method stub

		}
	}

	private class Cimp2 implements C {

		@Override
		public void f() {
			// TODO Auto-generated method stub

		}

	}

	private interface D {
		void f();
	}

	private class Dimp implements D {

		@Override
		public void f() {
			// TODO Auto-generated method stub

		}

	}

	public class Dimp2 implements D {

		@Override
		public void f() {
			// TODO Auto-generated method stub

		}

	}

	public D getD() {
		return new Dimp();
	}

	private D dRef;

	public void receiveD(D d) {
		dRef = d;
		dRef.f();
	}
}

interface E {
	interface G {
		void f();
	}

	public interface H {
		void f();
	}

	void g();

	// private interface I{} // interface 内部必须全部是public，不能使用private
}

public interface NestingInterface {
	public class Bimp implements A.B {

		@Override
		public void f() {
			// TODO Auto-generated method stub

		}
	}

	class Cimp implements A.C {

		@Override
		public void f() {
			// TODO Auto-generated method stub

		}

	}

	// class Dimp implements A.D{} //class A内部的interface D是private的，无法implement

	class Eimp implements E {

		@Override
		public void g() {
			// TODO Auto-generated method stub

		}

	}

	class EGimp implements E.G {

		@Override
		public void f() {
			// TODO Auto-generated method stub

		}

	}

	class Eimp2 implements E {

		@Override
		public void g() {
			// TODO Auto-generated method stub

		}

		class EG implements E.G {

			@Override
			public void f() {
				// TODO Auto-generated method stub

			}

		}

	}

	public static void main(String[] args) {
		A a = new A();
		A a2 = new A();
		a2.receiveD(a.getD());
	}
}
