package unit8.music;

public class Music {
	public static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	
	public static void main(String[] args) {
		Wind flute=new Wind();
		tune(flute);	//设计良好的OOP程序中，大多数或者所有的方法都遵循tune()的模型，而且只与基类接口通信
	}
}
/*
Wind.play() MIDDLE_C
 * */
