package unit7;

public class DetergentDelegation {
	private Cleanser cleanser = new Cleanser();

	public DetergentDelegation() {
		// TODO Auto-generated constructor stub
	}

	public void append(String a) {
		cleanser.append(a);	//注意调用的是cleanser的append()
	}

	public void dilute() {
		cleanser.append(" DetergentDelegation.dilute()");
	}

	public void apply() {
		cleanser.append(" DetergentDelegation.apply()");
	}

	public void scrub() {
		cleanser.append(" DetergentDelegation.scrub()");
	}
	
	public String toString(){
		return  cleanser.toString();	//注意调用的也是cleanser的toString
	}
	
	public static void main(String[] args) {
		DetergentDelegation dd=new DetergentDelegation();
		dd.append("...");
		dd.dilute();
		dd.apply();
		dd.scrub();
		System.out.println(dd);	//有了这句话，才会调用toString方法
		Cleanser.main(args);
	}

}
