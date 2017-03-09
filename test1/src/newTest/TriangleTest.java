package newTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
	
	public Triangle tri;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculate() {
		tri = new Triangle(1,1,1);
		assertEquals("equilateral",tri.calculate());
		tri = new Triangle(2,2,3);
		assertEquals("isosceles",tri.calculate());
		tri = new Triangle(2,2,1);
		assertEquals("isosceles",tri.calculate());
		tri = new Triangle(3,4,5);
		assertEquals("scalene",tri.calculate());
		tri = new Triangle(3,5,9);
		assertEquals("Not a triangle",tri.calculate());
	}

}
