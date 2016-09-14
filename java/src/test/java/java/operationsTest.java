package java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class operationsTest {

	@Test
	public void shouldBeTwoTest() {
		operations operator = new operations();

		assertEquals(operator.sum(1, 1), 2);
	}
	
	@Test
	public void shouldBeFourTest() {
		operations operator = new operations();

		assertEquals(operator.mult(2, 2), 4);
	}
	
	@Test
	public void shouldBeThreeTest() {
		operations operator = new operations();

		assertEquals(operator.sust(4, 1), 3);
	}
}
