import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class EvenNumTestTest {

    @Test
    public void checkEvenforInteger(){


        assertEquals(true,EvenNumTest.isEven(2));
        assertEquals(false,EvenNumTest.isEven(3));
        assertEquals(true,EvenNumTest.isEven(-30));



    }

    @Test
    public void checkEvenforString(){


        assertEquals(true,EvenNumTest.isEven("2"));
        assertEquals(false,EvenNumTest.isEven("3"));
        assertEquals(false,EvenNumTest.isEven("-45"));



    }


    @Test
    public void checkEvenforBigInteger(){


        assertEquals(true,EvenNumTest.isEven("-13249878723648932472189391273921862371822392137129843712239812728934147381234567658"));
        assertEquals(true,EvenNumTest.isEven(new BigInteger("31727132983132738973973913791378193871313192")));
        assertEquals(true,EvenNumTest.isEven("0"));



    }

}