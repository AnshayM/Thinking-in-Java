package unit7;

public class _7_2_DetergentExtends extends Detergent {
	@Override
	public void scrub() {
		// TODO Auto-generated method stub
		System.out.println("DetergentExtends.scrub()");
		super.scrub();	//覆盖了基类的方法，且没有执行基类的方法
	}
	
	public void sterilize(){
		System.out.println("DetergentExtends.sterilize()");
	}
	
	public static void main(String[] args) {
		_7_2_DetergentExtends x=new _7_2_DetergentExtends();
		x.scrub();
		x.sterilize();
		System.out.println(x);	//首先找到最基类的toString()，然后是父类Detergent，再是父类的父类Cleanser
		Cleanser.main(args);
	}
}
/*
DetergentExtends.scrub()
DetergentExtends.sterilize()
cleanser Detergent.scrub() Cleanser.scrub()
cleanser  dilute() apply() Cleanser.scrub()

 */
