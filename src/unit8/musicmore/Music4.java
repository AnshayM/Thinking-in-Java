package unit8.musicmore;

import unit8.music.Note;

/**
 * 修改Music3，使what()方法成为根Object的toString()方法。
 * 
 * 试用System.out.println()方法打印Instrument对象（不用向上转型）
 * 
 * @author Administrator
 *
 */
public class Music4 {
	public static void main(String[] args) {
		Instrument[] orchestra = { new Wind(), new Percussion(), new Stringed(), new Brass(), new WoodWind() };
		for (Instrument instrument : orchestra) {
			System.out.println(instrument);
		}
	}
}

/*
Wind:
Percussion:
Stringed:
Wind:
WoodWind


	//修改Music3，使what()方法成为根Object的toString()方法。
	//添加一个toString()方法，调用当前what()方法
	//子类会自动继承该方法并分别返给自己what()里面的内容
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return what();
	}
 */
