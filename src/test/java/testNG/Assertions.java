package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {//validation check points
	
	@Test
	public void parameterA() {
		String actual="Hello World";
		String expected="Hello World";
		
		Assert.assertEquals(actual, expected);
		
	}

}
