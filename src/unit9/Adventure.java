package unit9;

/**
 * Java组合继承
 * 
 * @author Administrator
 *
 */
interface CanFight {
	void fight();
}

interface CanSwim {
	void swim();
}

interface CanFly {
	void fly();
}

interface CanRun {
	void run();
}

class ActionCharacter {
	public void fight() {
		System.out.println("ActionCharacter.fight()");
	}
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanRun {
	// 因为已经在ActionCharacter中覆写了fight()，所以在类Hero中就没有继续实现了。否则造成覆盖，失去意义
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Hero fly");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("Hero swim");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hero Run");
	}

}

public class Adventure {
	public static void t(CanFight x) {
		x.fight();	//x.fight()会执行ActionCharacter中的fight()，
		//所以结果中会出现两次fight输出
	}

	public static void u(CanSwim x) {
		x.swim();
	}

	public static void v(CanFly x) {
		x.fly();
	}

	public static void y(CanRun x) {
		x.run();
	}

	public static void w(ActionCharacter x) {
		x.fight();
	}

	public static void main(String[] args) {
		Hero h = new Hero();
		t(h);
		u(h);
		v(h);
		y(h);
		w(h);
	}
}

/*
output:
ActionCharacter.fight()
Hero swim
Hero fly
Hero Run
ActionCharacter.fight()

 * */
