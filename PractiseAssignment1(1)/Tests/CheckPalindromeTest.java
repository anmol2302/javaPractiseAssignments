import org.junit.Test;


import java.math.BigInteger;

import static org.junit.Assert.*;

public class CheckPalindromeTest {

    CheckPalindrome obj=new CheckPalindrome();
    @Test
    public void CheckResultForREverseNUmber(){
        BigInteger num=new BigInteger("1234");
        BigInteger revNum=new BigInteger("4321");
        assertEquals(revNum,obj.reverseNumber(num));
    }

    @Test
    public void checkResultForPalindrome(){
        BigInteger num=new BigInteger("");
        assertEquals(true,obj.checkPalindrome(num));
    }

}