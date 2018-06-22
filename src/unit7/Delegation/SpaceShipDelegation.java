package unit7.Delegation;

public class SpaceShipDelegation {
	private String name;
	private SapceShipControls controls = new SapceShipControls();

	public SpaceShipDelegation(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	void up(int velecity) {
		controls.back(velecity);
	}

	void down(int velecity) {
		controls.down(velecity);
	}

	void left(int velecity) {
		controls.left(velecity);
	}

	void right(int velecity) {
		controls.right(velecity);
	}

	void forward(int velecity) {
		controls.forward(velecity);
		System.out.println(velecity);
	}

	void back(int velecity) {
		controls.back(velecity);
	}

	void turboBoost() {
		controls.turboBoost();
	}

	public static void main(String[] args) {
		SpaceShipDelegation protector = new SpaceShipDelegation("NSEA Protector");
		protector.forward(100);
		System.out.println(protector.getClass());
	}
}
