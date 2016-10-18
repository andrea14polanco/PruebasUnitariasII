package TestPackage;

import static org.junit.Assert.*;

import PaqutePrincipal.ClasePrincipal;

public class Test {
	ClasePrincipal cp = new ClasePrincipal();

	@org.junit.Test
	public void testSum() {
		long n = 5;
		long m = 6;
		assertEquals(cp.suma(n , m), 11);
		
	}

}
