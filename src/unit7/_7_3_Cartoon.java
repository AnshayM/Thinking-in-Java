package unit7;

class Art {
	Art() {
		// TODO Auto-generated constructor stub
		System.out.println("Art Constructor");
	}
}

class Drawing extends Art {
	Drawing() {
		// TODO Auto-generated constructor stub
		System.out.println("Drawing Constructor");
	}
}

public class _7_3_Cartoon extends Drawing{
	public _7_3_Cartoon() {
		// TODO Auto-generated constructor stub
		System.out.println("Cartoon Constructor");
	}
	
	public static void main(String[] args) {
		_7_3_Cartoon x=new _7_3_Cartoon();
	}

}
