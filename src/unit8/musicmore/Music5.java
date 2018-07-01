package unit8.musicmore;

import org.omg.CORBA.PUBLIC_MEMBER;

import unit8.music.Note;

/**
 * 修改Music3，使其添加一个新的类型Instrument，并验证多态性是否作用于所添加对象
 * 
 * @author Administrator
 *
 */
public class Music5 {
	public static void tune(Instrument i){
		i.play(Note.C_SHARP);
		i.adjust();
		i.what();
	}
	public static void main(String[] args) {
		tune(new NewInstrument());
		System.out.println(new NewInstrument());
	}
}

/*
NewInstrument.play()C_SHARP
Adjusting NewInstrument
NewInstrument
 */