import java.math.BigInteger;

public class EvenNumTest {

    public static boolean isEven(Object number) {
        BigInteger num = null;
        if (number.toString().length() != 0) {

            if (number instanceof Integer) {
                num = new BigInteger("" + number);

            }
            if (number instanceof BigInteger) {

                num = new BigInteger("" + number);
            }
            if (number instanceof String) {

                num = new BigInteger(number+"");

            }

            if (num.signum() != 1) {   //condition to check weather the number is +ve or -ve;
                num = num.multiply(new BigInteger("-1"));

            }

            if (num.remainder(new BigInteger("2")).compareTo(new BigInteger("0"))==0) {

                return true;


            }
            return false;

        }


        return false;
    }


}
