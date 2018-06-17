package unit5ex;

import java.util.Arrays;
/*
 * 创建一个String对象数据，为每个元素赋值一个String。用for循环来打印该数组
 * */
public class _5_16_StringArray {
	public static void main(String[]args){
		String [] aStrings=new String[]{
			new String("I"),
			new String("am"),
			new String("String!")
		};
		
		
		for (int i = 0; i < aStrings.length; i++) {
			System.out.println(aStrings[i]);
		}
	}
}
