package exemple_array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SmallestIntegerFinderTest {

	@Test
	void test() {
		//arrange
		int [] t= {8,2,3};
		
		//act
		int result = SmallestIntegerFinder.findSmallestInt(t);
		int result1 = SmallestIntegerFinder.findSmallestInt(t);
				
		//assert
		assertEquals(result, 2);
		assertEquals(result1, 2);
	}

}
