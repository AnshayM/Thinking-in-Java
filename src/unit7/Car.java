package unit7;

/**
 * 在Car.java文件中，给Engine添加一个service()方法，并在main()中调用这个方法；
 * 
 * @author Administrator
 *
 */

class Engine {
	public void start() {
	}

	public void rev() {
	}

	public void stop() {
	}

	public void service() {
		System.out.println("Engine.service()");
	}// 添加service方法
}

class Wheel {
	public void inflate(int psi) {
	}
}

class Window {
	public void rollup() {
	}

	public void rolldown() {
	}
}

class Door {
	public Window window = new Window(); // 使用技能：组合；在新类中产生基类的一个新的对象，同时添加新的方法；

	public void open() {
	}

	public void close() {
	}
}

public class Car {
	public Engine engine = new Engine();
	public Wheel[] wheels = new Wheel[4];
	public Door left = new Door(), right = new Door(); // 我们只关注车门，不关注车门上的窗户。所以，用户只用知道新类所定义的接口即可，不需要知道嵌入类对象的接口

	public Car() {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < 4; i++) {
			wheels[i] = new Wheel();
		}
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.left.window.rollup();
		car.wheels[0].inflate(72);

		car.engine.service();
		// engine.service();
		//public static void Engine engine=new
		// Engine();这样才能使用
	}
}
