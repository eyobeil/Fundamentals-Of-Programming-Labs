package prob3;
import prob3.BinarySearch;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchTestTrue {

	@Test
	void test() {
		String test="abehkl";
		char te='e';
		boolean expected=true;
		boolean result=new BinarySearch().search(test, te);
	    assertTrue(expected==result);
	   
	}
	
}