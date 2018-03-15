package unit5ex;

class TestTwoConstrictor{
	String str;
	public TestTwoConstrictor() {
		// TODO Auto-generated constructor stub
		this(12,"hahaha");
		//调用构造器中，this，将参数传递到符合的构造器中
//		this("haha");	//不能使用两个this
	}
	
	public TestTwoConstrictor(int i,String s){
		this(s);
		System.out.println("Non arguments Constructor  "+i);
//		this(s);	//Constructor call must be the first statement in a constructor
	}
	
	public TestTwoConstrictor(String s){
		System.out.println("Non arguments Constructor  "+s);
	}
	
}

public class _5_9_TwoConstructor {
	public static void main(String[] args) {
		new TestTwoConstrictor();
	}
}
