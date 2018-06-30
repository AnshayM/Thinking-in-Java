package unit8;

/**
 * 创建一个Cycle类，它具有子类Unicycle,Bicycle和Tricycle。演示每一个类型的实例都可以经由ride()方法向上转型为Cycle
 * 
 * @author Administrator
 *
 */

class Cycle{
	public void haha(){
		System.out.println("Cycle.ride()");
	}
}

class Unicycle extends Cycle{
	@Override
	public void haha() {
		System.out.println("Unicycle.ride()");
	}
}

class Bicycle extends Cycle{
	@Override
	public void haha() {
		System.out.println("Bicycle.ride()");
	}
	
}

class Tricycle extends Cycle{
	@Override
	public void haha() {
		System.out.println("Tricycle.ride()");
	}
}
public class _8_1_CycleTest {
	public static void ride(Cycle c){
		c.haha();
	}
	
	public static void main(String[] args) {
		Unicycle u=new Unicycle();
		Bicycle b=new Bicycle();
		Tricycle t=new Tricycle();
		//u.ride();
		ride(u);
		ride(b);
		ride(t);
	}
}


/*
Unicycle.ride()
Bicycle.ride()
Tricycle.ride()

 * */
