package unit8;

public class Music {
	public static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	
	public static void main(String[] args) {
		Wind flute=new Wind();
		tune(flute);
	}
}
/*
Wind.play() MIDDLE_C
 * */