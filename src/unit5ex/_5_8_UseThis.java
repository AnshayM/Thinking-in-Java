package unit5ex;

class TwoMethods{
	void firstMethod(){
		secondMethod();
		this.secondMethod();
	}
	
	int i;
	void secondMethod(){
		System.out.println(i++);
	}
}

public class _5_8_UseThis {
	public static void main(String[]args){
		new TwoMethods().firstMethod();;
	}
}
