package unit5ex;

/*
 * 编写一个含有字符串域的类，并采用实例初始化的方式进行初始化
 * */

class SF{
	SF(){
		System.out.println("StringField");
	}
}

public class _5_15_InstanceInitialization {
	public static void main(String[] args){
		SF sf1;
		SF sf2;
		
		//以下代码块中就是非静态实例初始化
		{
			sf1=new SF();
			sf2=new SF();
		}
	}
}
