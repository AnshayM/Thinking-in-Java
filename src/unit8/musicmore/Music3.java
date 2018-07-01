package unit8.musicmore;

import unit8.music.Note;

class Instrument {
	void play(Note n) {
		System.out.println("Instrument.play()" + n);
	}

	String what() {
		return "Instrument:";
	}

	void adjust() {
		System.out.println("Adjusting Instrument");
	}

	//修改Music3，使what()方法成为根Object的toString()方法。
	//添加一个toString()方法，调用当前what()方法
	//子类会自动继承该方法并分别返给自己what()里面的内容
	@Override
	public String toString() {
		
		return what();
	}
}

class Wind extends Instrument {
	@Override
	void play(Note n) {
		
		System.out.println("Wind.play() " + n);
		// super.play(n);
	}

	@Override
	String what() {
		
		return "Wind:";
	}

	@Override
	void adjust() {
		
		System.out.println("Adjusting Wind");
		super.adjust();
	}
}

class Percussion extends Instrument {
	@Override
	void play(Note n) {
		
		System.out.println("Percussion.play() " + n);
		// super.play(n);
	}

	@Override
	String what() {
		
		return "Percussion:";
	}

	@Override
	void adjust() {
		
		System.out.println("Adjusting Percussion ");
		super.adjust();
	}
}

class Stringed extends Instrument {
	@Override
	void play(Note n) {
		
		System.out.println("Stringed.play() " + n);
		// super.play(n);
	}

	@Override
	String what() {
		
		return "Stringed:";
	}

	@Override
	void adjust() {
		
		System.out.println("Adjusting Stringed ");
		super.adjust();
	}
}

class Brass extends Wind {
	@Override
	void play(Note n) {
		
		System.out.println("Brass.play()" + n);
		// super.play(n);
	}

	@Override
	void adjust() {
		
		System.out.println("Adjusting Brass ");
		super.adjust();
	}
}

class WoodWind extends Wind {
	@Override
	void play(Note n) {
		
		System.out.println("WoodWind.play()" + n);
		// super.play(n);
	}

	@Override
	String what() {
		
		return "WoodWind: ";
	}
}


//創建一種新的Instrument，驗證多態性是否作用于所有添加的對象
class NewInstrument extends Instrument{
	@Override
	void play(Note n) {
		System.out.println("NewInstrument.play()"+n);
	}
	
	@Override
	String what() {
		return "NewInstrument";
	}
	
	@Override
	void adjust() {
		System.out.println("Adjusting NewInstrument");
	}
}

public class Music3 {
	public static void tune(Instrument i) {
		
		i.play(Note.MIDDLE_C);
	}

	public static void tuneAll(Instrument[] e) {
		for (Instrument instrument : e) {
			tune(instrument);
		}
	}

	public static void main(String[] args) {
		Instrument[] orchestra = { new Wind(), new Percussion(), new Stringed(), new Brass(), new WoodWind() };
		tuneAll(orchestra);
	}
}

/*
 * 
 * 
 * Wind.play() MIDDLE_C Instrument.play()MIDDLE_C Percussion.play() MIDDLE_C
 * Instrument.play()MIDDLE_C Stringed.play() MIDDLE_C Instrument.play()MIDDLE_C
 * Brass.play()MIDDLE_C Wind.play() MIDDLE_C Instrument.play()MIDDLE_C
 * WoodWind.play()MIDDLE_C Wind.play() MIDDLE_C Instrument.play()MIDDLE_C
 * 
 * 应该将所有的继承类的play()的super方法全部删除 Wind.play() MIDDLE_C Percussion.play() MIDDLE_C
 * Stringed.play() MIDDLE_C Brass.play()MIDDLE_C WoodWind.play()MIDDLE_C
 * 
 */
