package unit5ex;

class Dog2{
	public void bark(String s,int i){
		System.out.println("barking");
	}
	
	public void bark(int i,String s){
		System.out.println("howling");
	}
	
	public void bark(Double f){
		System.out.println("etc");
	}
	
}

public class _5_6_DogTest {
	public static void main(String[] args){
		Dog2 dog = new Dog2();
		dog.bark(1.0);
		dog.bark(" ",1);
		dog.bark(1," ");
	}
}
