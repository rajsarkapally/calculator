package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		Main main = new Main();
		assertEquals(2, main.sum(1, 1));
		assertEquals(4, main.mult(2, 2));
	}

}
