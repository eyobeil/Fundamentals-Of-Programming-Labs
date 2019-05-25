package Assignment2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Prog8Test {

	@Test
	void test() {
		int input[]= {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		int result=Prog8.min(input);
		assertEquals(-22,result);
	}

}
