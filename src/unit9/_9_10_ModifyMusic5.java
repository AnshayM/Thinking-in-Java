package unit9;

import unit8.music.Note;
/**
 * 修改Music5.java，添加Playable接口。将play()的声明
 * 从Instrument中移到playable中。通过将playable包括在
 * implement列表中，把Playable添加到导出类中。
 * 修改tune(),使它接受Playable而不是Instrument作为参数；
 * @author Administrator
 *
 */
interface Playable{
	void play(Note n);
}

interface Instruments10 {
	int VALUE = 5;
	void adjust();
}

class Winds10 implements Playable,Instruments10{
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

class Percussions10 implements Instruments,Playable {

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

class Striingeds10 implements Instruments,Playable {

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

class Brasss10 extends Wind implements Instruments,Playable {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Brass";
	}
}

class WoodWinds10 extends Wind implements Instruments,Playable { 
														
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "WoodWind";
	}
}


public class _9_10_ModifyMusic5 {
	static void tune(Playable p){
		p.play(Note.MIDDLE_C);
	}
	
	static void tuneAll(Playable[] ps){
		for (Playable playable : ps) {
			tune(playable);
		}
	}
	
	public static void main(String[] args) {
		Playable[] orchestra = { new Winds10(), new Percussions10(), new Striingeds10(), new Brasss10(), new WoodWinds10() };
		tuneAll(orchestra);
	}
}

/*
Wind.play()MIDDLE_C
Percussion.play()MIDDLE_C
Striingeds.play()MIDDLE_C
Wind.play() MIDDLE_C
Wind.play() MIDDLE_C

 * */
