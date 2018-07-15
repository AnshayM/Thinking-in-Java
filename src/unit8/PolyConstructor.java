package unit8;

class  Glyph{
	void draw(){
		System.out.println("Glyph.draw()");
	}
	
	public Glyph() {
		// TODO Auto-generated constructor stub
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}

/*
 * 首先调用基类的构造器，但是基类中又调用了子类已经覆写过的方法，这就造成基类调用的方法，其实是子类中的方法
 * 同时基类中的成员只能实现默认初始化，和程序员自己认为的效果相差很大；
 */
class RoundGlyph extends Glyph{
	private int radius=1;
	public RoundGlyph(int r) {
		// TODO Auto-generated constructor stub
		radius=r;
		System.out.println("RoundGlyph.RoundGlphy().radius="+radius);
	}
	
	void draw(){
		System.out.println("GroundGlyph.draw().radius="+radius);
	}
}
public class PolyConstructor {
	public static void main(String[] args) {
		new RoundGlyph(5);
	}
}

/*
Glyph() before draw()
GroundGlyph.draw().radius=0
Glyph() after draw()
RoundGlyph.RoundGlphy().radius=5

 */