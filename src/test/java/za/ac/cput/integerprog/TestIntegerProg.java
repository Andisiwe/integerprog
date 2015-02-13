package za.ac.cput.integerprog;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by student on 2015/02/12.
 */
public class TestIntegerProg extends TestCase {
    public void testInt() throws Exception{
        IntegerProg ip = new IntegerProg();

        Assert.assertEquals(5, ip.myInt());
    }
}
