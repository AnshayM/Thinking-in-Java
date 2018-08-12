package unit9;
/**
 * 证明接口内的所有方法都是自动public的
 * 
 * @author Administrator
 *
 */
interface InterfaceTest{
	void m1();
	public void m2();

	//private void m3();
	//Illegal modifier for the interface method m3; 
	//only public, abstract, default, static and 
	//strictfp are permitted
}

public class _9_6_InterfaceIsAutoPublic {
	
}
/*
通过编译器可以证明，是否添加public均可以通过编译，但是设置为private无法通过编译
 */
