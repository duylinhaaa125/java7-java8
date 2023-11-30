package modifier;

public class NonSubClass {
	
	public void test() {
		SameClass sameclass = new SameClass();
		sameclass.publicVariable = 1;
		sameclass.protectedVariable = 2;
		sameclass.defaultVariable = 3;
		// không gọi được private
		
		
	}
	
}
