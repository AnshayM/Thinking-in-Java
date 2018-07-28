package unit9;

import unit8.music.Note;

interface Instruments {
	int VALUE = 5;

	void play(Note n);

	void adjust();
}

class Winds implements Instruments {
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

class Percussions implements Instruments {

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

class Striingeds implements Instruments {

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

class Brasss extends Wind implements Instruments { // 这里必须implements Instrument。
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Brass";
	}
}

class WoodWinds extends Wind implements Instruments { // 这里必须implements
														// Instrument。
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "WoodWind";
	}
}

public class Music5 {
	static void tune(Instruments i) {
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Instruments[] e) {
		for (Instruments i : e) {
			tune(i);
		}
	}

	public static void main(String[] args) {
		Instruments[] orchestra = { new Winds(), new Percussions(), new Striingeds(), new Brasss(), new WoodWinds() };
		tuneAll(orchestra);
	}
}

/*
Wind.play()MIDDLE_C
Percussion.play()MIDDLE_C
Striingeds.play()MIDDLE_C
Wind.play() MIDDLE_C
Wind.play() MIDDLE_C
 */