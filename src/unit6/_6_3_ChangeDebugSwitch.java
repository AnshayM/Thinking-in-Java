package unit6;

import debug.Same;
/**
 * 创建两个包，debug和debugoff，他们都包含同一个相同的类
 * 该类有一个debug()方法。
 * 第一个版本显示发送给控制台的String参数
 * 第二个版本不进行任何操作
 * 
 * 使用import语句将该类导入到一个测试程序中，并示范条件编译效果
 */
//import debugoff.Same;
import debug.Same;

public class _6_3_ChangeDebugSwitch {
	public static void main(String[] args) {
		Same same = new Same();
		same.debug(args);
	}
}

/*
import debugoff.Same;
[Ljava.lang.String;@139a55

import debug.same;
//nothing

 *	
 */
