package prob3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchTestFalse {

	@Test
	void test() {
			String test1="abehkl";
			char te1='g';
			boolean expected=true;
			boolean result=new BinarySearch().search(test1, te1);
		    assertTrue(expected==result);
	}

}
