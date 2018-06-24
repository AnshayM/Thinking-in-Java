package unit7;

/**
 * Wind继承了Instrument，所以Wind可以使用Instrument的方法。
 * 
 * 同时也不存在任何tune的方法是可以通过Instrument调用的，同时又不存在Wind类中。
 * 
 * tune()方法对Instrument和导出类Wind都起作用
 * 
 * 这种将Wind转换为Instrument引用的方法，称为向上转型。
 * 
 * @author Administrator
 *
 */
class Instrument {
	public void play() {

	}

	static void tune(Instrument i) {
		i.play();
	}
}

/**
 * Wind继承了Instrument，所以Wind可以使用Instrument的方法。
 */
public class Wind extends Instrument {
	public static void main(String[] args) {
		Wind flute = new Wind();
		Instrument.tune(flute); // tune为静态方法，可以直接调用，其实也是生成了Instrument的一个对象。
	}
}
