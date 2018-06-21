package unit7;

/**
 * 如果没有默认的基类构造器，或者想调用一个带参数的基类构造器，就必须使用super显示地调用基类构造器的语句，
 * 
 * 并且配以适当的参数列表
 * 
 * @author Administrator
 *
 */
class Game {
	public Game(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Game Constructor");
	}
}

class BoardGame extends Game {
	public BoardGame(int i) {
		super(i);
		// TODO Auto-generated constructor stub
		System.out.println("BoardGame");
	}
}

public class Chess extends BoardGame {
	Chess() {
		super(11);
		System.out.println("Chess Constructor");
	}

	public static void main(String[] args) {
		Chess x = new Chess();
	}
}

/*
 * Game Constructor BoardGame Chess Constructor
 * 
 */