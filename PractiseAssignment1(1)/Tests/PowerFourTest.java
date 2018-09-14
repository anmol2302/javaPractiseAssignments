import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class PowerFourTest {

    PowerFour ob = new PowerFour();

    @Test
    public void testResultforString() {


        assertEquals(true, ob.retValue("-16"));
       // assertEquals(true, ob.retValue("256"));
        //assertEquals(false, ob.retValue("32"));

    }


    @Test
    public void testResultforInteger() {


        assertEquals(true, ob.retValue(256));
        assertEquals(true, ob.retValue(64));
        assertEquals(false, ob.retValue(32));

    }

    @Test
    public void testResultforBigInteger() {


        assertEquals(true, ob.retValue(new BigInteger("-1099511627776")));
        assertEquals(false, ob.retValue(new BigInteger("109951162746")));
        assertEquals(false, ob.retValue(new BigInteger("10995116223365386")));


    }
}
