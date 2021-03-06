package unitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ops.Operations;

public class OperationsTest {

	@Test
	public void shouldBeTwoTest() {
		Operations operator = new Operations();

		assertEquals(operator.sum(1, 1), 2);
	}

	@Test
	public void shouldBeFourTest() {
		Operations operator = new Operations();

		assertEquals(operator.mult(2, 2), 4);
	}

	@Test
	public void shouldBeThreeTest() {
		Operations operator = new Operations();

		assertEquals(operator.sust(4, 1), 3);
	}

	@Test
	public void shouldBeOneTest() {
		Operations operator = new Operations();

		assertEquals(operator.div(4, 4), 1);
	}
	
	@Test
	public void shouldBeZeroTest() {
		Operations operator = new Operations();

		assertEquals(operator.div(4, 0), 0);
	}
}
