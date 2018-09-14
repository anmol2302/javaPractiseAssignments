import org.junit.Test;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class CheckPalindromeTest {

    CheckPalindrome obj=new CheckPalindrome();
    @Test
    public void CheckResultForREverseNUmber(){
        BigInteger num=new BigInteger("123");
        BigInteger revNum=new BigInteger("321");
        assertEquals(revNum,obj.reverseNumber(num));
    }

    @Test
    public void checkResultForPalindrome(){
        BigInteger num=new BigInteger("121");
        //assertEquals(false,obj.checkPalindrome(num));
        //assertEquals(false, obj.checkPalindrome(""));
        //assertEquals(false, obj.checkPalindrome("123"));
        //assertEquals(false,obj.checkPalindrome("!@!@@#@###"));
       assertEquals(true,obj.checkPalindrome(num));



    }

}
