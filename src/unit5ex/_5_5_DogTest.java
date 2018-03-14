package unit5ex;

class Dog{
	public void bark(String s){
		System.out.println("barking");
	}
	
	public void bark(int i){
		System.out.println("howling");
	}
	
	public void bark(Double f){
		System.out.println("etc");
	}
	
}

public class _5_5_DogTest {
	public static void main(String[] args){
		Dog dog = new Dog();
		dog.bark(1.0);
		dog.bark(" ");
		dog.bark(1);
	}
}
