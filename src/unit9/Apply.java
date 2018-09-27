package unit9;
/**
 * 策略设计模式。这类方法中包含所要执行的算法中固定不变的部分，而“策略”包含变化的部分。
 */
import java.util.Arrays;

class Processor {
	public String name() {
		return getClass().getSimpleName();
	}

	Object process(Object input) {
		return input;
	}
}

class Upcase extends Processor {
	String process(Object input) {
		return ((String) input).toUpperCase();
	}
}

class Downcase extends Processor {
	String process(Object input) {
		return ((String) input).toLowerCase();
	}
}

class Splitter extends Processor {
	String process(Object input) {
		return Arrays.toString(((String) input).split(" "));
	}
}

public class Apply {
	public static void process(Processor p, Object s) {
		System.out.println("Using Processor " + p.name());
		System.out.println(p.process(s));
	}

	public static String s = "Disagreement with beliefs is by definiton incorrect";

	public static void main(String[] args) {
		process(new Upcase(), s);
		process(new Downcase(), s);
		process(new Splitter(), s);
	}
}
