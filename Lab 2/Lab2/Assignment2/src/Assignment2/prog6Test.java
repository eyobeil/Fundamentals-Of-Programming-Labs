package Assignment2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class prog6Test {

	@Test
	void test() {
		String[] values= {"horse", "dog", "cat", "horse","dog"};
		String[] result=prog6.removeDups(values);
		String[] expectedValues= {"horse", "dog", "cat"};
		for(int i=0;i<result.length;i++) {
			assertTrue(expectedValues[i].equals(result[i]));
		}
		
	}

}
