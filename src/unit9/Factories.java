package unit9;

interface Service {
	void method1();

	void method2();
}

interface ServiceFactory {
	Service getService();
}

class Implication implements Service {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("implication method1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("implication method2");
	}

}

class ImplicationFactory implements ServiceFactory {

	@Override
	public Service getService() {
		// TODO Auto-generated method stub
		return new Implication();
	}
}

class Implication2 implements Service {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("implication2 method1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("implication2 method2");
	}

}

class ImplicationFactory2 implements ServiceFactory {

	@Override
	public Service getService() {
		// TODO Auto-generated method stub
		return new Implication2();
	}
}

public class Factories {
	public static void serviceConsumer(ServiceFactory fact) {
		Service service = fact.getService();
		service.method1();
		service.method2();
	}

	public static void main(String[] args) {
		serviceConsumer(new ImplicationFactory());
		serviceConsumer(new ImplicationFactory2());
	}
}

/**
 *
 implication method1
implication method2
implication2 method1
implication2 method2

 */