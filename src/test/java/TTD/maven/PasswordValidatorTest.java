package TTD.maven;

import static org.junit.Assert.assertTrue;



import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class PasswordValidatorTest 
{
    /**
     * Rigorous Test :-)
     */
    @org.junit.Test
    public void TestPasswordLength()
    {
    	
    	Assert.assertEquals( true, PasswordValidator.isValid("Ahgu11"));
    }
}
