package unit9;

/**
 * 使用工厂方法来创建一个框架，它可以执行抛硬币和掷骰子功能。
 * 
 * 以下代码只是一个框架，没有具体编写如何实现这两个功能。
 * 
 * @author Administrator
 *
 */
interface Game {
	void play();
}

interface GameFactory {
	Game getGame();
}

class RingOiler implements Game {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("RingOiler play()");
	}

}

class Throw implements Game {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Throw play()");
	}

}

class RingOilerFactory implements GameFactory {

	@Override
	public Game getGame() {
		// TODO Auto-generated method stub
		return new RingOiler();
	}

}

class ThrowFactory implements GameFactory {

	@Override
	public Game getGame() {
		// TODO Auto-generated method stub
		return new Throw();
	}

}

public class E9_19_GameFactory {
	public static void playGame(GameFactory g) {
		Game game = g.getGame();
		game.play();
	}

	public static void main(String[] args) {
		playGame(new RingOilerFactory());
		playGame(new ThrowFactory());
	}
}

/*
 * RingOiler play() Throw play()
 * 
 */
