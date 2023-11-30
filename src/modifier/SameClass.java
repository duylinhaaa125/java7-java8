package modifier;

public class SameClass {
	private int privateVariable;
	int defaultVariable;
	protected int protectedVariable;
	public int publicVariable;
	
	public void test() {
		this.publicVariable = 1;
		this.protectedVariable = 2;
		this.defaultVariable = 3;	
		this.privateVariable = 4;
		
	}
	

}
