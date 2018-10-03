package unit9;

/**
 * 创建一个Cycle接口，及其Unicycle，Bicycle，Tricycle实现。
 * 
 * 对每个类型的Cycle都创建相应的工厂，然后编写代码使用这些工厂。
 * 
 * @author Administrator
 *
 */
interface Cycle {
	void func();
}

interface CycleFactory {
	Cycle getCycle();
}

class Unicycle implements Cycle {

	@Override
	public void func() {
		// TODO Auto-generated method stub
		System.out.println("Unicycle func()");
	}

}

class UnicycleFactory implements CycleFactory {

	@Override
	public Cycle getCycle() {
		// TODO Auto-generated method stub
		return new Unicycle();
	}

}

class Bicycle implements Cycle {

	@Override
	public void func() {
		// TODO Auto-generated method stub
		System.out.println("Bicycle func()");
	}

}

class BicycleFactory implements CycleFactory {

	@Override
	public Cycle getCycle() {
		// TODO Auto-generated method stub
		return new Bicycle();
	}

}

class Tricycle implements Cycle {

	@Override
	public void func() {
		// TODO Auto-generated method stub
		System.out.println("Tricycle func()");
	}

}

class TricycleFactory implements CycleFactory {

	@Override
	public Cycle getCycle() {
		// TODO Auto-generated method stub
		return new Tricycle();
	}

}

public class E9_18_UseFactory {
	public static void useCycle(CycleFactory c) {
		Cycle cycle = c.getCycle();
		cycle.func();
	}

	public static void main(String[] args) {
		useCycle(new UnicycleFactory());
		useCycle(new BicycleFactory());
		useCycle(new TricycleFactory());
	}
}

/*
Unicycle func()
Bicycle func()
Tricycle func()

 */