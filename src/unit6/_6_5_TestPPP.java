package unit6;

import personaUtils.Print;
import unit6t.TestPackage;

/**
 * 创建一个带有public,private,protected和包访问权限的域以及方法成员的类
 * 
 * 创建该类的一个成员，看看视图在调用所有类成员时，编译信息
 * 
 * @author Administrator
 *
 */
public class _6_5_TestPPP {

	
	public static void main(String[] args) {
		PPP test=new PPP();
		test.tPublic();
		test.tProtected();
		test.tPack();
		//test.tPrivate();//无法访问
		
	}
}

class PPP{
	public void tPublic(){
		Print.printb("tPublic");
	}
	
	private void tPrivate(){
		Print.printb("tPrivate");
	}
	
	void tPack(){
		Print.printb("tPack(");
	}
	
	protected void tProtected(){
		Print.printb("tProtected");
	}
}
