package modifier.differentpackage;

import modifier.SameClass;

public class SubClass1 extends SameClass{

	public void test() {
		super.publicVariable = 1;
		super.protectedVariable = 2;
		// không gọi được default, 
	
	}
}
