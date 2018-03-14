package unit5ex;

class Test2{
	public Test2() {
		System.out.println("為這個類創建了一個對象");
	}
	
	public Test2(String s){
		System.out.println(s);
	}
}

public class _5_4_default_constructor {
	public static void main(String[] args){
		new Test2("hahahahha");
	}
}
