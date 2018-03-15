package unit5ex;

class Tank{
	boolean isEmpty = false;
	
	void clearTank(){
		isEmpty = true;
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		if(!isEmpty){
			System.out.println("Tank 还没有清空");
		}
	}
	
}

public class _5_12_TankFinalize {
	public static void main(String[] args){
		Tank tank = new Tank();
		tank.clearTank();
		new Tank();
		System.gc();	//系统一般内存不会溢出，不会自己触发内存回收机制，这里强制使用
	}
}
