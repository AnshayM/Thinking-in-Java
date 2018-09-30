package unit9;

import unit9.pack3.Processor; 
import unit9.pack3.Apply;;

/**
 * 创建一个类，它有一个方法用于接受一个String类型的参数，生成的结果是该参数中每一对字符进行互换。
 * 对该类进行适配，使它可以用于interfaceprocessor.Apply.process()。
 * 
 * 适配器模式的使用
 * 
 * @author Administrator
 *
 */
public class _9_11_AdapterInterface {
	public String name() {
		return getClass().getSimpleName();
	}

	public String change(String str) {
		char[] chars = str.toCharArray();

		int length = chars.length - 1;
		for (int i = 0; i < length / 2; i++) {
			char a = chars[i];
			chars[i] = chars[length - i];
			chars[length - i] = a;
		}

		StringBuilder builder = new StringBuilder();
		for (char c : chars) {
			builder.append(c);
		}
		return builder.toString();
	}

	public static void main(String[] args) {
		String str = "change this sentences.";
		Apply.process(new StringAdapter(new _9_11_AdapterInterface()), str);
	}
}

// 首先创建适配器，适配器中的代码将接受你所拥有的接口，并产生你所需要的接口
class StringAdapter implements Processor {
	_9_11_AdapterInterface ai;

	public StringAdapter(_9_11_AdapterInterface ai) {
		this.ai = ai;
	}

	@Override
	public String name() {
		return ai.name();
	}

	@Override
	public Object process(Object input) {
		return ai.change((String) input);
	}
}

/*
Output:
Using Processor _9_11_AdapterInterface
.secnetness iht egnahc

bug:
Apply没有正确导包，使用了一个错误的地方的Apply，这个Apply的参数和这个程序要使用的不一致
*/