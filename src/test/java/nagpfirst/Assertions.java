package nagpfirst;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	@Test
	public void softAssert() {
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals("false", "false");
		softassert.assertTrue(7>8);
		softassert.assertEquals("false", "false");
		//softassert.assertAll();//it provide detailed result if one of the assertion/Condition fails
		
	}
 @Test
public void hardassertion() {
	Assert.assertEquals("this is true", "this is true");
	Assert.assertTrue(7>4);
	}
}
