import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public final void testAdd() {
		//fail("Not yet implemented"); //T0D0
		int a = 12344;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,b);
		
		int expected = 9999;
		assertEquals (expected,actual);
	}
	
	@Test
	public final void testSubtract() {
		//fail("Not yet implemented"); //T0D0
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a,b);
		
		int expected = 5555;
		assertEquals(actual, expected);
	}
	
	@Test
	public final void testDivide() {
		//fail("Not yet implemented"); //T0D0
		int a = 90;
		int b = 9;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a,b);
		
		int expected = 10;
		assertEquals(actual, expected);
	}
	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
