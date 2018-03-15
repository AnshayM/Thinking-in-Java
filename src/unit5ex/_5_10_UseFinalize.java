package unit5ex;

class FinalizeTest{
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("开始执行finalize");
		super.finalize();
	}
}

public class _5_10_UseFinalize {
	public static void main(String[] args){
		System.out.println("ST");
		FinalizeTest fTest = new FinalizeTest();
		System.out.println("END");
	}
}
