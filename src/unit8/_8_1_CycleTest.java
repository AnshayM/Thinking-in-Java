package unit8;

/**
 * 创建一个Cycle类，它具有子类Unicycle,Bicycle和Tricycle。演示每一个类型的实例都可以经由ride()方法向上转型为Cycle
 * 
 * @author Administrator
 *
 */

class Cycle {
	private int wheels;

	public Cycle(int wheels) {
		// TODO Auto-generated constructor stub
		this.wheels = wheels;
	}

	public void wheels() {
		System.out.println(wheels);
	}
}

class Unicycle extends Cycle {
	public Unicycle(int wheels) {
		super(wheels);
		System.out.print("Unicycle.wheels = ");
	}
}

class Bicycle extends Cycle {
	public Bicycle(int wheels) {
		super(wheels);
		// TODO Auto-generated constructor stub
		System.out.print("Bicycle.wheels = ");
	}
}

class Tricycle extends Cycle {
	public Tricycle(int wheels) {
		super(wheels);
		// TODO Auto-generated constructor stub
		System.out.print("Tricycle.wheels = ");
	}
}

public class _8_1_CycleTest {
	public static void ride(Cycle c) {
		c.wheels();
	}

	public static void main(String[] args) {
		Unicycle u = new Unicycle(1);
		ride(u);

		Bicycle b = new Bicycle(2);
		ride(b);

		Tricycle t = new Tricycle(3);
		ride(t);
	}
}

/*
Unicycle.wheels = 1
Bicycle.wheels = 2
Tricycle.wheels = 3

 */



//package unit8;
//
///**
// * 创建一个Cycle类，它具有子类Unicycle,Bicycle和Tricycle。演示每一个类型的实例都可以经由ride()方法向上转型为Cycle
// * 
// * @author Administrator
// *
// */
//
//class Cycle{
//	public void haha(){
//		System.out.println("Cycle.ride()");
//	}
//}
//
//class Unicycle extends Cycle{
//	@Override
//	public void haha() {
//		System.out.println("Unicycle.ride()");
//	}
//}
//
//class Bicycle extends Cycle{
//	@Override
//	public void haha() {
//		System.out.println("Bicycle.ride()");
//	}
//	
//}
//
//class Tricycle extends Cycle{
//	@Override
//	public void haha() {
//		System.out.println("Tricycle.ride()");
//	}
//}
//public class _8_1_CycleTest {
//	public static void ride(Cycle c){
//		c.haha();
//	}
//	
//	public static void main(String[] args) {
//		Unicycle u=new Unicycle();
//		Bicycle b=new Bicycle();
//		Tricycle t=new Tricycle();
//		//u.ride();
//		ride(u);
//		ride(b);
//		ride(t);
//	}
//}
//
//
///*
//Unicycle.ride()
//Bicycle.ride()
//Tricycle.ride()
//
// * */