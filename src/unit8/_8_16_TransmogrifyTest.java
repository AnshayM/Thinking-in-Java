package unit8;

class AlertStatus {
	public void act() {

	}
}

class RedAlert extends AlertStatus {
	@Override
	public void act() {
		System.out.println("RedAlert");
	}
}

class GreenAlert extends AlertStatus {
	@Override
	public void act() {
		System.out.println("GreenAlert");
	}
}

class YellowAlert extends AlertStatus {
	@Override
	public void act() {
		System.out.println("YellowAlert");
	}
}

class Controler {
	private AlertStatus as = new RedAlert();

	public void changeYellowState() {
		as = new YellowAlert();
	}

	public void changeRedState() {
		as = new RedAlert();
	}

	public void chageGreenState() {
		as = new GreenAlert();
	}

	public void showState() {
		as.act();
	}
}

public class _8_16_TransmogrifyTest {
	public static void main(String[] args) {
		Controler c = new Controler();
		c.showState();
		c.changeYellowState();
		c.showState();
		c.chageGreenState();
		c.showState();
	}
}

/*
RedAlert
YellowAlert
GreenAlert

 */