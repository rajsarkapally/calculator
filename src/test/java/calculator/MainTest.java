package calculator;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		Main main = new Main();
		Assert.assertEquals(2, main.sum(1, 1));
		Assert.assertEquals(4, main.mult(2, 2));
	}

}
