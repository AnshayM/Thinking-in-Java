package unit7;

class Plate {
	public Plate(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Plate Constructor");
	}
}

class DinnerPlate extends Plate {
	public DinnerPlate(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		System.out.println("DinnerPlate Constructor");
	}

}

class Utensil {
	public Utensil(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Utensil Constructor");
	}
}

class Spoon extends Utensil {
	public Spoon(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		System.out.println("Spoon Constructor");
	}
}

class Fork extends Utensil {
	public Fork(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		System.out.println("Fork Constructor");
	}
}

class Knife extends Utensil {
	public Knife(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		System.out.println("Knife Constructor");
	}
}

class Custom {
	public Custom(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Custom Constructor");
	}
}

public class PlaceSetting extends Custom {

	private Spoon sp;
	private Fork frk;
	private Knife kn;
	private DinnerPlate pl;

	public PlaceSetting(int i) {
		super(i + 1);
		// TODO Auto-generated constructor stub
		sp = new Spoon(i + 2);
		frk = new Fork(i + 3);
		kn = new Knife(i + 4);
		pl = new DinnerPlate(i + 5);
		System.out.println("PlaceSetting Constructor");
	}
	
	public static void main(String[] args) {
		PlaceSetting x=new PlaceSetting(9);
	}
}


/*
Custom Constructor
Utensil Constructor
Spoon Constructor
Utensil Constructor
Fork Constructor
Utensil Constructor
Knife Constructor
Plate Constructor
DinnerPlate Constructor
PlaceSetting Constructor 
 */