package unit9;

abstract class AbsNoMehthod {

}

class HasMethod extends AbsNoMehthod {
	public void play() {
		System.out.println("HasMethid.play()");
	}

	public static void staMethod(AbsNoMehthod hMethod) {
		hMethod = new HasMethod();// 向下转型
	}
}

public class _9_4_AbsTest {
	public static void main(String[] args) {
		AbsNoMehthod a=new HasMethod();
		HasMethod.staMethod(a);
	}
}
