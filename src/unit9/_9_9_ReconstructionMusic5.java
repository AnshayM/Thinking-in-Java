package unit9;

import unit8.music.Note;

/**
 * 重构Music5.java,将在Wind，Percussion和Stringed中的公共方法移入一个抽象类中
 * 
 * @author Administrator
 *
 */
abstract class Meth{
	abstract void play(Note n);
	abstract void adjust();
}

class Winds9 extends Meth{

	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		System.out.println(this + ".play()" + n);
	}

	@Override
	public void adjust() {
		// TODO Auto-generated method stub
		System.out.println(this + ".adjust()");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Wind";
	}
}

class Percussions9 extends Meth{
	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		System.out.println(this + ".play()" + n);
	}

	@Override
	public void adjust() {
		// TODO Auto-generated method stub
		System.out.println(this + ".adjust()");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Percussion";
	}
}

class Stringeds9 extends Meth{

	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		System.out.println(this + ".play()" + n);
	}

	@Override
	public void adjust() {
		// TODO Auto-generated method stub
		System.out.println(this + ".adjust()");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Striingeds";
	}
}

class Brasss9 extends Winds9  { 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Brass";
	}
}

class WoodWinds9 extends Winds9  { 
														
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "WoodWind";
	}
}

public class _9_9_ReconstructionMusic5 {
	static void tune(Meth m){
		m.play(Note.MIDDLE_C);
	}
	
	static void tuneAll(Meth[] m){
		for (Meth meth : m) {
			tune(meth);
		}
	}
	
	public static void main(String[] args) {
		Meth []meths ={new Winds9(),new Percussions9(),new Stringeds9(),new Brasss9(),new WoodWinds9()};
		tuneAll(meths);
	}
}

/*
Wind.play()MIDDLE_C
Percussion.play()MIDDLE_C
Striingeds.play()MIDDLE_C
Brass.play()MIDDLE_C
WoodWind.play()MIDDLE_C

*/