package unit8;
/**
 * 协变返回类型，他表示在导出类中的被覆盖方法可以返回基类方法的返回类型的某种导出类型；
 * 
 * @author Administrator
 *
 */
class Grain {
	@Override
	public String toString() {
		return "Grain";
	}
}

class Wheat extends Grain {
	@Override
	public String toString() {
		return "Wheat";
	}
}

class Mill {
	Grain process() {
		return new Grain();
	}
}

class WheatMill extends Mill {
	Wheat process() {
		return new Wheat();
	}
}

public class ConvariantReturn {
	public static void main(String[] args) {
		Mill mill = new Mill();
		Grain grain = mill.process();
		System.out.println(grain);
		mill = new WheatMill();
		grain = mill.process();
		System.out.println(grain);
	}
}
