package unit9;

import unit8.music.Note;

abstract class Instrument {
	private int i;

	public abstract void play(Note n);

	public String what() {
		return "Instrument";
	}

	public abstract void adjust();
}

class Wind extends Instrument {

	@Override
	public void play(Note n) {
		System.out.println("Wind.play() " + n);
	}

	@Override
	public String what() {
		return "Wind";
	}

	@Override
	public void adjust() {

	}
}

class Percussion extends Instrument {

	@Override
	public void play(Note n) {
		System.out.println("Percussion.play() " + n);
	}

	@Override
	public String what() {
		return "Percussion";
	}

	@Override
	public void adjust() {

	}

}

class Stringed extends Instrument {
	@Override
	public void play(Note n) {
		System.out.println("Stringed.play() " + n);
	}

	@Override
	public String what() {
		return "Stringed";
	}

	@Override
	public void adjust() {

	}
}

class Brass extends Wind {
	public void play(Note n) {
		System.out.println("Brass.play() " + n);
	}

	public void adjust() {
		System.out.println("Brass.adjust()");
	}
}

class WoodWind extends Wind {
	public void play(Note n) {
		System.out.println("WoodWind.play() " + n);
	}

	@Override
	public String what() {
		return "WoodWind";
	}
}

public class Music4 {
	// 多态的运用
	static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Instrument[] i) {
		for (Instrument instrument : i) {
			tune(instrument);
		}
	}

	public static void main(String[] args) {
		Instrument[] o = { new Wind(), new Percussion(), new Stringed(), new Brass(), new WoodWind() };
		tuneAll(o);
	}
}


/*
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
WoodWind.play() MIDDLE_C
gh
 */