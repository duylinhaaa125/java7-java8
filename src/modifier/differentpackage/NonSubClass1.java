package modifier.differentpackage;

import modifier.SameClass;

public class NonSubClass1{
	public void test() {
		SameClass sameclass = new SameClass();
		sameclass.publicVariable = 1;
		// không gọi được default, protected, private
	}





}
