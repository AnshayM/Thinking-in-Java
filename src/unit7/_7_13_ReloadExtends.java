package unit7;

class Reload {
	char doh(char c) {
		System.out.println("doh(char))");
		return 'd';
	}
	
	int doh(int i){
		System.out.println("doh(int)");
		return 1314;
	}
	
	float doh(float f){
		System.out.println("doh(float)");
		return 3.14f;
	}
}

class ReloadExtends extends Reload{
	void doh(){
		System.out.println("doh(void)");
	}
}

public class _7_13_ReloadExtends {
	public static void main(String[] args) {
		ReloadExtends x=new ReloadExtends();
		x.doh();
		x.doh('1');
		x.doh(1.0f);
		x.doh(2);
	}
}

/*
doh(void)
doh(char))
doh(float)
doh(int)

 */