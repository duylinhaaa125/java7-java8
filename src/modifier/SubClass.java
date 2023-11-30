package modifier;

public class SubClass extends SameClass{
	
	public void test() {
//		super.publicVariable = 1;
		SameClass sameclass =  new SameClass();
		sameclass.publicVariable = 1;
		super.protectedVariable = 2;
		super.defaultVariable = 3;
		// không gọi được private
		
		
		
		
		
		
		
	}
	
}
