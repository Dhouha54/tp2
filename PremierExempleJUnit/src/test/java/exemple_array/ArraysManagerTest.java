package exemple_array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArraysManagerTest {

	@Test
	void test() {
		//arrange 
		int [] t= {1,2,3};
				
		//act
		int result = ArraysManager.squareSum(t);
				
		//assert
		assertEquals(result, 14);
	}

}
